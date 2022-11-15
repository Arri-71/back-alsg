package com.proyecto.alsg.Controllers;


import com.proyecto.alsg.entitys.Customer;
import com.proyecto.alsg.entitys.Employee;
import com.proyecto.alsg.entitys.Supplier;
import com.proyecto.alsg.services.ICustomerService;
import com.proyecto.alsg.services.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class SupplierController {
    @Autowired
    private ISupplierService service;

    //traer todos los datos de la tabla customers
    @GetMapping("/api/suppliers")
    public List<Supplier> getAll() {
        return service.getAll();
    }
    //traer los datos por id
    @GetMapping("/api/suppliers/{id}")
    public Supplier getById(@PathVariable String id) {
        return service.getById(Long.parseLong(id));
    }
    //borrar los datos por id
    @DeleteMapping("/api/suppliers/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Long.parseLong(id));
    }
    //guardar los datos por id
    @PostMapping("/api/suppliers")
    public void save(@RequestBody Supplier supplier) {
        service.save(supplier);
    }
}
