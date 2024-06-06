package com.back.backend_springboot.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.back.backend_springboot.model.Objeto;

@Repository
public interface ObjetoRepository extends JpaRepository <Objeto, Long> {
        @Query(value = "SELECT * FROM Objeto o WHERE " +
            "(:nombre IS NULL OR o.nombre LIKE %:nombre%) AND " +
            "(:descripcion IS NULL OR o.descripcion LIKE %:descripcion%) AND " +
            "(:precio IS NULL OR o.precio = :precio) AND " +
            "(:fechaCreacion IS NULL OR o.fecha_creacion = :fechaCreacion)", nativeQuery = true)
    List<Objeto> findByFilters(@Param("nombre") String nombre,
                               @Param("descripcion") String descripcion,
                               @Param("precio") Double precio,
                               @Param("fechaCreacion") LocalDateTime fechaCreacion);
}
