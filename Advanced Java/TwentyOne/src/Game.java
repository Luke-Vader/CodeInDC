import java.util.Random;

public class Game {

    public int userSum;
    public int cpuSum;

    Game() {
        cpuSum = new Random().nextInt(22 - 1) + 1;
        userSum = 0;
    }

    public void playMove() {
        int card = new Random().nextInt(12 - 1) + 1;            //drawing a new card
        System.out.println("The card is " + card);
        this.userSum += card;

        //checking if the total increases 21 and game needs to be finished
        if (this.userSum > 21) {
            determineWinner(1);             //finish game because total exceeded 21
        } else {
            System.out.println("Your total is " + this.userSum);
        }
    }

    public void determineWinner(int flag) {

        //flagged condition for finishing game
        if (flag == 1) {
            System.out.println("Your total is " + this.userSum +
                    "\nThe computer's score is " + this.cpuSum +
                    "\nYou Lose");
        } else {

            if (this.userSum > this.cpuSum) {
                System.out.println("The computer's score is " + this.cpuSum +
                        "\nYou Win");
            } else if (this.cpuSum > this.userSum) {
                System.out.println("The computer's score is " + this.cpuSum +
                        "\nComputer Wins");
            } else {
                System.out.println("The computer's score is " + this.cpuSum +
                        "\nIt's a Tie!");
            }
        }
        this.userSum = this.cpuSum = 0;
    }

}
