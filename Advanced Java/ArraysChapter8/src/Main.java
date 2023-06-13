//Author: Rishabh Banerjee
//Date: 06/10/2023
//Program to understand the usage of Arrays in Java

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        Average();
        Multiplication();
//        Mechanic();
    }


    static void Average(){
            double total = 0;
            double average;
            double distance;
            double number;
            double[] score = new double[4];

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter the number: ");
            number = scan.nextDouble();
            score[i] = number;
            total += number;
        }

        average = total/score.length;
        System.out.println("Average: " + average);

        System.out.println("Score\tDistance to Average");
        for (double v : score) {
            distance = Math.abs(average - v);
            System.out.println(v + "\t\t" + distance);
        }

    }

    //method to test out parallel arrays for processing some costs
    static void Mechanic(){
        String[] jobs = {"Oil Change", "Tire Rotation", "Battery Check", "Brake Inspection"};
        int[] cost = {22,25,15,5};

        System.out.println("Services Offered\n");
        for (String job : jobs)
            System.out.println(job);
        System.out.println("Choose(1-4): ");
        int service = scan.nextLine().charAt(0);
        service -= 48;                              //making use of ASCII before calculating the actual value

        System.out.println("The price of the service is " + cost[service-1]);

    }

    static void Multiplication(){
        int[][] matrix = new int[5][5];
        int p = 0, m1 = 0, m2 = 0;

        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            m2 = 1;
            m1++;
            for (int j = 0; j < matrix.length; j++) {
                p = m2 * m1;
                ++m2;
                matrix[i][j] = p;
            }
        }

        for (int[] ints : matrix) {
            System.out.println();
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("\t" + ints[j]);
            }
        }
    }
}