import java.util.Scanner;

public class Main {

    static int choice;
    static int days;
    static double cost;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while(choice != 5){
            getUserChoice();
            if (choice != 5) {
                calculateRent();
                System.out.printf("\nTotal Rental Cost: $%.2f\n", cost);
            }
        }
    }

    static void getUserChoice() {
        System.out.println("""
                
                Rapid Ready Car Rental Agency rents four types of vehicles:
                1.Economy
                2.Intermediate
                3.Full Size
                4.Specialty-sports
                5.Exit
                Choose(1-5):\s""");
        choice = Integer.parseInt(sc.nextLine());
    }

    static void calculateRent() {
        System.out.println("Duration(in days not more than 30): ");
        days = Integer.parseInt(sc.nextLine());
        if (days >= 30) {
            System.out.println("Rapid Ready has a policy that prohibits rental for period beyond 30 days.");
            choice = 0;
        }

        switch (choice) {
            case 1 -> cost = days * 31.95;
            case 2 -> cost = days * 41.95;
            case 3 -> cost = days * 49.95;
            case 4 -> cost = days * 59.95;
        }
        if (days > 7)
            cost -= cost * 0.1;
    }
}