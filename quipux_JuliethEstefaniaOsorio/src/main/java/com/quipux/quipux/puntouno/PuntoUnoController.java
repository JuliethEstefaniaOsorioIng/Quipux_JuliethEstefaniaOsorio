package com.quipux.quipux.puntouno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/punto-uno", produces = MediaType.APPLICATION_JSON_VALUE)
public class PuntoUnoController {

    @Autowired
    private PuntoUnoService service;

    @PostMapping
    public String puntoUno(@RequestBody String dato) throws NumberFormatException {

        Integer numero;

        try {
            numero = Integer.parseInt(dato);
            return service.puntoUno(numero);
        } catch (NumberFormatException e) {
            return "Solo se admiten enteros positivos entre 1 y 100";
        }

    }


}
