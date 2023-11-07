package com.quipux.quipux.puntotres.repository;

import com.quipux.quipux.puntotres.entity.JugadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JugadorRepository extends JpaRepository<JugadorEntity, UUID> {
}
