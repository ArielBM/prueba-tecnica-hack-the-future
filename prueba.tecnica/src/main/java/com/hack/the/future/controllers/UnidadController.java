package com.hack.the.future.controllers;

import com.hack.the.future.entities.Unidad;
import com.hack.the.future.services.UnidadService;
/*import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/unidad")
/*@Api(tags = "Unidades")*/

public class UnidadController {

    @Autowired
    private UnidadService unidadService;

    /*@ApiOperation(value = "Devuelve un listado de las unidades en el sistema", response = Unidad.class, responseContainer = "List")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No hay unidades registrados")
    })*/
    @GetMapping
    public List<Unidad> listar(){
        return unidadService.listar();
    }

    /*@ApiOperation(value = "Inserta una unidad en la base de datos", response = Unidad.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Error al realizar la inserción")
    })*/
    @PostMapping
    public Unidad insertar(@RequestBody Unidad unidad){
        return unidadService.insertar(unidad);
    }

    /*@ApiOperation(value = "Actualiza la información de una unidad en la base de datos", response = Unidad.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No se encontró la unidad con el ID especificado")
    })*/
    @PutMapping
    public Unidad actualizar(@RequestBody Unidad unidad){
        return unidadService.actualizar(unidad);
    }

    /*@ApiOperation(value = "Elimina una unidad de la base de datos")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No se encontró la unidad con el ID especificado")
    })*/
    @DeleteMapping
    public void eliminar(@RequestBody Unidad unidad) {
        unidadService.eliminar(unidad);
    }
}
