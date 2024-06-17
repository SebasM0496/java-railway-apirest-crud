package com.sebasmarquez.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sebasmarquez.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    

}
