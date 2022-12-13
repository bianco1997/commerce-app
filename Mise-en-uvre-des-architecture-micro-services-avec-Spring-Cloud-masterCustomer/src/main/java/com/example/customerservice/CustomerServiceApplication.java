package com.example.customerservice;

import com.example.customerservice.entities.Customer;
import com.example.customerservice.repository.CustomerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepo customerRepo, RepositoryRestConfiguration configuration){
        return args -> {
            configuration.exposeIdsFor(Customer.class);
            customerRepo.save(new Customer(null,"mouad","mouad@mail.ma"));
            customerRepo.save(new Customer(null,"mouad1","mouad@mail.ma"));
            customerRepo.save(new Customer(null,"mouad2","mouad@mail.ma"));
            customerRepo.save(new Customer(null,"mouad3","mouad@mail.ma"));
            customerRepo.save(new Customer(null,"mouad4","mouad@mail.ma"));
            customerRepo.findAll().forEach(data->{
                System.out.println(data.getEmail());
            });
        };
    }

}
