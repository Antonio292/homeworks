package com.homeworks.homework31;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Advertisement extends MailItem{
    private int quantity;

    public Advertisement(String sender, String recipient, double weight, int quantity) {
        super(sender, recipient, weight);
        this.quantity = quantity;
    }

    @Override
    public double calculateShippingCost() {
        if (quantity <=0) {
            log.warn("attempt to calculate shipping cost for advertisement with null quantity");
            return 0;
        }
        else if(quantity <= 50) {
            return 1;
        }
        else if (quantity % 50 != 0) {
            int newQuantity = quantity/50;
            return newQuantity +1;
        }
        else {
            return quantity/50;
        }
    }

    @Override
    public void printDetails() {
        System.out.println("Рекламная листовка: " + "\n" +
                "Отправитель: " + sender + "\n" +
                "Получатель: "  + recipient + "\n" +
                "Вес посылки: " + weight + "kg\n" +
                "Колличество копий: " + quantity  + "\n" +
                "Стоимость доставки: " + calculateShippingCost() + " евро");
    }
}
