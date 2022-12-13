package com.example.inventoryservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class,name = "fullProduct")
public interface ProductProjection extends Projection {
    public Long getId();
    public String getName();
    public double getPrice();
}
