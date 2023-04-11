package com.hack.the.future.entities;

import jakarta.persistence.*;

@Entity
@Table(name="anios")
public class Anio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ani_id")
    private int aniId;

    @Column(name = "ani_descripcion")
    private String aniDescripcion;

    public Anio() {
    }

    public Anio(String aniDescripcion) {
        this.aniDescripcion = aniDescripcion;
    }

    public int getAniId() {
        return aniId;
    }

    public void setAniId(int aniId) {
        this.aniId = aniId;
    }

    public String getAniDescripcion() {
        return aniDescripcion;
    }

    public void setAniDescripcion(String aniDescripcion) {
        this.aniDescripcion = aniDescripcion;
    }
}
