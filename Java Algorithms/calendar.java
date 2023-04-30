// Java Program to Display Dates in Different Format

// Importing Classes/Files
import java.io.*;
// Importing speccificaly Time Class and functionalities
import java.time.*;

class calendar {

    // Main driver method
    public static void main(String[] args) {
        // Create an object of LoacalDate type
        LocalDate date = LocalDate.now();
        // .now() method to tore the current date

        // Print current date
        System.out.println(date);
    }
}
