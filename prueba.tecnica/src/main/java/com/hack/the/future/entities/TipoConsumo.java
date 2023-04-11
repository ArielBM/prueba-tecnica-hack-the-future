package com.hack.the.future.entities;

import jakarta.persistence.*;

@Entity(name="tipo_consumo")
public class TipoConsumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="tco_id")
    private Integer tcoId;

    @Column(name = "tco_descripcion")
    private String tcoDescripcion;

    public TipoConsumo() {
    }

    public TipoConsumo(String tcoDescripcion) {
        this.tcoDescripcion = tcoDescripcion;
    }

    public Integer getTcoId() {
        return tcoId;
    }

    public void setTcoId(Integer tcoId) {
        this.tcoId = tcoId;
    }

    public String getTcoDescripcion() {
        return tcoDescripcion;
    }

    public void setTcoDescripcion(String tcoDescripcion) {
        this.tcoDescripcion = tcoDescripcion;
    }
}
