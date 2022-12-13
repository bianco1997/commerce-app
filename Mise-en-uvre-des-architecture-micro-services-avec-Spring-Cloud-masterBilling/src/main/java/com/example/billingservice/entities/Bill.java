package com.example.billingservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billingDate;
    @Transient @OneToMany(mappedBy = "bill")
    private Collection<ProductItem> productItems;
    @Transient private Customer customer;
    private Long customerId;
}
