package com.proyecto.alsg.Controllers;



import com.proyecto.alsg.entitys.Customer;
import com.proyecto.alsg.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private ICustomerService service;

    //traer todos los datos de la tabla customers
    @GetMapping("/api/customers")
    public List<Customer> getAll() {
        return service.getAll();
    }
    //traer los datos por id
    @GetMapping("/api/customers/{id}")
    public Customer getById(Integer customerId) {
        return service.getById(Integer.parseInt(id));
    }
    //borrar los datos por id
    @DeleteMapping("/api/customers/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Long.parseLong(id));
    }
    //guardar los datos por id
    @PostMapping("/api/customers")
    public void save(@RequestBody Customer customer) {
        service.save(customer);
    }

}
