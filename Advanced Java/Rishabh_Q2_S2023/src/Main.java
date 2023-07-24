import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static String input;
    static HashMap<Double, Student> studentList = new HashMap<>();

    public static void main(String[] args) {
        checkFile();

        String choice = null;
        do {
            boolean flag = true;
            do {
                System.out.print("(A)dd, (R)emove, (M)odify, (P)rint all, (S)ort or (Q)uit ");
                input = scan.nextLine().trim().toUpperCase();
                choice = input;
                flag = validate(1);

                if (flag)
                    switch (input) {
                        case "A" -> addStudent();
                        case "P" -> displayList();
                        case "R" -> removeStudent();
                        case "M" -> modifyStudent();
                        case "S" -> sortList();
                }
            }while (!flag);

        } while (!choice.equals("Q"));
        System.out.println("Thank you...");

    }

    static private boolean validate (int type) {

        if (type == 1) {                     //choice
            return input.equals("A")
                    || input.equals("R")
                    || input.equals("M")
                    || input.equals("P")
                    || input.equals("S")
                    || input.equals("Q");
        } else if (type == 2){                     //number
                try {
                    double d = Double.parseDouble(input.trim());
                    return true;
                } catch (Exception e){
                    System.out.println("Numeric Input Expected");
                    return false;
                }
        } else
            return false;
    }

    //method to add a student to the list
    static private void addStudent(){

        double number = 0;
        String name;
        double grade = 0;

        //fetching number
        boolean flag = true;
        do {
            System.out.print("Enter the student number ");
            input = scan.nextLine();
            flag = validate(2);
            if (studentList.get(number) != null){
                System.out.println("Student " + number +" already exists");
                flag = false;
            }
            if (flag)
                number = Double.parseDouble(input.trim());
        }while (!flag);
        flag = true;

        //fetching name
        System.out.print("Enter the student name: ");
        input = scan.nextLine();
        name = input.trim();

        do {
            //fetching grade
            System.out.print("Enter the student grade ");
            input = scan.nextLine();
            flag = validate(2);
            if (flag)
                grade = Double.parseDouble(input.trim());
        }while (!flag);

        //creating student object to add to the hashmap
        Student student = new Student(number, name, grade);
        studentList.put(number, student);
        updateFile();
    }

    //method to display all students in the list
    static private void displayList(){
        if (!studentList.isEmpty()) {

            System.out.println("\nThere are currently " + studentList.size() + " record(s) in your class list");
            for (Map.Entry<Double, Student> studentEntry : studentList.entrySet()) {
                studentEntry.getValue().display();
            }
        } else
            System.out.println("No Records Found......");
    }

    //removes the student from the list
    static private void removeStudent(){

        double number;

        System.out.print("Enter the student number ");
        input = scan.nextLine();
        number = Double.parseDouble(input);

        //checking if student exists
        Student removing = studentList.get(number);

        //if student is found
        if (removing != null){
            System.out.println("Student Found");
            removing.display();

            //delete confirmation
            System.out.print("\nDo you really want to delete this record? Y/N: ");
            input = scan.nextLine().trim().toUpperCase();
            if (input.equals("Y")) {
                studentList.remove(number);
                System.out.println("Record Updated......");
            } else {
                System.out.println("Aborted");
            }

            //if student doesn't exist
        } else {
            System.out.println("The record is not existing");
        }
        updateFile();
    }

    //method to modify the student grade
    static private void modifyStudent(){

        double number = 0;
        boolean flag = true;
        do {
            System.out.print("Enter the student number ");
            input = scan.nextLine();
            flag = validate(2);
            if (flag)
                number = Double.parseDouble(input.trim());
        }while (!flag);
        flag = true;

        //checking if student exists
        Student modifying = studentList.get(number);

        if (modifying != null) {
            do {
                System.out.print("Enter the student grade ");
                input = scan.nextLine().trim();
                flag = validate(2);
                if (flag) {
                    modifying.setGrade(Double.parseDouble(input));
                    System.out.print("\nRecord Updated......\n");
                }
            }while (!flag);
        } else {
            System.out.println("The record is not existing");
        }
        updateFile();
    }

    static private <tempStudents> void sortList(){

        int ctr = 0;
        Student[] students = new Student[studentList.size()];
        
        for (Double key : studentList.keySet()) {
            students[ctr] = studentList.get(key);
            ctr++;
        }
        
        Student[] tempStudents = students.clone();
        Student temp = null;
        for (int i = 0; i < students.length; ++i) {
            for (int j = 0; j < tempStudents.length; ++j)
                if(students[i].getName().compareToIgnoreCase(tempStudents[j].getName()) > 0) {
                    temp = students[i];
                    students[i] = tempStudents[j];
                    tempStudents[j] = temp;
                }
                    
        }

        System.out.println("Sorted Student List: ");
        for (Student tempStudent : tempStudents) tempStudent.display();
        
    }

    static private void checkFile(){

        try {

            File file = new File("Students.txt");

            //populates the list from the text file if it exists
            if (file.exists()) {
                Scanner fileReader = new Scanner(file);
                while (fileReader.hasNextLine()){
                    String[] details = new String[3];
                    details = fileReader.nextLine().split(",");
                    Student student = new Student(Double.parseDouble(details[0].trim()),
                                                    details[1],
                                                    Double.parseDouble(details[2].trim()));
                    studentList.put(Double.parseDouble(details[0].trim()), student);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    
    static private void updateFile(){
        try {
            FileWriter writer = new FileWriter("students.txt");
            for (Double studentNumber : studentList.keySet()) {
                writer.write(studentList.get(studentNumber).write());
            }
            writer.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}