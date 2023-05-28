//Author: Rishabh Banerjee
//Date: 05/27/2023
//Blackjack

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //data declarations
        Scanner scan = new Scanner(System.in);
        String contFlag = "y";

        //loop to keep the game running
        while (contFlag.equals("y") || contFlag.equals("Y")) {

            //game object initialised with custom constructor
            Game beginGame = new Game();
            String choice;

            //loop to keep drawing more cards for the user
            do {
                beginGame.playMove();                           //function to draw card and check total score
                if (beginGame.cpuSum != 0) {
                    System.out.print("Do you want another card (y/n)?");
                    choice = scan.next();
                } else {
                    choice = "n";
                }

            } while (choice.equals("y") || choice.equals("Y"));

            //checking if game was finished legally
            if (beginGame.cpuSum != 0)
                beginGame.determineWinner(0);

            System.out.print("\n\nDo you wish to play again(y/n)?");
            contFlag = scan.next();
        }
        ;

        //function to thank user for playing the game with ASCII art
        thankUser();
    }

    public static void thankUser() {

        //Logic for displaying the Thank Triangle
        for (int i = 0; i < 6; ++i) {
            System.out.println("Thank you for playing");
            for (int j = 0; j <= i; ++j)
                System.out.print("*");
        }

        for (int i = 6; i > 0; i--) {
            System.out.println("Thank you for playing");
            for (int j = i; j > 0; j--)
                System.out.print("*");
        }
        System.out.print("Thank you for playing");
    }
}