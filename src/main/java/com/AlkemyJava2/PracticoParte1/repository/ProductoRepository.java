package com.AlkemyJava2.PracticoParte1.repository;

import com.AlkemyJava2.PracticoParte1.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProductoRepository extends MongoRepository<Producto,String> {

    Optional<Producto> findByNombre(String nombre);
}
