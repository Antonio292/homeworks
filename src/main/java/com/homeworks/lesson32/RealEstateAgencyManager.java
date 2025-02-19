package com.homeworks.lesson32;

public class RealEstateAgencyManager {
    public static void main(String[] args) {
        RealEstateAgency agency = new RealEstateAgency();

        agency.addProperty(new Apartment("Kriegstrasse 21", 2, 64.2, true));
        agency.addProperty(new Apartment("Kriegstrasse 22", 3, 36.7, false));
        agency.addProperty(new House("Kriegstrasse 201", 140.7, 604, false));
        agency.addProperty(new House("Kriegstrasse 202", 274.6, 1456, true));
        agency.addProperty(new CommercialProperty("Kriegstrasse 65", 284.5, "Office"));
        agency.addProperty(new CommercialProperty("Kriegstrasse 195", 875.5, "Warehouse"));
        agency.addProperty(new CommercialProperty("Kriegstrasse 195", 7, "Non-residential premises"));

        agency.calculateTotalPrice();
        agency.printAllDetails();
    }
}
