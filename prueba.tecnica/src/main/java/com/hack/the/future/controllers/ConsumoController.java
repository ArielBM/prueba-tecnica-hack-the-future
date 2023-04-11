package com.hack.the.future.controllers;

import com.hack.the.future.entities.Consumo;
import com.hack.the.future.request.CreateConsumoRequest;
import com.hack.the.future.services.*;
/*import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/consumo")
/*@Api(tags = "Consumos")*/
public class ConsumoController {
    @Autowired
    private AnioService anioService;
    @Autowired
    private ConsumoService consumoService;
    @Autowired
    private EquipoService equipoService;
    @Autowired
    private MesService mesService;
    @Autowired
    private RecursoService recursoService;
    @Autowired
    private TipoConsumoService tipoConsumoService;
    @Autowired
    private TipoEmisionService tipoEmisionService;
    @Autowired
    private UnidadService unidadService;

    /*@ApiOperation(value = "Devuelve un listado de los consumos realizados", response = Consumo.class, responseContainer = "List")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No hay consumos registrados")
    })*/
    @GetMapping
    public List<Consumo> listar(){
        return consumoService.listar();
    }

    /*@ApiOperation(value = "Inserta un consumo en la base de datos", response = Consumo.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Error al realizar la inserción")
    })*/
    @PostMapping
    public Consumo insertar(@RequestBody CreateConsumoRequest consumoRequest){
        Consumo consumo = new Consumo(
                recursoService.obtener(consumoRequest.getConRecurso()),
                consumoRequest.getConCantidad(),
                unidadService.obtener(consumoRequest.getConUnidades()),
                mesService.obtener(consumoRequest.getConMes()),
                anioService.obtener(consumoRequest.getConAnio()),
                equipoService.obtener(consumoRequest.getConEquipo()),
                tipoEmisionService.obtener(consumoRequest.getConTipoEmision()),
                tipoConsumoService.obtener(consumoRequest.getConTipoConsumo())
        );
        return consumoService.insertar(consumo);
    }

    /*@ApiOperation(value = "Actualiza la información de un consumo en la base de datos", response = Consumo.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No se encontró el consumo con el ID especificado")
    })*/
    @PutMapping
    public Consumo actualizar(@RequestBody int conId){
        Consumo consumo = consumoService.obtener(conId);
        return consumoService.actualizar(consumo);
    }

    /*@ApiOperation(value = "Elimina un consumo de la base de datos")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "No se encontró el consumo con el ID especificado")
    })*/
    @DeleteMapping
    public void eliminar(@RequestBody int conId) {
        Consumo consumo = consumoService.obtener(conId);
        consumoService.eliminar(consumo);
    }
}
