package com.proyecto.alsg.controllers;

import com.proyecto.alsg.AbstractTest;
import com.proyecto.alsg.Controllers.CustomerController;
import com.proyecto.alsg.Controllers.EmployeeController;
import com.proyecto.alsg.entitys.Customer;
import com.proyecto.alsg.entitys.Employee;
import com.proyecto.alsg.services.CustomerService;
import com.proyecto.alsg.services.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeControllerTest {

    @Mock
    EmployeeService employeeServicee;
    @InjectMocks
    EmployeeController employeeController;
    @Test
    void when_controller_ask_for_all_the_customerslist_bring_that_list(){

        List<Employee> customerList = new ArrayList<>();
        Employee employee1 =  new Employee(1,"Santiago","vera","santiagoarve@unisabana.edu.co","31232861645","cra72a#24-72");
        Employee employee2 = new Employee(2,"Pablo","lugo","pablo@gmail.com","3104567890","cll80 #45");
        customerList.add(customer1);
        customerList.add(customer2);

        Mockito.when(customerService.getAll()).thenReturn(customerList);
        int getAllSize = customerController.getAll().size();
        Mockito.verify(customerService).getAll();
        assertEquals(2,getAllSize);
    }

}
