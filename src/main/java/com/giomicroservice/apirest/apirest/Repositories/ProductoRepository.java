package com.giomicroservice.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giomicroservice.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
