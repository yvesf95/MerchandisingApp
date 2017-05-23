package com.jgalds.config;

import com.jgalds.model.*;
import com.jgalds.service.AccountService;
import com.jgalds.service.CategoryService;
import com.jgalds.service.PictureService;
import com.jgalds.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Admin on 5/6/2017.
 */

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final AccountService accountService;

    private final CategoryService categoryService;

    private final PictureService pictureService;

    private final ProductService productService;

    @Autowired
    public DatabaseLoader(AccountService accountService,
                          CategoryService categoryService,
                          PictureService pictureService,
                          ProductService productService) {
        this.accountService = accountService;
        this.categoryService = categoryService;
        this.pictureService = pictureService;
        this.productService = productService;
    }


    @Override
    @Transactional
    public void run(String... strings) throws Exception {
        accountService.save(new Account("admin", "admin", "spring",
                "helloworld@gmail.com", true, "ROLE_ADMIN"));
        accountService.save(new Account("member", "member", "youtube",
                "helloworld@gmail.com", true, "ROLE_MEMBER"));
        accountService.save(new Account("student", "student", "java",
                "helloworld@gmail.com", true, "ROLE_STUDENT"));

        for (CategoryEnum c : CategoryEnum.values()) {
//            ex: new Category(name: Bags)
            Category category = categoryService.save(new Category(c.getCategoryName()));

//            ex: new Product(productName: Sample Bags, productDesc: Hello World,
//                   category: Bags, color: white, size: 10, price: 1000.00, stock: 10)
            Product product = productService.save(new Product("Sample " + c.getCategoryName(),
                    "Hello World", category, "white", 10, 1000.00, 10));

//            ex: new Picture(picName: bags, picPath: /images/bags-sample.jpg, product1)
            Picture picture = pictureService.save(new Picture(c.getCategoryName(),
                    "/images/" + c.getCategoryName().toLowerCase() + "-sample.jpg", product));

        }

        for (Product p : productService.findAllProducts()) {
            System.out.println(p.toString());
//            List<Picture> pictures = pictureService.findAllByProduct_Id(p.getId());
//            System.out.println(pictures.toString());
        }
    }
}
