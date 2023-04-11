package com.hack.the.future.controllers;

import com.hack.the.future.entities.Equipo;
import com.hack.the.future.services.EquipoService;
/*import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/equipo")
//@Api(tags = "Equipós")
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    /*@ApiOperation(value = "Devuelve un listado de los equipos en el sistema", response = Equipo.class, responseContainer = "List")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No hay equipos registrados")
    })*/
    @GetMapping
    public List<Equipo> listar(){
        EquipoController empleadoService;
        return equipoService.listar();
    }

    /*@ApiOperation(value = "Inserta un equipo en la base de datos", response = Equipo.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Error al realizar la inserción")
    })*/
    @PostMapping
    public Equipo insertar(@RequestBody Equipo equipo){
        return equipoService.insertar(equipo);
    }

    /*@ApiOperation(value = "Actualiza la información de un equipo en la base de datos", response = Equipo.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No se encontró el equipo con el ID especificado")
    })*/
    @PutMapping
    public Equipo actualizar(@RequestBody Equipo equipo){
        return equipoService.actualizar(equipo);
    }

    /*@ApiOperation(value = "Elimina un equipo de la base de datos")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No se encontró el equipo con el ID especificado")
    })*/
    @DeleteMapping
    public void eliminar(@RequestBody Equipo equipo) {
        equipoService.eliminar(equipo);
    }
}
