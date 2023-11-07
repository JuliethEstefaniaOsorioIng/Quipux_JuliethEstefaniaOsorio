package com.quipux.quipux.puntotres.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "equipo")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EquipoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, unique = true)
    private UUID id;

    @Column(name = "nombre", nullable = false, unique = true)
    private String nombre;

    @Column(name = "estadio", nullable = false, unique = true)
    private String estadio;

    @Column(name = "cantidad-titulos", nullable = false, unique = true)
    private Integer cantidadTitulos;

    @ManyToOne
    @JoinColumn(name = "jugador", referencedColumnName = "id", nullable = false)
    private JugadorEntity jugador;

}
