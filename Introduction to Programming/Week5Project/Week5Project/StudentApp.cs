using static System.Console;

namespace Week5Project
{
    internal class StudentApp
    {
        static void Main(string[] args)
        {
            WriteLine("Hello");
            string input;
            //Console.ReadKey();

            Student student = new Student();        //initialise

            //Using the Setter function to change the firstname
            WriteLine("Enter Student First Name: ");
            input = ReadLine();
            student.SetName(input);
            WriteLine($"Student First Name: {student.GetName()}");

            //using the property for changing the value in the lastname
            WriteLine("Enter Student Last Name: ");
            input = ReadLine();
            student.LastName = input;
            WriteLine($"Student Last Name: {student.LastName}");

            //checking custom Property for id (passed value*2)
            WriteLine("Enter Student ID: ");
            input = ReadLine();
            student.Id = int.Parse(input);
            WriteLine($"Student ID: {student.Id}");

            WriteLine("\n Override for ToString()\n" + student.ToString());

        }
    }
}
