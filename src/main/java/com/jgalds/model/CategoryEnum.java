package com.jgalds.model;

/**
 * Created by Admin on 5/12/2017.
 */
public enum CategoryEnum {
    BAGS("Bags"), SHIRTS("Shirts"), DRESSES("Dresses"), JACKETS("Jackets"),
    PANTS("Pants"), SHORTS("Shorts"), SOCKS("Socks"), SHOES("Shoes"),
    ACCESSORIES("Accessories"), GADGETS("Gadgets"), MISCELLANEOUS("Miscellaneous");

    String categoryName;

    CategoryEnum(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
