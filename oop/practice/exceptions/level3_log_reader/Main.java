package oop.practice.exceptions.level3_log_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(
                BufferedReader br = new BufferedReader(new FileReader("server_logs.txt"))){
            String line;

            // Read line-by-line until the end of the file
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        }
        catch (
                IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
