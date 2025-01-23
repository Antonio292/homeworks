package com.homeworks.lesson32;

public class Apartment implements Property{

    private String address;
    private int floor;
    private double area;
    private boolean hasElevator;

    public Apartment(String address, int floor, double area, boolean hasElevator) {
        this.address = address;
        this.floor = floor;
        this.area = area;
        this.hasElevator = hasElevator;
    }

    @Override
    public double calculatePrice() {
        double price = area * 1000;
        if (hasElevator) {
            price *= 1.05;
        }
        return price;
    }

    @Override
    public void printDetails() {
        System.out.println("Apartment:");
        System.out.println("Address: " + address);
        System.out.println("Floor: " + floor);
        System.out.println("Area: " + area + " square meters");
        System.out.println("Has Elevator: " + (hasElevator ? "Да" : "Нет"));
        System.out.println("-----------");
    }
}
