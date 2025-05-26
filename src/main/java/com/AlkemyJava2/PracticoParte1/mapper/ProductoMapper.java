package com.AlkemyJava2.PracticoParte1.mapper;

import com.AlkemyJava2.PracticoParte1.dto.ProductoDTO;
import com.AlkemyJava2.PracticoParte1.model.Producto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
    ProductoDTO toDto(Producto producto);
    Producto toEntity(ProductoDTO productoDTO);
}
