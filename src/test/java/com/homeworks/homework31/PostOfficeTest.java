package com.homeworks.homework31;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostOfficeTest {
    private PostOffice office;
    private MailItem registeredLetter;
    private MailItem notRegisteredLetter;
    private MailItem pack;
    private MailItem advertisement;


    @BeforeEach
    void setUp() {
        office = new PostOffice();
        registeredLetter = new Letter("Anton", "Igor", 0.1, true);
        notRegisteredLetter = new Letter("Anton", "Igor", 0.1, false);
        pack = new Package("Anton", "Igor", 3.6, 30, 30, 15);
        advertisement = new Advertisement("Anton", "Igor", 0.1, 125);
}

@Test
    void addMailItemMustReturnCorrectListLength() {
        office.addMailItem(registeredLetter);
        office.addMailItem(notRegisteredLetter);
        office.addMailItem(pack);
        office.addMailItem(advertisement);
        office.addMailItem(null);

    List<MailItem> mailItemsResult = office.getMailItems();

        assertEquals(4, mailItemsResult.size());
}

    @Test
    void addMailItemMustReturnCorrectListValue() {
        office.addMailItem(registeredLetter);
        office.addMailItem(notRegisteredLetter);
        office.addMailItem(pack);
        office.addMailItem(advertisement);

        List<MailItem> mailItemsResult = office.getMailItems();

        assertEquals(registeredLetter, mailItemsResult.get(0));
        assertEquals(notRegisteredLetter, mailItemsResult.get(1));
        assertEquals(pack, mailItemsResult.get(2));
        assertEquals(advertisement, mailItemsResult.get(3));
    }

    @Test
    void calculateTotalShippingCostTestMustReturnCorrectTotalShippingCost() {
        office.addMailItem(registeredLetter);
        office.addMailItem(notRegisteredLetter);
        office.addMailItem(pack);
        office.addMailItem(advertisement);

        double totalCost = office.calculateTotalShippingCost();

        assertEquals(26, totalCost);
    }
}
