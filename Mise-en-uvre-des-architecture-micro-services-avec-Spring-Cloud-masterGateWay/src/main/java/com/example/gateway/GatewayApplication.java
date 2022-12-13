package com.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    //@Bean
    //configuration static
    /*RouteLocator gatewayRoutes(RouteLocatorBuilder builder)
    {
        /*return builder.routes()
                .route(r->r.path("/customers/**")
                        .uri("http://localhost:8081/"))
                .route(r->r.path("/products/**")
                        .uri("http://localhost:8082/"))
                .build();*/
        /*return builder.routes()
                .route(r->r.path("/customers/**")
                        .uri("lb://CUSTOMER-SERVICE"))
                .route(r->r.path("/products/**")
                        .uri("lb://INVENTORY-SERVICE"))
                .route((r->r.path("/bills/**")
                        .uri("lb://billing-service")))
                .build();*/
    //}



    //configuration dynamic
    @Bean
    DiscoveryClientRouteDefinitionLocator definitionLocator(
            ReactiveDiscoveryClient rdc,
            DiscoveryLocatorProperties properties)
    {
        return new DiscoveryClientRouteDefinitionLocator(rdc,properties);
    }

    /*
    notez bien que dans la configuration dynamic il faut preciser le nom de microservice/path
     */

}
