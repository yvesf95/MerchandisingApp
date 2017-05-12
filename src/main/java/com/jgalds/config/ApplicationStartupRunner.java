package com.jgalds.config;

import com.jgalds.model.Account;
import com.jgalds.model.Product;
import com.jgalds.repository.AccountRepository;
import com.jgalds.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Admin on 5/6/2017.
 */

@Component
public class ApplicationStartupRunner implements CommandLineRunner {

    private final ProductRepository productRepository;

    private final AccountRepository accountRepository;

    @Autowired
    public ApplicationStartupRunner(ProductRepository productRepository,
                                    AccountRepository accountRepository) {
        this.productRepository = productRepository;
        this.accountRepository = accountRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        productRepository.save(new Product("Hello", "Hi world",
                "shirt", "blue", 10, 1000.00, 12, "/images"));
        productRepository.save(new Product("Hello", "Hi world",
                "shirt", "blue", 10, 1000.00, 12, "/images"));
        productRepository.save(new Product("Hello", "Hi world",
                "shirt", "blue", 10, 1000.00, 12, "/images"));

        accountRepository.save(new Account("admin", "admin", "spring",
                "helloworld@gmail.com", true, "ROLE_ADMIN"));
        accountRepository.save(new Account("member", "member", "youtube",
                "helloworld@gmail.com", true, "ROLE_MEMBER"));
        accountRepository.save(new Account("student", "student", "java",
                "helloworld@gmail.com", true, "ROLE_STUDENT"));
    }
}
