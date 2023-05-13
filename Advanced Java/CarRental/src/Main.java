import java.util.Scanner;

public class Main {

    static int choice;
    static int days;
    static double cost;

    public static void main(String[] args) {
        getUserChoice();
        calculateRent();
        System.out.printf("\nTotal Rental Cost: $%.2f\n", cost);
    }

    static void getUserChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Rapid Ready Car Rental Agency rents four types of vehicles:
                1.Economy
                2.Intermediate
                3.Full Size
                4.Specialty-sports
                Choose(1-4):\s""");
        choice = Integer.parseInt(sc.nextLine());

        System.out.println("Duration(in days not more than 30): ");
        days = Integer.parseInt(sc.nextLine());
        if (days >= 30)
            System.out.println("Rapid Ready has a policy that prohibits rental for period beyond 30 days.");
    }

    static void calculateRent() {
        switch (choice) {
            case 1:
                cost = days * 31.95;
                break;
            case 2:
                cost = days * 41.95;
                break;
            case 3:
                cost = days * 49.95;
                break;
            case 4:
                cost = days * 59.95;
                break;
        }
        if (days > 7)
            cost -= cost * 0.1;
    }
}