package com.example.customerservice.entities;

import org.springframework.data.rest.core.config.Projection;
@org.springframework.data.rest.core.config.Projection(types= Customer.class,name="fullCustomer")

public interface CustomerProjection extends Projection {
    public Long getId();
    public String getName();
    public String getEmail();
}
