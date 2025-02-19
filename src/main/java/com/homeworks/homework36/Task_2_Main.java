package com.homeworks.homework36;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task_2_Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date of operation (dd.MM.yyyy): ");
        String userInput = scanner.nextLine().trim();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate operationDate = LocalDate.parse(userInput, formatter);
        Period period = Period.between(date, operationDate);
        System.out.println(period);

    }
}
