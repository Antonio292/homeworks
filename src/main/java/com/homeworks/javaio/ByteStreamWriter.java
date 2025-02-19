package com.homeworks.javaio;

import lombok.extern.slf4j.Slf4j;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@Slf4j
public class ByteStreamWriter {
    public static void main(String[] args) {
        String textToWrite = "Hello world, java IO stream functionality";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("outPut.bin");
            byte[] bytes = textToWrite.getBytes();
            fileOutputStream.write(bytes);
            System.out.println("Written successfully");

        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
            exception.printStackTrace();
        } catch (IOException exception) {
            System.out.println("IO Exception");
            exception.printStackTrace();
        }

        String newTextToWrite = "\nWelcome to monkeytype!";
        try {

            byte[] bytes = newTextToWrite.getBytes();
            fileOutputStream.write(bytes);
            System.out.println("new file was written");
            fileOutputStream.close();
        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
            exception.printStackTrace();
        } catch (IOException exception) {
            System.out.println("IO Exception");
            exception.printStackTrace();
        }
    }
}
