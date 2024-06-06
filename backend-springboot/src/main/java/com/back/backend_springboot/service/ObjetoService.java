package com.back.backend_springboot.service;

import com.back.backend_springboot.utils.ResourceNotFoundException;
import com.back.backend_springboot.model.Objeto;
import com.back.backend_springboot.repository.ObjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ObjetoService {

    @Autowired
    private ObjetoRepository objetoRepository;

    public List<Objeto> getAllObjetos() {
        return objetoRepository.findAll();
    }

    public Objeto getObjetoById(Long id) {
        return objetoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Objeto not found with id " + id));
    }

    public Objeto saveObjeto(Objeto objeto) {
        return objetoRepository.save(objeto);
    }

    public Objeto updateObjeto(Long id, Objeto objetoDetails) {
        Objeto objeto = getObjetoById(id);
        objeto.setNombre(objetoDetails.getNombre());
        objeto.setDescripcion(objetoDetails.getDescripcion());
        objeto.setPrecio(objetoDetails.getPrecio());
        objeto.setFechaCreacion(objetoDetails.getFechaCreacion());
        return saveObjeto(objeto);
    }

    public void deleteObjeto(Long id) {
        Objeto objeto = getObjetoById(id);
        objetoRepository.delete(objeto);
    }

    public List<Objeto> findByFilters(String nombre, String descripcion, Double precio, LocalDateTime fechaCreacion) {
        return objetoRepository.findByFilters(nombre, descripcion, precio, fechaCreacion);
    }
}