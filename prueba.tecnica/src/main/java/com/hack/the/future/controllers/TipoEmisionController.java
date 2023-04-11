package com.hack.the.future.controllers;

import com.hack.the.future.entities.Anio;
import com.hack.the.future.entities.TipoEmision;
import com.hack.the.future.services.TipoEmisionService;
/*import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/tipo-emision")
//@Api(tags = "Tipos de Emisión")
public class TipoEmisionController {

    @Autowired
    private TipoEmisionService tipoEmisionService;

    /*@ApiOperation(value = "Devuelve un listado de los tipos de emisión en el sistema", response = TipoEmision.class, responseContainer = "List")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No hay tipos de emisión registrados")
    })*/
    @GetMapping
    public List<TipoEmision> listar(){
        return tipoEmisionService.listar();
    }

    /*@ApiOperation(value = "Inserta un tipo de emisión en la base de datos", response = TipoEmision.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Error al realizar la inserción")
    })*/
    @PostMapping
    public TipoEmision insertar(@RequestBody TipoEmision tipoEmision){
        return tipoEmisionService.insertar(tipoEmision);
    }

    /*@ApiOperation(value = "Actualiza la información de un tipo de emisión en la base de datos", response = TipoEmision.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No se encontró el tipo de emisión con el ID especificado")
    })*/
    @PutMapping
    public TipoEmision actualizar(@RequestBody TipoEmision tipoEmision){
        return tipoEmisionService.actualizar(tipoEmision);
    }

    /*@ApiOperation(value = "Elimina un tipo de emisión de la base de datos")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No se encontró el tipo de emisión con el ID especificado")
    })*/
    @DeleteMapping
    public void eliminar(@RequestBody TipoEmision tipoEmision) {
        tipoEmisionService.eliminar(tipoEmision);
    }
}
