package com.jgalds.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Admin on 5/6/2017.
 */

@Data
@NoArgsConstructor
@Entity
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String productName;
    private String productDesc;
    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;
    private String color;
    private double size;
    private double price;
    private int stock;

    @OneToMany(mappedBy = "product")
    private List<Picture> pictures = new ArrayList<>();

    public Product(String productName, String productDesc,
                   Category category, String color,
                   double size, double price, int stock) {
        this.productName = productName;
        this.productDesc = productDesc;
        this.category = category;
        this.color = color;
        this.size = size;
        this.price = price;
        this.stock = stock;
    }
}
