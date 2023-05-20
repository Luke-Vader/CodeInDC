//Author: Rishabh Banerjee
//Date: 05/20/23
//Program to determine the percentages in an election for two candidates

import java.util.Scanner;
import java.util.stream.*;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static int[] votes = new int[3];
    static double totalVotes;

    public static void main(String[] args) {
        getVotes();
        totalVotes = IntStream.of(votes).sum();         //finding sum of all votes
        displayResults();

    }

    //fetching numnber of votes for each category
    public static void getVotes(){
        System.out.print("Votes for Candidate 1: ");
        votes[1] = scan.nextInt();
        System.out.print("Votes for Candidate 2: ");
        votes[2] = scan.nextInt();
        System.out.print("Number of People who didn't vote: ");
        votes[0] = scan.nextInt();
    }

     //calculates the percentages and displays them
    public static void displayResults(){
        System.out.println("Votes for Candidate 1: " + String.format("%.2f",(votes[1] / totalVotes)*100) + "%");
        System.out.println("Votes for Candidate 2: " + String.format("%.2f",(votes[2] / totalVotes)*100) + "%");
        System.out.println("People who didn't vote: " + String.format("%.2f",(votes[0] / totalVotes)*100) + "%");

        //determining the victor of the election
        if(votes[1] > votes[2])
            System.out.println("\nCongratulations Candidate 1!");
        else if(votes[2] > votes[1])
            System.out.println("\nCongratulations Candidate 2!");
        else
            System.out.println("\nElection Tied");
    }
}