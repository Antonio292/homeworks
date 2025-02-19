package com.homeworks.homework31;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Package extends MailItem {
    private double length;
    private double width;
    private double height;

    public Package(String sender, String recipient, double weight, double length, double width, double height) {
        super(sender, recipient, weight);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateShippingCost() {
        int weightPackage = (int) weight;
        if (weight <= 0) {
            log.warn("Attempt to calculate shipping cost for empty package ");
            return 0;
        } else if (0 < weight && weight < 1) {
            log.info("Attempt to calculate shipping cost for little package ");
            return 2;
        } else if ((weight - weightPackage) != 0) {
            return (weightPackage * 2) + 2;
        } else {
            return weightPackage * 2;
        }
    }

    @Override
    public void printDetails() {
        System.out.println("Посылка: " + "\n" +
                "Отправитель: " + sender + "\n" +
                "Получатель: " + recipient + "\n" +
                "Вес посылки: " + weight + "kg\n" +
                "Размеры: " + length + "x" + width + "x" + height + "cm" + "\n" +
                "Стоимость доставки: " + calculateShippingCost() + " евро");
    }
}
