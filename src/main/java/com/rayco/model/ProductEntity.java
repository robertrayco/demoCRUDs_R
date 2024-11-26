package com.rayco.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "producto")
public class ProductEntity {

    @Id
    private String id;
    private String productoNombre;
    private String descripcion;
    private int stock;
    private double precio;

}
