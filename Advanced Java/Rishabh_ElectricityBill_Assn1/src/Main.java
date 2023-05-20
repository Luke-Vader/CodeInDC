//Author: Rishabh Banerjee
//Date: 05/20/23
//Calculates the bill amount according to the discount specified.

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        double units;
        double amount;

        System.out.println("Enter Units Consumed: ");
        units = scan.nextDouble();
        amount = calculateCharge(units);
        if (amount > 0)                     //checking for positive value for valid input
            System.out.println("Total Bill Amount: $" + String.format("%.2f",amount) );
    }

    //calculates the total amount to be paid according to the breakdown
    public static double calculateCharge(double units){
        int paymentPlan;
        double amount;

        //deciding the rate slab
        if (units < 200) {
            amount = units * 2.5;
        } else if (units < 500) {
            amount = units * 3.5;
        } else {
            amount = units * 5;
        }

        //fetching payment plan
        System.out.println("""
                1. Pay within 15 days(10% Discount)
                0. Pay after 15 days(5% Surcharge)
                Choose(1-0):""");
        paymentPlan = scan.nextInt();

        //implementing the discount/surcharge according to the payment plan
        if(paymentPlan == 1){
            amount += amount * 0.05;
        } else if (paymentPlan == 0){
            amount -= amount * 0.1;
        } else {
            System.out.println("Invalid Input");
            amount = -1;
        }

        return amount;
    }

}