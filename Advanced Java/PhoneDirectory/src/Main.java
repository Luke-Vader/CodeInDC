//Author: Rishabh Banerjee
//Date: 06/27/2023
//Program to store names and numbers in a HashMap and modify the data inside

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static Scanner scan;
    static int choice = 0;
    static String input;
    static boolean deleted = false;
    static String personPresent;

    static HashMap<String, String> directory = new HashMap<>();
                    //names //numbers

    public static void main(String[] args) {
        boolean exit = false;
        do {
            scan = new Scanner(System.in);
            System.out.println("""
                    
                    Choose from the following options by entering the number
                    1: Add a person
                    2: Delete a person
                    3: Display a person tel no
                    4: View all
                    5: Edit a person tel number
                    6: Exit
                    """);
            input = scan.nextLine();                    //fetching the user choice
            try{
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println(input + " is not a number.");
            } input = "";

                switch (choice) {
                    case 1 -> addPerson();
                    case 2 -> deletePerson();
                    case 3 -> displayPerson();
                    case 4 -> displayAll();
                    case 5 -> editPerson();
                    case 6 -> exit = true;
                }
        }while (!exit);

    }

    private static void editPerson() {
        System.out.println("Enter the name of the person");
        input = scan.nextLine();
        if (directory.containsKey(input)) {                     //checks if the record exists
            directory.forEach((key, value) -> {
                if (key.equals(input)) {
                    //asks user for new telephone number
                    System.out.println("Enter the new telephone number");
                    input = scan.nextLine();
                    directory.put(key, input);                  //overwriting the new value
                }
            });
        } else
            System.out.println("The record is not existing");
        input = "";

    }

    private static void displayAll() {
        if (!directory.isEmpty()){
            directory.forEach((key, value) -> System.out.println("Name " + key
                                                + "\nTel no " + value));            //displays all the records
        } else
            System.out.println("No record yet");
    }

    private static void displayPerson() {
        System.out.println("Enter the name of the person");
        input = scan.nextLine();
        if (directory.containsKey(input)) {
            directory.forEach((key, value) -> {
                if (key.equals(input))                                          //find person
                    System.out.println("The telephone number is " + value);     //display person
            });
        } else
            System.out.println("The record is not existing");
        input = "";
    }

    private static void addPerson() {
        System.out.println("Enter the name of the person");
        input = scan.nextLine();
        System.out.println("Enter the tel number");
        personPresent = directory.putIfAbsent(input, scan.next());              //adding the new record
        System.out.println(personPresent == null ? "One record added" : "The record is already existing");
        input = "";
    }

    private static void deletePerson() {
        System.out.println("Enter the name you want to delete");
        input = scan.nextLine();
        directory.forEach((key, value) -> {
            if (key.equals(input)) {
                directory.remove(key);                  //removing the found record
                deleted = true;
            }
        });
        System.out.println(deleted ? "One record deleted" : "The record is not existing");
    }
}