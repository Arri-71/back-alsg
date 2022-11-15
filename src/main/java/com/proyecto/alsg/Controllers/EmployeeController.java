package com.proyecto.alsg.Controllers;

import com.proyecto.alsg.entitys.Customer;
import com.proyecto.alsg.entitys.Employee;
import com.proyecto.alsg.services.ICustomerService;
import com.proyecto.alsg.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class EmployeeController {
    @Autowired
    private IEmployeeService service;

    //traer todos los datos de la tabla customers
    @GetMapping("/api/employees")
    public List<Employee> getAll() {
        return service.getAll();
    }
    //traer los datos por id
    @GetMapping("/api/employees/{id}")
    public Employee getById(@PathVariable String id) {
        return service.getById(Long.parseLong(id));
    }
    //borrar los datos por id
    @DeleteMapping("/api/employees/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Long.parseLong(id));
    }
    //guardar los datos por id
    @PostMapping("/api/employees")
    public void save(@RequestBody Employee employee) {
        service.save(employee);
    }
}
