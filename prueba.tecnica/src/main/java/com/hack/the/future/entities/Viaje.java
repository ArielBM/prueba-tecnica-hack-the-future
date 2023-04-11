package com.hack.the.future.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name="viajes")
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="via_id")
    private Integer viaId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "via_mes", nullable = false)
    @JsonIgnore
    private Mes viaMes;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "via_anio", nullable = false)
    @JsonIgnore
    private Anio viaAnio;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "via_equipo", nullable = false)
    @JsonIgnore
    private Equipo viaEquipo;

    @Column(name = "via_cantidad")
    private int viaCantidad;

    public Viaje() {
    }

    public Viaje(Mes viaMes, Anio viaAnio, Equipo viaEquipo, int viaCantidad) {
        this.viaMes = viaMes;
        this.viaAnio = viaAnio;
        this.viaEquipo = viaEquipo;
        this.viaCantidad = viaCantidad;
    }
}
