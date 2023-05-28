import java.util.Scanner;

public class HighLow {

    private static int number;
    private static int guess;

    public static void High(){

        String choice = "y";
        Scanner scan = new Scanner(System.in);
        number = 1 + (int) (Math.random() *10);

        while(choice.equals("Y") || choice.equals("y")){
            number = 1 + (int) (Math.random() *10);
            boolean flag = true;
            int chances = 3;

            while(chances > 0 && flag){
                System.out.println("Enter Guess: ");

                while(!scan.hasNextInt()){
                    System.out.print("Enter a number: ");
                    scan.next();
                    if (scan.hasNextInt())
                        break;
                }

                guess = scan.nextInt();
                if (guess > number) {
                    System.out.println("Go Low");
                    chances--;
                }
                else if (number > guess) {
                    System.out.println("Go High");
                    chances--;
                }
                else {
                    System.out.println("Congratulations you Won!" +
                            "\nNumber: " + number);
                    flag = false;
                }

            }

            System.out.println("Do you want to play again? (Y/N): ");
            choice = scan.next();
        }

    }

    public static void Thank(){
        for (int i = 0; i < 6; ++i){
            System.out.println("Thanks for playing");
            for (int j = 0; j <= i; ++j)
                System.out.print("*");
        }

        for (int i = 6; i > 0; i--){
            System.out.println("Thanks for playing");
            for (int j = i; j > 0; j--)
                System.out.print("*");
        }
        System.out.print("Thanks for playing");
    }
}
