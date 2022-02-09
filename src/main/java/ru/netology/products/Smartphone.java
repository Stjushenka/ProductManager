package ru.netology.products;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)

public class Smartphone extends Product {
    String producerSmart;

    public Smartphone(int id, String nameProduct, int price, String producerSmart) {
        super(id, nameProduct, price);
        this.producerSmart = producerSmart;
    }

    @Override
    public boolean matches(String search) {
        if (super.matches(search)) {
            return true;
        }

        return producerSmart.contains(search);
    }
}
