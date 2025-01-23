package com.homeworks.lesson32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommercialPropertyTest {
    private CommercialProperty property;

    @Test
    void calculatePriceMustReturnCorrectOfficePrice() {
        property = new CommercialProperty("Kriegstrasse 65", 284.5, "Office");

        double price = property.calculatePrice();

        assertEquals(426750, price);
    }

    @Test
    void calculatePriceMustReturnCorrectWarehousePrice() {
        property = new CommercialProperty("Kriegstrasse 65", 875.5, "Warehouse");

        double price = property.calculatePrice();

        assertEquals(700400, price);
    }

    @Test
    void calculatePriceMustReturnCorrectOtherEstatePrice() {
        property = new CommercialProperty("Kriegstrasse 195", 10, "Non-residential premises");

        double price = property.calculatePrice();

        assertEquals(10000, price);
    }
}
