package com.homeworks.homework31;

public abstract class MailItem {
    protected String sender;
    protected String recipient;
    protected double weight;

    public MailItem(String sender, String recipient, double weight) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
    }

    public abstract double calculateShippingCost();

    public void printDetails() {
        System.out.println("Отправитель: " + sender + "\n" +
                           "Получатель: "  + recipient + "\n" +
                           "Вес посылки: " + weight + "kg");
    }
}
