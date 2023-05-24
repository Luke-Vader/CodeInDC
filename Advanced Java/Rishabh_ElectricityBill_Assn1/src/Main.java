//Author: Rishabh Banerjee
//Date: 05/20/23
//Calculates the bill amount according to the discount/surcharge specified.

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    //global constants
    static final double RATE_LT_200 = 2.5;
    static final double RATE_LT_500 = 3.5;
    static final int RATE_GT_500 = 5;
    static final double DISCOUNT = 0.1;
    static final double SURCHARGE = 0.05;

    public static void main(String[] args) {
        double units;
        double amount = 0;

        System.out.print("Enter Units Consumed: ");
        try{
            units = scan.nextDouble();

            //checking for positive unit value
            if(units <= 0){
                System.out.print("Invalid Input (positive value expected)");
            } else {
                amount = calculateCharge(units);            //calling method to ask for payment plan and calculate
                if (amount > 0)                             //checking for calculated amount
                    System.out.println("\nTotal Bill Amount: $" + String.format("%.2f",amount) );
                else
                    System.out.println("Invalid Input");    //invalid plan selection
            }
            //exception handling for non double user input
        } catch (Exception e) {
            System.out.print("Invalid Input (numeric value expected)");
        }
    }

    //calculates the total amount to be paid according to the breakdown
    public static double calculateCharge(double units){
        int paymentPlan;
        double amount;

        //deciding the rate slab
        if (units < 200) {
            amount = units * RATE_LT_200;
        } else if (units < 500) {
            amount = units * RATE_LT_500;
        } else {
            amount = units * RATE_GT_500;
        }

        //fetching payment plan
        System.out.print("""
                1. Pay within 15 days(10% Discount)
                0. Pay after 15 days(5% Surcharge)
                Choose(1-0):""");
        paymentPlan = scan.nextInt();

        //implementing the discount/surcharge according to the payment plan
        if(paymentPlan == 1){
            amount -= amount * DISCOUNT;
        } else if (paymentPlan == 0){
            amount += amount * SURCHARGE;
        } else {
            amount = 0;
        }
        return amount;
    }

}