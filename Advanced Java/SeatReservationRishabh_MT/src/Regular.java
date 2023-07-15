public class Regular extends Seats {

    int count;

    public double calculate(char[][] seats) {
        for (int i = 1; i < 5; i++)
            for (int j = 0; j < 6; j++)
                if (seats[i][j] == 'X')
                    count++;
        System.out.println("You have purchased " + count + " regular seat/s");
        return count * 10;
    }
}
