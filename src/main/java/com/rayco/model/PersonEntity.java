package com.rayco.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "persona")
public class PersonEntity {

    @Id
    private String id;
    private  String nombre;
    private String apellidos;
    private int edad;

}
