package com.AlkemyJava2.PracticoParte1.service.impl;


import com.AlkemyJava2.PracticoParte1.dto.ProductoDTO;
import com.AlkemyJava2.PracticoParte1.mapper.ProductoMapper;
import com.AlkemyJava2.PracticoParte1.model.Producto;
import com.AlkemyJava2.PracticoParte1.repository.ProductoRepository;
import com.AlkemyJava2.PracticoParte1.service.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;
    private final ProductoMapper productoMapper;

    @Override
    public ProductoDTO crearProducto(ProductoDTO productoDTO) {
        Producto producto = productoMapper.toEntity(productoDTO);
        Producto productoGuardardo = productoRepository.save(producto);
        return productoMapper.toDto(productoGuardardo);
    }

    @Override
    public ProductoDTO obtenerPorId(String id) {
        Producto producto = productoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado con id: " + id));
        return productoMapper.toDto(producto);
    }

    @Override
    public List<ProductoDTO> listarProducto() {
        return productoRepository.findAll()
                .stream()
                .map(productoMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public void eliminarProducto(String id) {

    }

    @Override
    public ProductoDTO obtenerPorNombre(String nombre) {
        Producto producto = productoRepository.findByNombre(nombre)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado con nombre: " + nombre));
        return productoMapper.toDto(producto);
    }
}
