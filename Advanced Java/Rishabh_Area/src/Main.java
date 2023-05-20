//Author: Rishabh Banerjee
//Date: 05/20/23
//Calculates area of Shapes according to the list.

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

//        give user the choice
        System.out.print("""
                Choose Shape:
                1. Square
                2. Rectangle
                3. Triangle
                Enter (1-3):\s""");

//        decide which shape is chosen
        switch (scan.nextLine()) {
            case "1" -> System.out.println("Area of Square = " + square());
            case "2" -> System.out.println("Area of Rectangle = " + rectangle());
            case "3" -> System.out.println("Area of Triangle = " + triangle());
        }
    }

//    Fetch dimensions for square and calculate area
    public static double square(){
        double area = 1;
        System.out.print("Side: ");
        area = scan.nextDouble();
        return area*area;
    }

//    Fetch dimensions for rectangle and calculate area
    public static double rectangle() {
        double area = 1;
        System.out.print("Length ");
        area*= scan.nextDouble();
        System.out.print("Breadth: ");
        area*= scan.nextDouble();
        return area;
    }

//    Fetch dimensions for triangle and calculate area
    public static double triangle(){
        double area = 0.5;
        System.out.print("Base: ");
        area*= scan.nextDouble();
        System.out.print("Height: ");
        area *= scan.nextDouble();
        return area;
    }
}