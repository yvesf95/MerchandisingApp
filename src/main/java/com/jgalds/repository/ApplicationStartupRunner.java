package com.jgalds.repository;

import com.jgalds.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Admin on 5/6/2017.
 */

@Component
public class ApplicationStartupRunner implements CommandLineRunner {

    private final ProductRepository productRepository;

    @Autowired
    public ApplicationStartupRunner(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        productRepository.save(new Product("Hello", "shirt", "Hi world", 1000.00));
        productRepository.save(new Product("Hello", "shirt", "Hi world", 1000.00));
        productRepository.save(new Product("Hello", "shirt", "Hi world", 1000.00));

    }
}
