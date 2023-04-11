package com.hack.the.future.controllers;

import com.hack.the.future.entities.Anio;
import com.hack.the.future.services.AnioService;
/*import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/anio")
/*@Api(tags = "Años")*/
public class AnioController {

    @Autowired
    private AnioService anioService;

    /*@ApiOperation(value = "Devuelve un listado de los años en el sistema", response = Anio.class, responseContainer = "List")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No hay años registrados")
    })*/
    @GetMapping
    public List<Anio> listar(){
        return anioService.listar();
    }

    /*@ApiOperation(value = "Inserta un año en la base de datos", response = Anio.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Error al realizar la inserción")
    })*/
    @PostMapping
    public Anio insertar(@RequestBody Anio anio){
        return anioService.insertar(anio);
    }

    /*@ApiOperation(value = "Actualiza la información de un año en la base de datos", response = Anio.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No se encontró el año con el ID especificado")
    })*/
    @PutMapping
    public Anio actualizar(@RequestBody Anio anio){
        return anioService.actualizar(anio);
    }

    /*@ApiOperation(value = "Elimina un año de la base de datos")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No se encontró el año con el ID especificado")
    })*/
    @DeleteMapping
    public void eliminar(@RequestBody Anio anio) {
        anioService.eliminar(anio);
    }
}
