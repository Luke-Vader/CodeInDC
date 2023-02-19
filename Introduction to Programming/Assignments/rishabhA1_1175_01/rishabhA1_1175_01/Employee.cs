using static  System.Console;

namespace rishabhA1_1175_01
{
	public class Employee
	{
        //data declarations
		string name;
		string number;
		string department;
		double rate;
        double salary;

        //parameterized constructor
        public Employee(string name, string number, string department, double rate)
        {
            this.name = name;
            this.number = number;
            this.department = department;
            this.rate = rate;
        }

        //default constructor
        public Employee() { }

        //Method to calculate gross pay
        public double CalculateGrossPay(double hours)
        {
            this.salary = hours * this.rate;
            return this.salary;
        }

        //overriden method to display all details
        public override string ToString()
        {
            
            return $"\nDisplaying employee information" +
                $"\nEmployee name: {name}" +
                $"\nemployee number: {number}" +
                $"\ndepartment: {department}" +
                $"\nhourly pay rate: {rate:c2}" +
                $"\n Employee Salary: {salary:c2}";
        }

	}
}

