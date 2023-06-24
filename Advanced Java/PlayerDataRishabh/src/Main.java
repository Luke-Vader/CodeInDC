import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //data declarations
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Integer> scores;
    static Athlete[] athletes;

    public static void main(String[] args) {
        int playerCount;
        String input;

        //determining the size of the Athlete array
        System.out.print("How many players are you going to enter? ");
        input = scan.next();
        playerCount = checkIfNumber(input);

        //declaring the space for the Athlete object data
        if (playerCount > 0) {
            athletes = new Athlete[playerCount];
        }

        //fetching the data from the user for the athlete data and score data
        for (int i = 0; i < playerCount; ++i) {

            String firstName;
            String lastName;
            int id;
            int choice =  0;
            scores = new ArrayList<>();

            System.out.print("Enter the first name ");
            firstName = scan.next();

            System.out.print("Enter the last name ");
            lastName = scan.next();

            System.out.print("Enter the id number ");
            input = scan.next();
            id = checkIfNumber(input);

            //score data is being fetched
            while(choice != -1){
                System.out.print("Now enter the scores of this player, press -1 to end ");
                input = scan.next();
                choice = checkIfNumber(input);

                if (choice != -1)
                    scores.add(choice);
            }

            //creating the athlete object
            Athlete athlete = new Athlete(firstName, lastName, id, scores);
            athletes[i] = athlete;

        }

        //display section for the score and the athlete name list
        System.out.println("Players\t\t\t\tStats\n" +
                "******************************");
        for (Athlete athlete:
             athletes) {
            athlete.display();
        }

    }

    //validation method to check for number
    static int checkIfNumber(String s){
        int number = -1;
        try{
            number = Integer.parseInt(s);
        } catch (NumberFormatException e){
            System.out.println("Not a Number");
        }
        if (number != -1)
            return number;
        else
            return 0;
    }
}