package com.hack.the.future.controllers;

import com.hack.the.future.entities.TipoConsumo;
import com.hack.the.future.services.TipoConsumoService;
/*import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/tipo-consumo")
/*@Api(tags = "Tipos de Consumos")*/
public class TipoConsumoController {

    @Autowired
    private TipoConsumoService tipoConsumoService;

    /*@ApiOperation(value = "Devuelve un listado de los tipos de consumos en el sistema", response = TipoConsumo.class, responseContainer = "List")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No hay tipos de consumos registrados")
    })*/
    @GetMapping
    public List<TipoConsumo> listar(){
        return tipoConsumoService.listar();
    }

    /*@ApiOperation(value = "Inserta un tipo de consumo en la base de datos", response = TipoConsumo.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Error al realizar la inserción")
    })*/
    @PostMapping
    public TipoConsumo insertar(@RequestBody TipoConsumo tipoConsumo){
        return tipoConsumoService.insertar(tipoConsumo);
    }

    /*@ApiOperation(value = "Actualiza la información de un tipo de consumo en la base de datos", response = TipoConsumo.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No se encontró el tipo de consumo con el ID especificado")
    })*/
    @PutMapping
    public TipoConsumo actualizar(@RequestBody TipoConsumo tipoConsumo){
        return tipoConsumoService.actualizar(tipoConsumo);
    }

    /*@ApiOperation(value = "Elimina un tipo de consumo de la base de datos")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No se encontró el tipo de consumo con el ID especificado")
    })*/
    @DeleteMapping
    public void eliminar(@RequestBody TipoConsumo tipoConsumo) {
        tipoConsumoService.eliminar(tipoConsumo);
    }
}
