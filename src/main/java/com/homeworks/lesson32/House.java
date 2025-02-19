package com.homeworks.lesson32;

public class House implements Property {

    private String address;
    private double area;
    private double landArea;
    private boolean hasGarage;

    public House(String address, double area, double landArea, boolean hasGarage) {
        this.address = address;
        this.area = area;
        this.landArea = landArea;
        this.hasGarage = hasGarage;
    }

    @Override
    public double calculatePrice() {
        double totalPrice = 0;
        double priceHouse = area * 800;
        double priceLand = landArea * 200;
        if (hasGarage) {
            totalPrice = priceHouse + priceLand + 5000;
        } else {
            totalPrice = priceHouse + priceLand;
        }
        return totalPrice;
    }

    @Override
    public void printDetails() {
        System.out.println("House: ");
        System.out.println("Address: " + address);
        System.out.println("Area: " + area + " square meters");
        System.out.println("Land area: " + landArea);
        System.out.println("Has garage: " + (hasGarage ? "Yes" : "No"));
        System.out.println("------------");
    }
}
