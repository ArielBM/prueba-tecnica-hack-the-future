package com.hack.the.future.controllers;

import com.hack.the.future.entities.Anio;
import com.hack.the.future.entities.Equipo;
import com.hack.the.future.entities.Mes;
import com.hack.the.future.entities.Viaje;
import com.hack.the.future.request.CreateViajeRequest;
import com.hack.the.future.services.AnioService;
import com.hack.the.future.services.EquipoService;
import com.hack.the.future.services.MesService;
import com.hack.the.future.services.ViajeService;
/*import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/viaje")
/*@Api(tags = "Viajes")*/
public class ViajeController {

    @Autowired
    private ViajeService viajeService;
    @Autowired
    private MesService mesService;
    @Autowired
    private AnioService anioService;
    @Autowired
    private EquipoService equipoService;

    /*@ApiOperation(value = "Devuelve un listado de los viajes en el sistema", response = Viaje.class, responseContainer = "List")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No hay viajes registrados")
    })*/
    @GetMapping
    public List<Viaje> listar(){
        return viajeService.listar();
    }

    /*@ApiOperation(value = "Inserta un viaje en la base de datos", response = Viaje.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Error al realizar la inserción")
    })*/
    @PostMapping
    public Viaje insertar(@RequestBody CreateViajeRequest createViajeRequest){
        Mes mes = mesService.obtener(createViajeRequest.getViaMes());
        Anio anio = anioService.obtener(createViajeRequest.getViaAnio());
        Equipo equipo = equipoService.obtener(createViajeRequest.getViaEquipo());
        return viajeService.insertar(new Viaje(
                mes,
                anio,
                equipo,
                createViajeRequest.getViaCantidad()
        ));
    }

    /*@ApiOperation(value = "Actualiza la información de un viaje en la base de datos", response = Viaje.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No se encontró el viaje con el ID especificado")
    })*/
    @PutMapping
    public Viaje actualizar(@RequestBody int viaId){
        Viaje viaje = viajeService.obtener(viaId);
        return viajeService.actualizar(viaje);
    }

    /*@ApiOperation(value = "Elimina un viaje de la base de datos")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No se encontró el viaje con el ID especificado")
    })*/
    @DeleteMapping
    public void eliminar(@RequestBody int viaId){
        Viaje viaje = viajeService.obtener(viaId);
        viajeService.eliminar(viaje);
    }
}
