package com.quipux.quipux.puntotres.repository;

import com.quipux.quipux.puntotres.entity.EquipoEntity;
import com.quipux.quipux.puntotres.entity.PosicionEntity;
import com.quipux.quipux.puntotres.entity.TipoJugadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface EquipoRepository extends JpaRepository<EquipoEntity, UUID> {

    @Query("select e.nombre as Nombre_del_equipo," +
            "e.cantidadTitulos as Cantidad_de_titulos, " +
            "(select count(e2.jugador) from EquipoEntity e2 where e2.nombre = e.nombre) as" +
            " Cantidad_de_jugadores from EquipoEntity e")
    List<String[]> reporteBasico();

    @Query("select e.nombre, j.nombre, tj.nombre, p.nombre from EquipoEntity e " +
            "inner join JugadorEntity j on j.id = e.jugador.id " +
            "inner join TipoJugadorEntity tj on tj.id = j.tipo.id " +
            "inner join PosicionEntity p on p.id = j.posicion.id")
    List<String[]> informeEquipoDetallado();
}
