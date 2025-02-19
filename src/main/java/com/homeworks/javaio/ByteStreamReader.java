package com.homeworks.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamReader {
    public static void main(String[] args) {
        String filePath = "outPut.bin";
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            int data;

            while ((data = fileInputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("file not found");
            exception.printStackTrace();
        } catch (IOException exception) {
            System.out.println("IO exception");
            exception.printStackTrace();
        }
    }
}
