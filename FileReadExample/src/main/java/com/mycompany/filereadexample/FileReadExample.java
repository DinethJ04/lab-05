package com.mycompany.filereadexample;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExample {
    public static void main(String[] args) {
        String fileName = "nonexistent.txt";  // File that does not exist

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            // Read the file or perform any other operations

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            e.printStackTrace();
        }
    }
}
