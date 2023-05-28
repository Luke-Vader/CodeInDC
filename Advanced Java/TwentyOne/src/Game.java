import java.util.Random;

public class Game {

    public int userSum;
    public int cpuSum;

    Game(){
        Random rand = new Random();
        cpuSum = rand.nextInt(22-1) + 1;
        userSum = 0;
    }

    public void playMove(){
        Random random = new Random();
        int card = random.nextInt(12 - 1) + 1;
        System.out.println("The card is " + card);
        this.userSum += card;

        if (this.userSum > 21) {
            determineWinner(1);
        } else {
            System.out.println("Your total is " + this.userSum);
        }

    }

    public void determineWinner(int flag){

        if(flag == 1) {
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
