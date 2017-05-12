package com.jgalds.model;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

/**
 * Created by Admin on 5/11/2017.
 */

@Data
@Entity
public class Picture {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    private String picName;

    @NonNull
    private String picPath;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;
}
