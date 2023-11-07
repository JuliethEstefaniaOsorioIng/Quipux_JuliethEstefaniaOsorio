package com.quipux.quipux.puntotres;

import com.quipux.quipux.puntotres.entity.EquipoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/punto-tres", produces = MediaType.APPLICATION_JSON_VALUE)
public class PuntoTresController {

    @Autowired
    private PuntoTresService service;

    @GetMapping("/reporte-basico")
    public List<String[]> informeEquipoBasico() {
        return service.informeEquipoBasico();
    }

    @PostMapping
    public void agregarEquipo(@Validated @RequestBody EquipoEntity equipo) {
        service.agregarEquipo(equipo);
    }

    @GetMapping("/reporte-detallado")
    public List<String[]> informeEquipoDetallado() {
        return service.informeEquipoDetallado();
    }
}
