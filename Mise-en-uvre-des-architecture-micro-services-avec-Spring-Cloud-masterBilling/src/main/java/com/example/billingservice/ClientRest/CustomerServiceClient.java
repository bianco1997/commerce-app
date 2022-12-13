package com.example.billingservice.ClientRest;

import com.example.billingservice.entities.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//creation d'une maniere declarative
@FeignClient(name = "customer-service")
public interface CustomerServiceClient {
    @GetMapping("/customers/{id}?projection=fullCustomer")
    Customer findCustomerById(@PathVariable(name = "id") Long id);
}
