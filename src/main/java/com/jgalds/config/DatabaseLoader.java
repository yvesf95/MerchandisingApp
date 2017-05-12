package com.jgalds.config;

import com.jgalds.model.*;
import com.jgalds.repository.AccountRepository;
import com.jgalds.repository.CategoryRepository;
import com.jgalds.repository.PictureRepository;
import com.jgalds.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Admin on 5/6/2017.
 */

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final AccountRepository accountRepository;

    private final CategoryRepository categoryRepository;

    private final PictureRepository pictureRepository;

    private final ProductRepository productRepository;

    @Autowired
    public DatabaseLoader(AccountRepository accountRepository,
                          CategoryRepository categoryRepository,
                          PictureRepository pictureRepository,
                          ProductRepository productRepository) {
        this.accountRepository = accountRepository;
        this.categoryRepository = categoryRepository;
        this.pictureRepository = pictureRepository;
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        accountRepository.save(new Account("admin", "admin", "spring",
                "helloworld@gmail.com", true, "ROLE_ADMIN"));
        accountRepository.save(new Account("member", "member", "youtube",
                "helloworld@gmail.com", true, "ROLE_MEMBER"));
        accountRepository.save(new Account("student", "student", "java",
                "helloworld@gmail.com", true, "ROLE_STUDENT"));

        for (CategoryEnum c : CategoryEnum.values()) {
//            ex: new Category(name: Bags)
            Category category = categoryRepository.save(new Category(c.getCategoryName()));

//            ex: new Product(productName: Sample Bags, productDesc: Hello World,
//                   category: Bags, color: white, size: 10, price: 1000.00, stock: 10)
            Product product = productRepository.save(new Product("Sample " + c.getCategoryName(),
                    "Hello World", category, "white", 10, 1000.00, 10));

//            ex: new Picture(picName: bags, picPath: /images/bags-sample.jpg, product1)
            Picture picture = pictureRepository.save(new Picture(c.getCategoryName(),
                    "/images/" + c.getCategoryName().toLowerCase() + "-sample.jpg", product));

        }
    }
}
