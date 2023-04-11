package com.hack.the.future.request;

import lombok.Data;

@Data
public class CreateViajeRequest {
    private int viaMes;
    private int viaAnio;
    private int viaEquipo;
    private int viaCantidad;

}
