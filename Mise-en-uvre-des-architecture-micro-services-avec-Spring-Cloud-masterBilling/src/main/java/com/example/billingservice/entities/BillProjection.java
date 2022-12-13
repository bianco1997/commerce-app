package com.example.billingservice.entities;

import org.springframework.data.rest.core.config.Projection;

import javax.persistence.OneToMany;
import javax.persistence.Transient;
import java.util.Collection;
import java.util.Date;

@Projection(types = Bill.class,name = "fullBill")
public interface BillProjection extends Projection {
    public Long getId();
    public Date getBillingDate();
    //public Collection<ProductItem> getProductItems();
    //public Customer getCustomer();
    public Long getCustomerId();
}
