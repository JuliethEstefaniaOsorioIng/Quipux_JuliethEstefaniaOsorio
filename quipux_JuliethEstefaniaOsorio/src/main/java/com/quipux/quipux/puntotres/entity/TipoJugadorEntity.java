package com.quipux.quipux.puntotres.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "tipo-jugador")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TipoJugadorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, unique = true)
    private UUID id;

    @Column(name = "nombre", nullable = false, unique = true)
    private String nombre;
}
