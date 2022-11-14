package com.proyecto.alsg.entitys;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name = "customers")
@ToString
@EqualsAndHashCode

//declaracion de la entidad de customer con las mismas "columnas" que la bd
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String address;


}
