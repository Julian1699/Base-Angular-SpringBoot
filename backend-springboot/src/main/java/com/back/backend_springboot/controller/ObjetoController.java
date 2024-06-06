package com.back.backend_springboot.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.back.backend_springboot.model.Objeto;
import com.back.backend_springboot.service.ObjetoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/objeto")
@Tag(name = "Objeto", description = "API para la gestión de objetos")
public class ObjetoController {

    @Autowired
    private ObjetoService objetoService;

    @Operation(summary = "Obtener todos los objetos", description = "Devuelve una lista de todos los objetos")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Lista de objetos obtenida exitosamente", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Objeto.class))),
        @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    @GetMapping
    public List<Objeto> getAllObjetos() {
        return objetoService.getAllObjetos();
    }

    @Operation(summary = "Obtener un objeto por ID", description = "Devuelve un objeto basado en su ID")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Objeto obtenido exitosamente", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Objeto.class))),
        @ApiResponse(responseCode = "404", description = "Objeto no encontrado"),
        @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    @GetMapping("/{id}")
    public Objeto getObjetoById(
        @Parameter(description = "ID del objeto a obtener", required = true)
        @PathVariable Long id) {
        return objetoService.getObjetoById(id);
    }

    @Operation(summary = "Crear un nuevo objeto", description = "Crea un nuevo objeto")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Objeto creado exitosamente", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Objeto.class))),
        @ApiResponse(responseCode = "400", description = "Solicitud incorrecta"),
        @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    @PostMapping
    public Objeto createObjeto(
        @Parameter(description = "Objeto a crear. No incluya el ID y la fecha de creación, ya que serán generados automáticamente.", required = true, content = @Content(schema = @Schema(implementation = Objeto.class)))
        @RequestBody Objeto objeto) {
        objeto.setFechaCreacion(LocalDateTime.now());
        return objetoService.saveObjeto(objeto);
    }

    @Operation(summary = "Actualizar un objeto", description = "Actualiza un objeto basado en su ID")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Objeto actualizado exitosamente", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Objeto.class))),
        @ApiResponse(responseCode = "404", description = "Objeto no encontrado"),
        @ApiResponse(responseCode = "400", description = "Solicitud incorrecta"),
        @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    @PutMapping("/{id}")
    public Objeto updateObjeto(
        @Parameter(description = "ID del objeto a actualizar", required = true)
        @PathVariable Long id,
        @Parameter(description = "Detalles del objeto a actualizar", required = true, content = @Content(schema = @Schema(implementation = Objeto.class)))
        @RequestBody Objeto objetoDetails) {
        return objetoService.updateObjeto(id, objetoDetails);
    }

    @Operation(summary = "Eliminar un objeto", description = "Elimina un objeto basado en su ID")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Objeto eliminado exitosamente"),
        @ApiResponse(responseCode = "404", description = "Objeto no encontrado"),
        @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    @DeleteMapping("/{id}")
    public void deleteObjeto(
        @Parameter(description = "ID del objeto a eliminar", required = true)
        @PathVariable Long id) {
        objetoService.deleteObjeto(id);
    }

    @Operation(summary = "Buscar objetos por filtros", description = "Busca objetos basados en los filtros proporcionados")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Objetos filtrados obtenidos exitosamente", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Objeto.class))),
        @ApiResponse(responseCode = "400", description = "Solicitud incorrecta"),
        @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    @GetMapping("/buscar")
    public List<Objeto> findByFilters(
        @Parameter(description = "Nombre del objeto", required = false)
        @RequestParam(required = false) String nombre,
        @Parameter(description = "Descripción del objeto", required = false)
        @RequestParam(required = false) String descripcion,
        @Parameter(description = "Precio del objeto", required = false)
        @RequestParam(required = false) Double precio,
        @Parameter(description = "Fecha de creación del objeto", required = false)
        @RequestParam(required = false) LocalDateTime fechaCreacion) {
        return objetoService.findByFilters(nombre, descripcion, precio, fechaCreacion);
    }
}
