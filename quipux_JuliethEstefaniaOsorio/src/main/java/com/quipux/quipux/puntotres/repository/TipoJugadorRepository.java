package com.quipux.quipux.puntotres.repository;

import com.quipux.quipux.puntotres.entity.TipoJugadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TipoJugadorRepository extends JpaRepository<TipoJugadorEntity, UUID> {
}
