package com.homeworks.homework31;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Letter extends MailItem {
    private boolean isRegistered;

    public Letter(String sender, String recipient, double weight, boolean isRegistered) {
        super(sender, recipient, weight);
        this.isRegistered = isRegistered;
    }


    @Override
    public double calculateShippingCost() {
        int cost = 0;
        if (isRegistered) {
            cost = 10;
            log.info("Calculate Shipping Cost for Registered Letter");
        } else {
            cost = 5;
            log.info("Calculate Shipping Cost for not Registered Letter");
        }
        return cost;
    }

    @Override
    public void printDetails() {
        System.out.println("Письмо: " + "\n" +
                "Отправитель: " + sender + "\n" +
                "Получатель: " + recipient + "\n" +
                "Вес посылки: " + weight + "kg\n");
        if (isRegistered) {
            System.out.println("Письмо зарегистрировано: да" + "\n" +
                    "Стоимость доставки: " + calculateShippingCost() + " евро");
        } else {
            System.out.println("Письмо зарегистрировано: нет" + "\n" +
                    "Стоимость доставки: " + calculateShippingCost() + " евро");
        }

    }
}
