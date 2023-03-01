using BMIApp;
using static System.Console;

namespace BMIAapp
{

    internal class Program
    {
        static void Main(string[] args)
        {
            //data declarations
            string input;
            float height;
            float weight;

            //fetching user input
            Write("Enter Height(in cm): ");
            input = ReadLine();
            if (!float.TryParse(input, out height))
                Write("Please provide numerical value.");

            Write("Enter Weight(in kg): ");
            input = ReadLine();
            if (!float.TryParse(input, out weight))
                Write("Please provide numerical value");

            Clear();

            //instantiating BMI object
            BMI bmi = new BMI(height, weight);
            WriteLine(bmi.ToString());

        }
    }

}