public class Matinee extends Seats {

    int count;

    public double calculate(char[][] seats){
        for (int i = 0; i < 6; i++) {
            if (seats[0][i] == 'X')
                count++;
        }
        System.out.println("You have purchased " + count + " matinee seat/s");
        return count * 20;
    }



}
