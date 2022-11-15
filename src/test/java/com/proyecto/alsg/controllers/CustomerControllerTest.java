package com.proyecto.alsg.controllers;


import com.proyecto.alsg.AbstractTest;
import com.proyecto.alsg.Controllers.CustomerController;
import com.proyecto.alsg.entitys.Customer;
import com.proyecto.alsg.services.CustomerService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerControllerTest extends AbstractTest {


    @Mock
    CustomerService customerService;
    @InjectMocks
    CustomerController customerController;


    @Test
    void when_controller_ask_for_all_the_customerslist_bring_that_list(){

        List<Customer> customerList = new ArrayList<>();
        Customer customer1 =  new Customer(1,"Santiago","vera","santiagoarve@unisabana.edu.co","31232861645","cra72a#24-72");
        Customer customer2 = new Customer(2,"Pablo","lugo","pablo@gmail.com","3104567890","cll80 #45");
        customerList.add(customer1);
        customerList.add(customer2);

        Mockito.when(customerService.getAll()).thenReturn(customerList);
        int getAllSize = customerController.getAll().size();
        Mockito.verify(customerService).getAll();
        assertEquals(2,getAllSize);
    }

   @Test
   void when_controller_ask_for_a_customer_by_id_obtain_the_customer(){
      Customer customer = new Customer(1,"Santiago","vera","santiagoarve@unisabana.edu.co","31232861645","cra72a#24-72");
      Mockito.when(customerService.getById(customer.getId())).thenReturn(customer);
      int getCustomerByID = customerController.getById(customer.getId());
      Mockito.verify(customerService).getById(customer.getId());
      assertEquals(1,getCustomerByID);


    }

}
