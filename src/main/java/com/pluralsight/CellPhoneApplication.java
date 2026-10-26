package com.pluralsight;

import java.util.Scanner;

/*
 * CellPhoneApplication holds main(), the starting point of the program.
 * It tests the CellPhone class: it creates one empty phone, asks the user
 * for the phone's details, stores them with the setters, then prints them
 * back with the getters.
 */
public class CellPhoneApplication {
    public static void main(String[] args) {
        // Create a new instance of CellPhone.
        // The parameterless constructor runs, so every property starts at its default (0 or "").
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();

        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for cell phone information and set the properties.
        // Each answer is read into a local variable, then handed to the matching setter.
        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();  // Read integer value
        cellPhone1.setSerialNumber(serialNumber);
        scanner.nextLine();  // Consume newline: nextInt() leaves the Enter key in the buffer,
        // and without this line the next nextLine() would read an empty answer

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();  // Read entire line till newline (keeps spaces, ex: iPhone 15 Pro Max)
        cellPhone1.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        cellPhone1.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        cellPhone1.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        cellPhone1.setOwner(owner);

        // Display the properties of the phone using getters.
        // The getters read the values back out of the object, proving the setters stored them.
        System.out.println("\nCellPhone Details:");
        System.out.println("Serial Number: " + cellPhone1.getSerialNumber());
        System.out.println("Model: " + cellPhone1.getModel());
        System.out.println("Carrier: " + cellPhone1.getCarrier());
        System.out.println("Phone Number: " + cellPhone1.getPhoneNumber());
        System.out.println("Owner: " + cellPhone1.getOwner());

        // Create a scanner object to read user input

        // Prompt user for cell phone information and set the properties.
        // Each answer is read into a local variable, then handed to the matching setter.
        System.out.print("What is the serial number? ");
        int serialNumber2 = scanner.nextInt();  // Read integer value
        cellPhone1.setSerialNumber(serialNumber);
        scanner.nextLine();  // Consume newline: nextInt() leaves the Enter key in the buffer,
        // and without this line the next nextLine() would read an empty answer

        System.out.print("What model is the phone? ");
        String model2 = scanner.nextLine();  // Read entire line till newline (keeps spaces, ex: iPhone 15 Pro Max)
        cellPhone1.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier2 = scanner.nextLine();
        cellPhone1.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber2 = scanner.nextLine();
        cellPhone1.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner2 = scanner.nextLine();
        cellPhone1.setOwner(owner);

        display(cellPhone1);
        display(cellPhone2);

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());

        // Close the scanner: we are done reading input
        scanner.close();

        // Display the properties of the phone using getters.
        // The getters read the values back out of the object, proving the setters stored them.
        System.out.println("\nCellPhone Details:");
        System.out.println("Serial Number: " + cellPhone2.getSerialNumber());
        System.out.println("Model: " + cellPhone2.getModel());
        System.out.println("Carrier: " + cellPhone2.getCarrier());
        System.out.println("Phone Number: " + cellPhone2.getPhoneNumber());
        System.out.println("Owner: " + cellPhone2.getOwner());

    }
    public static void display(CellPhone phone){
        System.out.println("\nCellPhone Details:");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }





}