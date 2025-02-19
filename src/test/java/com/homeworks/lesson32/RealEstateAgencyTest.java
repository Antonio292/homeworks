package com.homeworks.lesson32;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RealEstateAgencyTest {
    private RealEstateAgency agency;
    private Apartment apartment;
    private House house;
    private CommercialProperty property;


    @BeforeEach
    void setUp() {
        agency = new RealEstateAgency();
        apartment = new Apartment("Kriegstrasse 21", 2, 64.2, true);
        house = new House("Kriegstrasse 202", 274.6, 1456, true);
        property = new CommercialProperty("Kriegstrasse 65", 284.5, "Office");
    }

    @Test
    void addPropertyTestMustReturnCorrectListLength() {
        agency.addProperty(apartment);
        agency.addProperty(house);
        agency.addProperty(property);
        agency.addProperty(null);

        List<Property> properties = agency.getProperties();
        int size = properties.size();

        assertEquals(3, size);
    }

    @Test
    void calculateTotalPriceTestMustReturnCorrectTotalPrice() {
        agency.addProperty(apartment);
        agency.addProperty(house);
        agency.addProperty(property);
        agency.addProperty(null);

        List<Property> properties = agency.getProperties();
        double totalPrice = agency.calculateTotalPrice();

        assertEquals(1010040, totalPrice);
    }
}
