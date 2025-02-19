package com.homeworks.homework36;

import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Setter
public class Task_1 {

    public void calculateDateNextVisit(String userInput) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate lastVisit = LocalDate.parse(userInput, formatter);
        LocalDate nextVisit = lastVisit.plusMonths(6);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String nextVisitFormat = nextVisit.format(formatter1);
        System.out.println("Your next visit: " + nextVisitFormat);

    }
}
