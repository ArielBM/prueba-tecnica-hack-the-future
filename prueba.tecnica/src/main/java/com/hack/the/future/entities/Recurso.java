package com.hack.the.future.entities;

import jakarta.persistence.*;

@Entity(name="recursos")
public class Recurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="rec_id")
    private Integer recId;

    @Column(name = "rec_descripcion")
    private String recDescripcion;

    public Recurso() { }

    public Recurso(String recDescripcion) {
        this.recDescripcion = recDescripcion;
    }

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public String getRecDescripcion() {
        return recDescripcion;
    }

    public void setRecDescripcion(String recDescripcion) {
        this.recDescripcion = recDescripcion;
    }
}
