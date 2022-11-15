package com.proyecto.alsg.entitys;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "employees")
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String address;
    private Double salary;


    public Employee(long id, String firstname, String lastname, String email, String phone, String address, Double salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }
}



