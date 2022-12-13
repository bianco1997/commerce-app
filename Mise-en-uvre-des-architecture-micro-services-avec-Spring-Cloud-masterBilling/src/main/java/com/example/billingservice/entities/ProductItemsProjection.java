package com.example.billingservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = ProductItem.class,name = "fullProductItems")
public interface ProductItemsProjection extends Projection {
        public Long getId();
        public Long getProductId();
        public double getPrice();
        public int getQuantite();
        public Bill getBill();
}
