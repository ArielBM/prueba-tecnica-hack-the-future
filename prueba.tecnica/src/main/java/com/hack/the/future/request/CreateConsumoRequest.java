package com.hack.the.future.request;

import lombok.Data;

@Data
public class CreateConsumoRequest {

    private int conRecurso;
    private double conCantidad;
    private int conUnidades;
    private int conMes;
    private int conAnio;
    private int conEquipo;
    private int conTipoEmision;
    private int conTipoConsumo;

}
