//Author: Rishabh Banerjee
//Date: 08-07-2023
//Objective: Program to implement a reservation system built with Arrays and inherited classes.

import java.util.Scanner;

public class MainApp {

    static Scanner scan = new Scanner(System.in);
    static String input;


    public static void main(String[] args) {

        Seats seats = new Seats();                          //creating the seats and intialising them

        char choice = 'Y';

        do {
            int row = 0;
            char column = ' ';
            boolean flag = true;

            seats.display();

            Matinee matinee = new Matinee();                //initialising the matinee checker
            Regular regular = new Regular();                //initialising the regular checker

            do {        //loop to ask the user a valid row number to proceed
                System.out.print("Enter the row number. Input only values from 1 to 5 ");
                input = scan.next();
                if(validate("row", input.trim())) {         //validating the row value for numeric
                    row = Integer.parseInt(input);
                    flag = true;
                } else {
                    System.out.println("Incorrect Input provided");
                    flag = false;
                }
            } while (!flag);

            flag = true;
            do{         //loop to ask the user a valid column alpha to proceed
                System.out.print("Enter the columns by entering the letters A to F ");
                input = scan.next();
                if(validate("column", input.trim())) {      //validating the column value for character
                    column = input.toUpperCase().charAt(0);
                    flag = true;
                } else{
                    System.out.println("Incorrect Input provided");
                    flag = false;
                }
            }while (!flag);

            //skipping to next iteration if selected seat is booked
            if(!seats.reserve(row, column))
                continue;

            //calculating the total amount
            double total = matinee.calculate(seats.seating) + regular.calculate(seats.seating);
            System.out.println("Your total bill is " + total);

            flag = true;
            do {            //ask the user for either Y or N to proceed
                System.out.print("Do you want to make more reservations? Type Y for yes and N for no ");
                input = scan.next();
                if (!validate("choice", input)) {
                    System.out.println("Invalid Input");
                    flag = false;
                } else {
                    flag = true;
                    choice = input.toUpperCase().charAt(0);
                }
            } while (!flag);
        } while (choice == 'Y');

        seats.displayThanks();              //displays the thank you message to the user

    }

    public static boolean validate(String type, String value) {
        if (type.equals("row")) {
            try {
                int row = Integer.parseInt(value);          //converting
                return row > 0 && row < 6;                  //checking for row 1-5
            } catch (NumberFormatException e) {
                return false;
            }
        } else if (type.equals("column")) {
            try {
                char column = 0;
                if (value.trim().length() == 1) {
                    column = value.toUpperCase().charAt(0);
                    return column > 64 && column < 71;      //checking for column A-F with ASCII values
                } else return false;
            } catch (Exception e) {
//                System.out.println(e.getMessage());
                return false;
            }
        } else if (type.equals("choice")) {
            if (value.trim().length() == 1) {
                char c = value.trim().toUpperCase().charAt(0);
                if (c == 89 || c == 78)                     //checking values for Y and N
                    return true;
                else return false;
            } else return false;
        } else return false;
    }
}