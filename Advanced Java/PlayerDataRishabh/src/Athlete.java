public class Athlete {

    String firstName;
    String lastName;
    int id;
    int[] points;

    public Athlete(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public Athlete() {}

    public double getAverageScore(){
        int sum = 0;
        for (int point: points)
            sum += point;
        return (double) sum /points.length;
    }

}
