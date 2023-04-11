package com.hack.the.future.controllers;

import com.hack.the.future.entities.Recurso;
import com.hack.the.future.services.RecursoService;
/*import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/recurso")
//@Api(tags = "Recursos")
public class RecursoController {

    @Autowired
    private RecursoService recursoService;

    /*@ApiOperation(value = "Devuelve un listado de los recursos en el sistema", response = Recurso.class, responseContainer = "List")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No hay recursos registrados")
    })*/
    @GetMapping
    public List<Recurso> listar(){
        return recursoService.listar();
    }

    /*@ApiOperation(value = "Inserta un recurso en la base de datos", response = Recurso.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Error al realizar la inserción")
    })*/
    @PostMapping
    public Recurso insertar(@RequestBody Recurso recurso){
        return recursoService.insertar(recurso);
    }

    /*@ApiOperation(value = "Actualiza la información de un recurso en la base de datos", response = Recurso.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No se encontró el recurso con el ID especificado")
    })*/
    @PutMapping
    public Recurso actualizar(@RequestBody Recurso recurso){
        return recursoService.actualizar(recurso);
    }

    /*@ApiOperation(value = "Elimina un recurso de la base de datos")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No se encontró el recurso con el ID especificado")
    })*/
    @DeleteMapping
    public void eliminar(@RequestBody Recurso recurso) {
        recursoService.eliminar(recurso);
    }
}
