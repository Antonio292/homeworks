package com.homeworks.lesson32;

public class CommercialProperty implements Property {

    private String address;
    private double area;
    private String businessType;

    public CommercialProperty(String address, double area, String businessType) {
        this.address = address;
        this.area = area;
        this.businessType = businessType;
    }

    @Override
    public double calculatePrice() {
        double totalPrice = 0;
        switch (businessType) {
            case "Office" -> {
                totalPrice = area * 1500;
            }
            case "Warehouse" -> {
                totalPrice = area * 800;
            }
            default -> {
                totalPrice = area * 1000;
            }
        }
        return totalPrice;
    }

    @Override
    public void printDetails() {
        switch (businessType) {
            case "Office" -> {
                System.out.println("Office: ");
            }
            case "Warehouse" -> {
                System.out.println("Warehouse: ");
            }
            default -> {
                System.out.println("Other real estate: ");
            }
        }
        System.out.println("Address: " + address);
        System.out.println("Area: " + area + " square meters");
        System.out.println("-------------");
    }
}
