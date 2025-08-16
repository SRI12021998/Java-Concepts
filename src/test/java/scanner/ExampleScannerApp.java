package scanner;

import java.util.Scanner;

public class ExampleScannerApp {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        try {
            System.out.println("Enter name:");
            String name = scn.next();// Using next() to read a single word
            // If you want to read a full line, use nextLine() instead
            System.out.println("Enter age:");
            int age = scn.nextInt();
            
            System.out.println("Enter Mobile Number:");
            long mobileNumber = scn.nextLong();
            
            System.out.println("Married? (true/false):");
            boolean maritalStatus = scn.nextBoolean();
            
            displayDetails(name, age, mobileNumber, maritalStatus);
        } finally {
            scn.close(); // Ensure the scanner is closed after use
        }
    }

    static void displayDetails(String name, int age, long mobileNumber, boolean maritalStatus) {
        System.out.println("Please ensure the below details entered");
    	System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Marital Status: " + (maritalStatus ? "Married" : "Not Married"));
    }
}
