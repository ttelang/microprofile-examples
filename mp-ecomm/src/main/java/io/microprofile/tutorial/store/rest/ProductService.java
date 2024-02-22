package io.microprofile.tutorial.store.rest;

import java.util.ArrayList;
import java.util.List;

import io.microprofile.tutorial.store.Product;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/products")
@ApplicationScoped
public class ProductService {
    private List<Product> products;

    public ProductService() {
        products = new ArrayList<>();

        products.add(new Product(Long.valueOf(1L), "iPhone", "Apple iPhone 15", Double.valueOf(999.99)));
        products.add(new Product(Long.valueOf(2L), "MacBook", "Apple MacBook Air", Double.valueOf(1299.99)));       
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getProducts() {
        // Return a list of products
        return products;
    }
}
