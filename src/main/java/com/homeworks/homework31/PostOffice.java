package com.homeworks.homework31;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class PostOffice {
    private List<MailItem> mailItems = new ArrayList<>();

    public List<MailItem> getMailItems() {
        return new ArrayList<>(mailItems);
    }

    public void addMailItem(MailItem Item) {
        if (Item != null) {
            mailItems.add(Item);
            log.info("added new Mail item");
        } else {
            System.out.println("Попытка добавить несуществующий элемент");
            log.warn("attempt to added null");
        }
    }

    public double calculateTotalShippingCost() {
        double totalCost = 0;
        if (!mailItems.isEmpty()) {
            for (MailItem Item : mailItems) {
                totalCost += Item.calculateShippingCost();
            }
            System.out.println("Общая стоимость: " + totalCost);
            System.out.println("------------");
        }
        return totalCost;
    }

    public void printAllDetails() {
        if (!mailItems.isEmpty()) {
            new ArrayList<>(mailItems);
            for (MailItem Item : mailItems) {
                Item.printDetails();
                System.out.println("-------");
            }
        } else {
            System.out.println("Список пуст!");
        }
    }
}
