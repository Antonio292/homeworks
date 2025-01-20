package com.homeworks.homework31;

import java.util.ArrayList;
import java.util.List;

public class PostOffice {
    private List<MailItem> mailItems = new ArrayList<>();

    public List<MailItem> getMailItems() {
        return new ArrayList<>(mailItems);
    }

    public void addMailItem(MailItem Item){
        if (Item != null) {
            mailItems.add(Item);
        }
        else {
            System.out.println("Попытка добавить несуществующий элемент");
        }
    }

    public double calculateTotalShippingCost() {
        double totalCost = 0;
        if (!mailItems.isEmpty()) {
            for (MailItem Item: mailItems) {
                totalCost += Item.calculateShippingCost();
            }
            System.out.println("Общая стоимость: " + totalCost);
            System.out.println("------------");
        }
        return totalCost;
    }

    public void printAllDetails() {
        new ArrayList<>(mailItems);
        for (MailItem Item: mailItems) {
            Item.printDetails();
            System.out.println("-------");
        }
    }
}
