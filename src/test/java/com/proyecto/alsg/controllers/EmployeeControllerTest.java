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
    EmployeeService employeeService;
    @InjectMocks
    EmployeeController employeeController;
    @Test
    void when_controller_ask_for_all_the_employeelist_bring_that_list(){
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 =  new Employee(1,"Santiago","vera","santiagoarve@unisabana.edu.co","31232861645","cra72a#24-72",1000.00);
        Employee employee2 = new Employee(2,"Pablo","lugo","pablo@gmail.com","3104567890","cll80 #45",1000.00);
        employeeList.add(employee1);
        employeeList.add(employee2);

        Mockito.when(employeeService.getAll()).thenReturn(employeeList);
        int getAllSize = employeeController.getAll().size();
        Mockito.verify(employeeService).getAll();
        assertEquals(2,getAllSize);
    }



}
