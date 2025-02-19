package com.homeworks.javaio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputExample {
    public static void main(String[] args) {
        String filePath = "outPut.bin";
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));
            int bytesToRead;
            byte[] bytes = new byte[1024];
            int totalBytes = 0;
            while ((bytesToRead = bufferedInputStream.read(bytes)) != -1) {
                totalBytes += bytesToRead;
                System.out.println("total bytes read: " +  totalBytes);
                System.out.println((char) totalBytes);
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
