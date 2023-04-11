package com.hack.the.future.entities;

import jakarta.persistence.*;

@Entity(name="unidades")
public class Unidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="uni_id")
    private Integer uniId;

    @Column(name = "uni_abrevitatura")
    private String uniAbrevitatura;

    @Column(name = "uni_descripcion")
    private String uniDescripcion;

    public Unidad() {
    }

    public Unidad(String uniAbrevitatura, String uniDescripcion) {
        this.uniAbrevitatura = uniAbrevitatura;
        this.uniDescripcion = uniDescripcion;
    }

    public Integer getUniId() {
        return uniId;
    }

    public void setUniId(Integer uniId) {
        this.uniId = uniId;
    }

    public String getUniAbrevitatura() {
        return uniAbrevitatura;
    }

    public void setUniAbrevitatura(String uniAbrevitatura) {
        this.uniAbrevitatura = uniAbrevitatura;
    }

    public String getUniDescripcion() {
        return uniDescripcion;
    }

    public void setUniDescripcion(String uniDescripcion) {
        this.uniDescripcion = uniDescripcion;
    }
}
