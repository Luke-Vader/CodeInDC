using static System.Console;

namespace rishabhA1_1175_01
{
    internal class EmployeeApp
    {
        static void Main(string[] args)
        {

            //data declarations
            string input,
                name,
                number;

            string prop1,
                prop2;

            string welcomeMessage = "This application performs computations for three types of objects." +
                "\n\nThree (3) tests will be performed, 1 for employee and 1 for commissioned employee and 1 for salaried employees" +
                "\n\nUnique characteristics of each employee will be displayed." +
                "\n\nPress any key when you are ready to begin" +
                "\nEnter information about an employee\n";

            WriteLine($"{welcomeMessage}");

            //Fetching Employee details from user using a method for each field
            GetInfo("employee name", out name);
            GetInfo("employee number", out number);
            GetInfo("hourly rate", out prop2);
            GetInfo("department", out prop1);
            Write("# of hours worked: ");
            input = ReadLine();

            //Creating the Employee object with the parameterised constructor
            Employee employee = new Employee(name,
                                             number,
                                             prop1,
                                             double.Parse(prop2));

            employee.CalculateGrossPay(double.Parse(input));

            //displaying Employee
            WriteLine(employee.ToString());             //ToString() is not required here 

            WriteLine("\nPress any key to see the next test...");
            ReadKey();

            //Fetching Commissioned Employee details from user using a method for each field
            WriteLine("Enter information about a commissioned employee");
            GetInfo("employee name", out name);
            GetInfo("employee number", out number);
            GetInfo("commission rate", out prop2);
            GetInfo("weekly sales", out prop1);

            //Creating the Commissioned Employee object with parameterised constructor
            CommissionedEmployee commissionedEmployee = new CommissionedEmployee(name,
                                                                                 number,
                                                                                 double.Parse(prop1),
                                                                                 double.Parse(prop2));

            //displaying commissionedEmployee
            WriteLine(commissionedEmployee.ToString());

            WriteLine("Press any key to see the next test...");
            ReadKey();

            //Fetching Commissioned Employee details from user using a method for each field
            WriteLine("Enter information about a salaried employee");
            GetInfo("employee name", out name);
            GetInfo("employee number", out number);
            GetInfo("monthly salary", out prop1);
            GetInfo("overtime hours", out prop2);

            //Creating the Commissioned Employee object with parameterised constructor
            SalariedEmployee salariedEmployee = new SalariedEmployee(name,
                                                                     number,
                                                                     double.Parse(prop1),
                                                                     double.Parse(prop2));

            //displaying salaried employee
            WriteLine(salariedEmployee.ToString());

            WriteLine("Press any key to exit...");
            ReadKey();
        }

        static private void GetInfo(string message, out string value)
        {   
            Write($"Enter {message}: ");
            value = ReadLine();
        }
    }
}
