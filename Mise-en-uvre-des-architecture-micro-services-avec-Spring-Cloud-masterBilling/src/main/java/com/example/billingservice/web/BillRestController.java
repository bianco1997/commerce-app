package com.example.billingservice.web;

import com.example.billingservice.ClientRest.CustomerServiceClient;
import com.example.billingservice.ClientRest.InventoryServiceClient;
import com.example.billingservice.entities.Bill;
import com.example.billingservice.entities.ProductItem;
import com.example.billingservice.reposetories.BillRepo;
import com.example.billingservice.reposetories.ProductRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@AllArgsConstructor
@NoArgsConstructor
public class BillRestController {
    private BillRepo billRepo;
    private ProductRepo productRepo;
    private CustomerServiceClient customerServiceClient;
    private InventoryServiceClient inventoryServiceClient;
/*
    @GetMapping("/bills/{BillId}")
    Bill getBill(@PathVariable(name = "BillId") Long id) throws Exception {
        Bill bill=billRepo.findById(id).orElseThrow(()->{
            return new RuntimeException("bill not found !!!");
        });
        bill.setCustomer(customerServiceClient.findCustomerById(bill.getCustomerId()));
        bill.setProductItems(productRepo.findByBillId(id));
        bill.getProductItems().forEach(data->{
            System.out.println(data.getProduct().getName());
        });
        return bill;
        Bill bill=billRepo.findById(id).orElse(null);
        if(bill==null)
            throw new Exception("bill not found");
        return null;
    }*/
}
