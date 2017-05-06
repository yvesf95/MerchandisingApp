package com.jgalds.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Admin on 5/6/2017.
 */

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NonNull
    private String productName;
    @NonNull
    private String productType;
    @NonNull
    private String productDesc;
    @NonNull
    private double productPrice;

}
