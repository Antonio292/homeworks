package com.homeworks.homework40;

import java.io.FileWriter;
import java.io.IOException;

public class CreationToDoList {
    public static void main(String[] args) {
        String textToWrite = "Купить молоко,\nпозвонить другу,\nСделать домашнее задание,\n";
        try {
            FileWriter writer = new FileWriter("tasks.txt");
            writer.write(textToWrite);
            writer.close();
            System.out.println("Text was written");
        } catch (IOException exception) {
            System.out.println("IO Exception" );
            exception.printStackTrace();
        }
    }
}
