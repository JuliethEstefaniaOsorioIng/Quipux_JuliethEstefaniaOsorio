package com.quipux.quipux.puntotres.repository;

import com.quipux.quipux.puntotres.entity.PosicionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PosicionRepository extends JpaRepository<PosicionEntity, UUID> {
}
