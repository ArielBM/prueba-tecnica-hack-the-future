package com.hack.the.future.controllers;

import com.hack.the.future.entities.Mes;
import com.hack.the.future.services.MesService;
/*import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/mes")
/*@Api(tags = "Meses")*/
public class MesController {

    @Autowired
    private MesService mesService;

    /*@ApiOperation(value = "Devuelve un listado de los meses", response = Mes.class, responseContainer = "List")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No hay años registrados")
    })*/
    @GetMapping
    public List<Mes> listar(){
        return mesService.listar();
    }

    /*@ApiOperation(value = "Inserta un mes en la base de datos", response = Mes.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Error al realizar la inserción")
    })*/
    @PostMapping
    public Mes insertar(@RequestBody Mes mes){
        return mesService.insertar(mes);
    }

    /*@ApiOperation(value = "Actualiza la información de un mes en la base de datos", response = Mes.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No se encontró el mes con el ID especificado")
    })*/
    @PutMapping
    public Mes actualizar(@RequestBody Mes mes){
        return mesService.actualizar(mes);
    }

    /*@ApiOperation(value = "Elimina un mes de la base de datos")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No se encontró el mes con el ID especificado")
    })*/
    @DeleteMapping
    public void eliminar(@RequestBody Mes mes) {
        mesService.eliminar(mes);
    }
}
