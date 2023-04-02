package com.hack.the.future.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "recursos")
public class Recurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rec_id;

    private String rec_descripcion;

    public Recurso(Integer rec_id, String rec_descripcion) {
        this.rec_id = rec_id;
        this.rec_descripcion = rec_descripcion;
    }

    public Integer getRec_id() {
        return rec_id;
    }

    public void setRec_id(Integer rec_id) {
        this.rec_id = rec_id;
    }

    public String getRec_descripcion() {
        return rec_descripcion;
    }

    public void setRec_descripcion(String rec_descripcion) {
        this.rec_descripcion = rec_descripcion;
    }
}
