package com.homeworks.homework31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PackageTest {
    @Test
    void calculateShippingCostMustReturnCorrectShippingCostPackageWithNegativeWeight() {
        MailItem one = new Package("Anton", "Igor", -1, 30, 30, 15);

        double cost = one.calculateShippingCost();

        assertEquals(0, cost);
    }

    @Test
    void calculateShippingCostMustReturnCorrectShippingCostPackageWithWeightBelowOne() {
        MailItem one = new Package("Anton", "Igor", 0.6, 30, 30, 15);

        double cost = one.calculateShippingCost();

        assertEquals(2, cost);
    }

    @Test
    void calculateShippingCostMustReturnCorrectShippingCostPackageWithWholeWeight() {
        MailItem one = new Package("Anton", "Igor", 4, 30, 30, 15);

        double cost = one.calculateShippingCost();

        assertEquals(8, cost);
    }

    @Test
    void calculateShippingCostMustReturnCorrectShippingCostPackageWithFractionalWeight() {
        MailItem one = new Package("Anton", "Igor", 5.7, 30, 30, 15);

        double cost = one.calculateShippingCost();

        assertEquals(12, cost);
    }
}
