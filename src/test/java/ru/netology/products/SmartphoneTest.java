package ru.netology.products;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    Smartphone smartphone  = new Smartphone(2, "Samsung galaxy", 56000, "Samsung");

    @Test

    public void shouldMatchByName() {
        String match = "Samsung galaxy";

        assertTrue(smartphone.matches(match));
    }

    @Test

    public void shouldMatchByProducer() {
        String match = "Samsung";

        assertTrue(smartphone.matches(match));
    }

}