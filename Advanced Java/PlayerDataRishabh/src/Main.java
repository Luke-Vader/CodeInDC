import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<Integer> scores = new ArrayList<>();

    public static void main(String[] args) {
        int playerCount;
        int scoreSentinel = 0;

        //determining the size of the Athlete array
        System.out.println("How many players are you going to enter? ");
        playerCount = scan.nextInt();

        //declaring the space for the Athlete object data
        if (playerCount > 0) {
            Athlete athletes[] = new Athlete[playerCount];
        }

        System.out.println("Enter the details of Player 1: ");

        while(scoreSentinel != -1){
            scoreSentinel = scan.nextInt();
        }


    }
}