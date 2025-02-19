package com.homeworks.homework40;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

public class Task_2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your new task: ");
        String newTask = sc.nextLine() + "\n";
        try {
            FileWriter writer = new FileWriter("tasks.txt", true);
            writer.write(newTask);
            writer.close();
            System.out.println("Text was written");
            writer.close();
        } catch (IOException exception) {
            System.out.println("IO Exception" );
            exception.printStackTrace();
        }
    }
}
