package com.proyecto.alsg.controllers;


import com.proyecto.alsg.AbstractTest;
import com.proyecto.alsg.Controllers.CustomerController;
import com.proyecto.alsg.services.CustomerService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerControllerTest extends AbstractTest {


    @Mock
    CustomerService customerService;
    @InjectMocks
    CustomerController customerController;


    @Test
    void prueba_1(){

        Mockito.when(customerService.getAll()).thenReturn();
        int getAllSize = customerController.getAll().size();
        Mockito.verify(customerService).getAll();
        assertEquals(2,getAllSize);
    }


}
