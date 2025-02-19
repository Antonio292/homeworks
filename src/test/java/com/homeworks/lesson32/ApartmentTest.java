package com.homeworks.lesson32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApartmentTest {

    private Apartment apartment;


    @Test
    void calculatePriceMustReturnCorrectApartmentWithElevatorPrice() {
        apartment = new Apartment("Kriegstrasse 21", 2, 64.2, true);

        double price = apartment.calculatePrice();

        assertEquals(67410, price);
    }

    @Test
    void calculatePriceMustReturnCorrectApartmentWithoutElevatorPrice() {
        apartment = new Apartment("Kriegstrasse 21", 2, 64.2, false);

        double price = apartment.calculatePrice();

        assertEquals(64200, price);
    }
}
