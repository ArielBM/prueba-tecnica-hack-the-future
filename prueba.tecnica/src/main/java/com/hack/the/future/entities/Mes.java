package com.hack.the.future.entities;

import jakarta.persistence.*;

@Entity(name="meses")
public class Mes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="mes_id")
    private Integer mesId;

    @Column(name = "mes_descripcion")
    private String mesDescripcion;

    public Mes() {
    }

    public Mes(String mesDescripcion) {
        this.mesDescripcion = mesDescripcion;
    }

    public Integer getMesId() {
        return mesId;
    }

    public void setMesId(Integer mesId) {
        this.mesId = mesId;
    }

    public String getMesDescripcion() {
        return mesDescripcion;
    }

    public void setMesDescripcion(String mesDescripcion) {
        this.mesDescripcion = mesDescripcion;
    }
}
