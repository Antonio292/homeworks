package com.homeworks.lesson32;

import java.util.ArrayList;
import java.util.List;

public class RealEstateAgency {

    private List<Property> properties = new ArrayList<>();

    public List<Property> getProperties() {
        return new ArrayList<>(properties);
    }

    public void addProperty(Property property) {
        if (property != null) {
            properties.add(property);
        } else {
            System.out.println("attempt to added null");
        }
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Property property : properties) {
            totalPrice += property.calculatePrice();
        }
        System.out.println("Total price: " + totalPrice);
        System.out.println("------------");
        return totalPrice;
    }

    public void printAllDetails() {
        for (Property property : properties) {
            property.printDetails();
        }
    }
}
