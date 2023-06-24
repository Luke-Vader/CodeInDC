import java.util.ArrayList;

public class Athlete {

    String firstName;
    String lastName;
    int id;
    int[] points;

    public Athlete(String firstName, String lastName, int id, ArrayList<Integer> scores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.points = new int[scores.size()];
        for(int i = 0; i < scores.size(); ++i){
            this.points[i] = scores.get(i);
        }
    }

    public Athlete() {}

    //method to calculate average score
    public double getAverageScore(){
        int sum = 0;
        for (int point: points)
            sum += point;
        return (double) sum /points.length;
    }

    //method to display the
    public void display(){
        System.out.println(this.firstName + "\t"
                        + this.lastName + "\t\t"
                        + String.format("%.2f",this.getAverageScore()));

    }


}
