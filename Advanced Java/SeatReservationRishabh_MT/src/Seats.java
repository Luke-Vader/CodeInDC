import java.io.File;
import java.io.IOError;
import java.io.IOException;

interface Thankyou{
    void displayThanks();
}

public class Seats implements Thankyou{

    char[][] seating;
    String[][] customerNames;

    public Seats() {
        this.seating = new char[5][6];
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 6; ++j)
                this.seating[i][j] = 'E';               //initialising the seats as empty
        this.customerNames = new String[5][6];
    }

    public Seats(int row, char column){
        this.seating = new char[5][6];
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 6; ++j)
                this.seating[i][j] = 'E';               //initialising the seats and booking first seat
        this.seating[row-1][column - 65] = 'X';
        this.display();
    }

    //this displays the entire seating arrangement
    public void display(){
        System.out.println("""
                \tSeat Reservation System
                ********************************
                \tA\tB\tC\tD\tE\tF""");
        for (int i = 0; i < 5; i++) {
            System.out.print(i+1);
            for (int j = 0; j < 6; ++j)
                System.out.print("\t" + this.seating[i][j]);
            System.out.println("");
        }
    }

    public boolean reserve(int row, char column){
        if (this.seating[row - 1][column - 65] == 'E'){             //checking for reservation
            this.seating[row - 1][column - 65] = 'X';               //booking seat
            this.display();                                         //displaying the booked seat
            return true;
        } else {
            System.out.println("Seat is taken");
            return false;
        }
    }

    public boolean reserve(int row, char column, String name){
        if (this.seating[row - 1][column - 65] == 'E'){             //checking for reservation
            this.seating[row - 1][column - 65] = 'X';               //booking seat
            this.display();                                         //displaying the booked seat
            this.customerNames[row - 1][column - 65] = name;

            return true;
        } else {
            System.out.println("Seat is taken");
            return false;
        }
    }

    public void writeDisk(int row, int column){
        try {
            File file = new File("seats.txt");
            String data = customerNames[row - 1][column - 65] + " " + (row - 1) + " " + (column);




        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void displayThanks() {
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print("Thank you");
            }
        }
        for (int i = 3; i > 0 ; i--) {
            System.out.println();
            for (int j = i; j >0 ; j--) {
                System.out.print("Thank you");
            }
        }
    }
}
