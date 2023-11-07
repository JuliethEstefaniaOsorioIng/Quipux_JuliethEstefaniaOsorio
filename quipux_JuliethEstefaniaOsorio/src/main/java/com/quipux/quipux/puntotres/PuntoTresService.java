package com.quipux.quipux.puntotres;

import com.quipux.quipux.puntotres.entity.*;
import com.quipux.quipux.puntotres.repository.EquipoRepository;
import com.quipux.quipux.puntotres.repository.JugadorRepository;
import com.quipux.quipux.puntotres.repository.PosicionRepository;
import com.quipux.quipux.puntotres.repository.TipoJugadorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PuntoTresService {

    private EquipoRepository repository;

    private TipoJugadorRepository tipoJugadorRepository;

    private PosicionRepository posicionRepository;

    private JugadorRepository jugadorRepository;

    public void agregarEquipo(EquipoEntity equipo) {

        var tipoJugador = tipoJugadorRepository.save(TipoJugadorEntity.builder()
                .nombre(equipo.getJugador().getTipo().getNombre()).build());

        var posicion = posicionRepository.save(PosicionEntity.builder()
                .nombre(equipo.getJugador().getPosicion().getNombre()).build());

        var jugador = jugadorRepository.save(JugadorEntity.builder()
                .nombre(equipo.getJugador().getNombre()).tipo(tipoJugador)
                .posicion(posicion).build());

        repository.save(EquipoEntity.builder().nombre(equipo.getNombre()).estadio(equipo.getEstadio())
                .cantidadTitulos(equipo.getCantidadTitulos()).jugador(jugador).build());
    }

    public List<String[]> informeEquipoBasico() {

        return repository.reporteBasico();
    }

    public List<String[]> informeEquipoDetallado(){
        return repository.informeEquipoDetallado();
    }
}
