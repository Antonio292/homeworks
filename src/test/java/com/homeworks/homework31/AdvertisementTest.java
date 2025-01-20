package com.homeworks.homework31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdvertisementTest {
    @Test
    void calculateShippingCostMustReturnCorrectShippingCostAdvertisementWithNegativeQuantity() {
        MailItem one = new Advertisement("Anton", "Igor", 0.1, 0);

        double cost = one.calculateShippingCost();

        assertEquals(0, cost);
    }

    @Test
    void calculateShippingCostMustReturnCorrectShippingCostAdvertisementWithPositiveQuantity() {
        MailItem one = new Advertisement("Anton", "Igor", 0.1, 23);

        double cost = one.calculateShippingCost();

        assertEquals(1, cost);
    }

    @Test
    void calculateShippingCostMustReturnCorrectShippingCostAdvertisementWithWholeQuantity() {
        MailItem one = new Advertisement("Anton", "Igor", 0.1, 150);

        double cost = one.calculateShippingCost();

        assertEquals(3, cost);
    }

    @Test
    void calculateShippingCostMustReturnCorrectShippingCostAdvertisementWithFractionalQuantity() {
        MailItem one = new Advertisement("Anton", "Igor", 0.1, 223);

        double cost = one.calculateShippingCost();

        assertEquals(5, cost);
    }
}
