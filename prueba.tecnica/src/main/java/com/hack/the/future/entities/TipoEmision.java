package com.hack.the.future.entities;

import jakarta.persistence.*;
@Entity(name="tipo_emisiones")
public class TipoEmision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="tem_id")
    private Integer temId;

    @Column(name = "tem_descripcion")
    private String temDescripcion;

    public TipoEmision() {
    }

    public TipoEmision(String temDescripcion) {
        this.temDescripcion = temDescripcion;
    }

    public Integer getTemId() {
        return temId;
    }

    public void setTemId(Integer temId) {
        this.temId = temId;
    }

    public String getTemDescripcion() {
        return temDescripcion;
    }

    public void setTemDescripcion(String temDescripcion) {
        this.temDescripcion = temDescripcion;
    }
}
