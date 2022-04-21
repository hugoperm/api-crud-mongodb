package com.nosql.apimongodb.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="Persona")
@Data
@NoArgsConstructor
public class Persona {
    @Id
    private String id;
    private String nombres;
    private String apellidos;
    private String email;
    private Integer edad;
   
}
