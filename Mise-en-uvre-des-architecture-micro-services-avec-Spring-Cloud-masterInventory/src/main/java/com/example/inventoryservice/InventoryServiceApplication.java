package com.example.inventoryservice;

import com.example.inventoryservice.entities.Product;
import com.example.inventoryservice.repositories.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner start(ProductRepo productRepo, RepositoryRestConfiguration configuration)
    {
        return args -> {
            configuration.exposeIdsFor(Product.class);
            productRepo.save(new Product(null,"hp laptpo",1526));
            productRepo.save(new Product(null,"dell laptpo",4545));
            productRepo.save(new Product(null,"lenevo laptpo",6548));
            productRepo.save(new Product(null,"lg laptpo",4665));
            productRepo.findAll().forEach(data->{
                System.out.println(data.getName());
            });
        };
    }
}
