import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String contFlag = "y";

        while(contFlag.equals("y") || contFlag.equals("Y")){
            Game beginGame = new Game();
            String choice;
            do {
                beginGame.playMove();
                if (beginGame.cpuSum != 0) {
                    System.out.print("Do you want another card (y/n)?");
                    choice = scan.next();
                } else {
                    choice = "n";
                }

            } while (choice.equals("y") || choice.equals("Y"));

            if (beginGame.cpuSum != 0)
                beginGame.determineWinner(0);

            System.out.print("\n\nDo you wish to play again(y/n)?");
            contFlag = scan.next();
        };

        thankUser();
    }

    public static void thankUser() {
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