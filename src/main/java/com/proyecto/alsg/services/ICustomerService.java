package com.proyecto.alsg.services;


import com.proyecto.alsg.entitys.Customer;

import java.util.List;
// interface para la inyeccion de dependencias de buena manera
public interface ICustomerService {

        List<Customer> getAll();
        Customer getById(Long id);
        void remove(Long id);
        void save(Customer customer);
    }


