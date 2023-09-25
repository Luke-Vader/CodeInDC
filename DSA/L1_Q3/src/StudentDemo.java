/**
 * Author: Rishabh Banerjee
 * Date: Sep 12 2023
 * Objective: Implement abstract classes and abstract methods to demonstrate polymorphism  
 * */

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lets assume I made an array even though I haven't		
		UndergraduateStudent under = new UndergraduateStudent();
		GraduateStudent grad = new GraduateStudent();
		StudentAtLarge sAtLarge = new StudentAtLarge();
		
		//each instance of a different type of Student will have different tuition
		System.out.println("Under Graduate Tuition: $" + under.tuition
				+ "\nStudent At Large Tuition: $" + sAtLarge.tuition 
				+ "\nGraduate Tuition: $" + grad.tuition);
		
	}

}
 