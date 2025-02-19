package com.homeworks.javaio;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamWriter {
    public static void main(String[] args) {
        String textToWrite = "Hello Java IO!";
        try {
            FileWriter writer = new FileWriter("outputText.txt");
            writer.write(textToWrite);
            writer.close();
            System.out.println("text was written");
        } catch (IOException exception) {
            System.out.println("IO exception");
            exception.printStackTrace();
        }
    }
}
