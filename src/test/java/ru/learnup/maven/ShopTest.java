package ru.learnup.maven;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    @Test
    @DisplayName("Счетчик товаров")
    void сount() {
        Product[] product = new Product[2];
        product[0] = new ProductBuilder().setName("Apple").setCost(23).build();
        product[1] = new ProductBuilder().setName("Banana").setCost(223).build();
        Shop store = Shop.getInstance(product);
        int actually = store.сount();
        int expected = 2;
        assertEquals(actually,expected);

    }
}