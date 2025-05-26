package com.AlkemyJava2.PracticoParte1.controller;

import com.AlkemyJava2.PracticoParte1.dto.ProductoDTO;
import com.AlkemyJava2.PracticoParte1.service.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@RequiredArgsConstructor
public class ProductoController {

    private final ProductoService productoService;

    @GetMapping
    public ResponseEntity<List<ProductoDTO>> listarTodos() {
        List<ProductoDTO> lista = productoService.listarProducto();
        return ResponseEntity.ok(lista);
    }

    @PostMapping
    public ResponseEntity<ProductoDTO> crearProducto(@RequestBody ProductoDTO productoDTO){
        ProductoDTO creado = productoService.crearProducto(productoDTO);
        return ResponseEntity.ok(creado);
    }
}
