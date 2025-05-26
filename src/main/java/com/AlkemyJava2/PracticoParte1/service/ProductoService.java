package com.AlkemyJava2.PracticoParte1.service;

import com.AlkemyJava2.PracticoParte1.dto.ProductoDTO;
import com.AlkemyJava2.PracticoParte1.model.Producto;

import java.util.List;

public interface ProductoService {
    ProductoDTO crearProducto(ProductoDTO productoDTO);
    ProductoDTO obtenerPorId(String id);
    List<ProductoDTO> listarProducto();
    void eliminarProducto(String id);
    ProductoDTO obtenerPorNombre(String nombre);
}
