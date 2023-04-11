package com.hack.the.future.entities;

import jakarta.persistence.*;
@Entity(name="consumos")
public class Consumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="con_id")
    private Integer conId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "con_recurso", nullable = false)
    private Recurso conRecurso;

    @Column(name = "con_cantidad")
    private double conCantidad;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "con_unidades", nullable = false)
    private Unidad conUnidad;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "con_mes", nullable = false)
    private Mes conMes;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "con_anio", nullable = false)
    private Anio conAnio;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "con_equipo", nullable = false)
    private Equipo conEquipo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "con_tipo_emision", nullable = false)
    private TipoEmision conTipoEmision;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "con_tipo_consumo", nullable = false)
    private TipoConsumo conTipoConsumo;

    public Consumo() {
    }

    public Consumo(Recurso conRecurso, double conCantidad, Unidad conUnidad, Mes conMes, Anio conAnio, Equipo conEquipo, TipoEmision conTipoEmision, TipoConsumo conTipoConsumo) {
        this.conRecurso = conRecurso;
        this.conCantidad = conCantidad;
        this.conUnidad = conUnidad;
        this.conMes = conMes;
        this.conAnio = conAnio;
        this.conEquipo = conEquipo;
        this.conTipoEmision = conTipoEmision;
        this.conTipoConsumo = conTipoConsumo;
    }


    public Integer getConId() {
        return conId;
    }

    public void setConId(Integer conId) {
        this.conId = conId;
    }

    public Recurso getConRecurso() {
        return conRecurso;
    }

    public void setConRecurso(Recurso conRecurso) {
        this.conRecurso = conRecurso;
    }

    public double getConCantidad() {
        return conCantidad;
    }

    public void setConCantidad(double conCantidad) {
        this.conCantidad = conCantidad;
    }

    public Unidad getConUnidad() {
        return conUnidad;
    }

    public void setConUnidad(Unidad conUnidad) {
        this.conUnidad = conUnidad;
    }

    public Mes getConMes() {
        return conMes;
    }

    public void setConMes(Mes conMes) {
        this.conMes = conMes;
    }

    public Anio getConAnio() {
        return conAnio;
    }

    public void setConAnio(Anio conAnio) {
        this.conAnio = conAnio;
    }

    public Equipo getConEquipo() {
        return conEquipo;
    }

    public void setConEquipo(Equipo conEquipo) {
        this.conEquipo = conEquipo;
    }

    public TipoEmision getConTipoEmision() {
        return conTipoEmision;
    }

    public void setConTipoEmision(TipoEmision conTipoEmision) {
        this.conTipoEmision = conTipoEmision;
    }

    public TipoConsumo getConTipoConsumo() {
        return conTipoConsumo;
    }

    public void setConTipoConsumo(TipoConsumo conTipoConsumo) {
        this.conTipoConsumo = conTipoConsumo;
    }
}
