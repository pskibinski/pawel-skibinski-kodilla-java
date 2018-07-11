package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

import java.io.IOException;
import java.util.Arrays;

public class ExceptionModuleRunner {

    public static void main(String[] args) {

        FileReaderWithoutHandling fileReaderWithoutHandling = new FileReaderWithoutHandling();

        try {
            fileReaderWithoutHandling.readeFile();
        } catch(IOException e) {
            System.out.println("Problem while reading a file.");
        }

    }
}
