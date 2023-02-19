using static System.Console;

namespace rishabhA1_1175_01
{
	public class SalariedEmployee
	{
        //data declarations
		string name;
		string number;
		double salary;
		double overtime;

        //parameterised constructor
        public SalariedEmployee(string name, string number, double salary, double overtime)
        {
            this.name = name;
            this.number = number;
            this.salary = salary;
            this.overtime = overtime;
        }

        //default constructor
        public SalariedEmployee() { }

        public double CalculateSalary() => this.salary + (this.overtime * 45);

        public override string ToString()
        {
            return $"\nDisplaying salaried employee information: " +
                $"\nName: {name} Employee number: {number}" +
                $"\nOvertime hours: {overtime}" +
                $"\nSalary per month: {salary:c2}" +
                $"\nSalary including overtime: {CalculateSalary():c2}\n";
        }
    }
}

