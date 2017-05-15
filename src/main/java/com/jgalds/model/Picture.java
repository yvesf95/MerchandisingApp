package com.jgalds.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

/**
 * Created by Admin on 5/11/2017.
 */

@Data
@NoArgsConstructor
@Entity
public class Picture {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String picName;
    private String picPath;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    public Picture(String picName, String picPath, Product product) {
        this.picName = picName;
        this.picPath = picPath;
        this.product = product;
    }
}
