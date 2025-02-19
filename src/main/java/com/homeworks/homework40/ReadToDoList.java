package com.homeworks.homework40;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadToDoList {
    public static void main(String[] args) {
        String filePath = "tasks.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            int counter = 1;
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(counter + ". " + line);
                counter ++;
            }
            br.close();
        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
            exception.printStackTrace();
        } catch (IOException exception) {
            System.out.println("IO exception");
            exception.printStackTrace();
        }
    }
}
