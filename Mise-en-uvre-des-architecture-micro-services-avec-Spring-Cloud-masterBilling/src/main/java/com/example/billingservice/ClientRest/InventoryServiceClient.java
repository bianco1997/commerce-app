package com.example.billingservice.ClientRest;

import com.example.billingservice.entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "inventory-service")
public interface InventoryServiceClient {
    @GetMapping("/products/{id}?projection=fullProduct")
    Product findProductById(@PathVariable(name = "id") Long id);
    //PagedModel<Product> findAll(@RequestParam(name = "page") int page,@RequestParam(name = "size") int size);
    @GetMapping("/products?projection=fullProduct")

    PagedModel<Product> findAll();
}
