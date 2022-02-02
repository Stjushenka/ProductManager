package ru.netology.products;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product {
    private int id;
    private String nameProduct;
    private int price;


    public Product() {
    }

    public boolean matches(String search) {
        return nameProduct.contains(search);
    }
}
