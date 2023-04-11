package com.hack.the.future.entities;

import jakarta.persistence.*;

@Entity(name="equipos")
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="equ_id")
    private Integer equId;

    @Column(name = "equ_descripcion")
    private String equDescripcion;

    public Equipo() {
    }

    public Equipo(String equDescripcion) {
        this.equDescripcion = equDescripcion;
    }

    public Integer getEquId() {
        return equId;
    }

    public void setEquId(Integer equId) {
        this.equId = equId;
    }

    public String getEquDescripcion() {
        return equDescripcion;
    }

    public void setEquDescripcion(String equDescripcion) {
        this.equDescripcion = equDescripcion;
    }
}
