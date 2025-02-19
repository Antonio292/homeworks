package com.homeworks.javaio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamReader {
    public static void main(String[] args) {
        String filePath = "outputText.txt";
        try {
            FileReader reader = new FileReader(filePath);
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
            exception.printStackTrace();
        } catch (IOException exception) {
            System.out.println("IO exception");
            exception.printStackTrace();
        }
    }
}
