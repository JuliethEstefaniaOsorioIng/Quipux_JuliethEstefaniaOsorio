package com.quipux.quipux.puntodos;

import com.quipux.quipux.puntouno.PuntoUnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/punto-dos", produces = MediaType.APPLICATION_JSON_VALUE)
public class PuntoDosController {

    @Autowired
    private PuntoDosService service;

    @PostMapping
    public String puntoUno(@RequestParam("horas") String hr, @RequestParam("minutos") String min)
            throws NumberFormatException {

        Integer horas;
        Integer minutos;

        try {
            horas = Integer.parseInt(hr);
            minutos = Integer.parseInt(min);
            return service.puntoDos(horas, minutos);
        } catch (NumberFormatException e) {
            return "Solo se admiten enteros positivos entre 1 y 11 para las horas," +
                    " 0 y 59 para los minutos";
        }

    }
}
