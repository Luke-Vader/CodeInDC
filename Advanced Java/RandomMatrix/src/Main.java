//Author: Rishabh Banerjee
//Date: 6/10/2023
//Program which prints a 5X5 array with random numbers from 1-25

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    static int[] used = new int[26];        //array to keep track of all numbers being used
    static int ctr = 0;

    public static void main(String[] args) {

        int[][] matrix = new int[5][5];

        //generating values and populating the array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                //will keep asking for a new random number unless the element is filled
                while(matrix[i][j] == 0){
                    int n = checkUsed();            //fetching the random number
                    if (n != 0){
                        used[ctr] = n;
                        ctr++;
                        matrix[i][j] = n;
                    }
                }
            }
        }

        //displaying the result matrix
        for (int[] ints : matrix) {
            System.out.println();
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("\t" + ints[j]);
            }
        }
    }

//    method which gets you a random unused number everytime between 1-25
    static int checkUsed() {
        int n = ThreadLocalRandom.current().nextInt(1, 25 + 1);
        for (int j : used) {
            if (n == j) {
                n = 0;
                break;
            }
        }
        return n;
    }
}