public class Student {

    private double number;
    private String name;
    private double grade;

    public Student() { }

    public Student(double number, String name, double grade) {
        this.number = number;
        this.name = name;
        this.grade = grade;
    }


    //method to manage student display
    public void display(){
        System.out.printf("\nStudent Number: %.0f", this.number);
        System.out.print("\nStudent Name: " + this.name);
        System.out.printf("\nThe grade is %.2f\n", this.grade);
    }

    public String write(){
        return this.number + "," + this.name + "," + this.grade + "\n";
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }
}
