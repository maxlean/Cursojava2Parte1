package com.AlkemyJava2.PracticoParte1.dto;

import com.AlkemyJava2.PracticoParte1.model.Color;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Set;
@Data
public class ProductoDTO {
    private String id;
    private String nombre;
    private double precio;
    private boolean esStock;
    private Set<Color> colores;
}
