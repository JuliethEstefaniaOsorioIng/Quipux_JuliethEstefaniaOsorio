package com.quipux.quipux.puntotres.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "jugador")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JugadorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, unique = true)
    private UUID id;

    @Column(name = "nombre", nullable = false, unique = true)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "posicion", referencedColumnName = "id", nullable = false)
    private PosicionEntity posicion;

    @ManyToOne
    @JoinColumn(name = "tipo-jugador", referencedColumnName = "id", nullable = false)
    private TipoJugadorEntity tipo;
}
