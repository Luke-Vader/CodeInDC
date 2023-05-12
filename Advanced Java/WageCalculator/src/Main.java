import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double wage;

        System.out.print("Enter hourly wage: ");
        float rate = Float.parseFloat(s.nextLine());
        System.out.println("\nEnter number of hour(s) worked: ");
        int hours = Integer.parseInt(s.nextLine());

        if(hours > 40)
            wage = (hours*rate) + ((hours - 40) * (rate*0.3));
        else
            wage = hours*rate;

        System.out.println("Wage: $" + wage);
    }
}