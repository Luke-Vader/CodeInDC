//Author: Rishabh Banerjee
//Date: 15/7/23
//Objective: Demonstrate Exception handling

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class Main {

    static HashMap<String, List<Double>> employee = new HashMap<>();

    public static void main(String[] args) {

        double empno= 0.0;
        double annsal = 0.0;
        boolean flag = true;
        String name = "";

        Scanner scan = new Scanner(System.in);

        while(!name.equals("Ex")){
            System.out.print("Enter the employee name, enter Ex to end the program: ");
            name = scan.nextLine();

            if (name.equals("Ex"))
                break;

            System.out.print("Enter the employee number");
            empno = scan.nextDouble();

            flag = true;

            while (flag){
                try{
                    System.out.print("Enter the annual salary: ");
                    annsal = scan.nextDouble();

                    if (annsal == 0 || annsal < 0){

                    }

                    employee.put(name, new ArrayList<>(List.of(empno,annsal)));
                    flag = false;
                } catch (Exception e){
                    System.out.println(e.getMessage());
                    System.out.println("Enter a number");
                    scan.nextLine();                        //to flush out the input stream
                }
            }
            display();
            save();
        }

        save();

    }


    public static void display(){
        System.out.println("There are currently " + employee.size() + " employee(s) in your record(s)");
        if (employee.size() > 0){
            for (Map.Entry<String, List<Double>> entry : employee.entrySet()){
                System.out.println("Employee Name: " + entry.getKey());
                System.out.println("Employee Number: " + employee.get(entry.getKey()).get(0));
                System.out.println("Employee Salary: " + employee.get(entry.getKey()).get(1));
            }
        }
    }

    public static void save() {
        try{
            Path file = Paths.get("myemployeelist.txt");
            OutputStream oStream = new BufferedOutputStream(Files.newOutputStream(file, APPEND, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(oStream));
//            if (employee.size() > 0){
//                String data = "";
//                for (Map.Entry<String, List<Double>> entry : employee.entrySet()){
//                    data = entry.getKey() + " " + employee.get(entry.getKey()).get(0) + " " + employee.get(entry.getKey()).get(1) + "\n";
//                    writer.write(data);
//                }
//            }
            String data = "Demo Text";
            writer.write(data);
            writer.close();
            oStream.flush();
            oStream.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    static public void read(){
        File temp = new File("myemployeelist.txt");
        boolean exists = temp.exists();
        String data = "";
        String input[];

        try{
            if (temp.exists()){
                Scanner scan = new Scanner(temp);
                while (scan.hasNextLine()){
                    data = scan.nextLine();
                    input = data.split("\\s");
                    double un = Double.parseDouble(input[1]);
                    double gr = Double.parseDouble(input[2]);
                    employee.put(input[0], new ArrayList<>(Arrays.asList(un, gr)));
                }
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}