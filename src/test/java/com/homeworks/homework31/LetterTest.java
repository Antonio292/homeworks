package com.homeworks.homework31;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterTest {
    @Test
    void calculateShippingCostMustReturnCorrectShippingCostRegisteredLetter() {

        MailItem one = new Letter("Anton", "Igor", 0.1, true);

        double cost = one.calculateShippingCost();

        assertEquals(10, cost);
    }

    @Test
    void calculateShippingCostMustReturnCorrectShippingCostNotRegisteredLetter() {

        MailItem one = new Letter("Anton", "Igor", 0.1, false);

        double cost = one.calculateShippingCost();

        assertEquals(5, cost);
    }
}
