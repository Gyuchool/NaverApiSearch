package com.springshop.naverapi;

import com.springshop.naverapi.models.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class JunitTest {

    @Test
    public void createProduct(){
        Product product = new Product();
        assertAll(
                () -> assertNotNull(product),
                () -> assertEquals(product.getMyprice(), 0),
                () -> assertTrue(product.getLprice() < 1000, "1000원보다는 비싸야 한다.")
        );
    }

}