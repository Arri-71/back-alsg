package com.proyecto.alsg.services;


import com.proyecto.alsg.entitys.Customer;
import com.proyecto.alsg.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
// servicio como tal de traer los datos de la bd de la tabla customer
@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    //funcion obtener ( estoy mamado de codificar )
    public List<Customer> getAll() {
        return (List<Customer>) repository.findAll();
    }

    @Override
    //funcion obtener por id
    public Customer getById(Long id) {
        return (Customer) repository.findById(id).get();
    }

    @Override
    //funcion eliminar ( casi pongo deletear xd")
    public void remove(Long id) {
        repository.deleteById(id);
    }

    @Override
    //funcion de guardado ( crtl s para los amigos )
    public void save(Customer customer) {
        repository.save(customer);
    }

}
