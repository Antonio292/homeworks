package com.homeworks.lesson32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseTest {

    private House house;

    @Test
    void calculatePriceMustReturnCorrectHouseWithoutGaragePrice () {

        house = new House("Kriegstrasse 201", 140.7, 604,  false);

        double price = house.calculatePrice();

        assertEquals(233360, price);
    }

    @Test
    void calculatePriceMustReturnCorrectHouseWithGaragePrice () {

        house = new House("Kriegstrasse 201", 140.7, 604,  true);

        double price = house.calculatePrice();

        assertEquals(238360, price);
    }


}
