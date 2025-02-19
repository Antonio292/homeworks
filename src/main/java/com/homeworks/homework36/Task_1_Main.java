package com.homeworks.homework36;

import java.util.Scanner;

public class Task_1_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date of your first visit (dd.MM.yyyy): ");

        Task_1 task1 = new Task_1();
        String firstVisit = scanner.nextLine().trim();
        task1.calculateDateNextVisit(firstVisit);
    }
}
