using static System.Console;
using System.Linq;
using System.Collections;

namespace Week10Project
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string input;
            int value;
            int max, min;

            WriteLine("Hello Worlds");
            double[] dArray = new double[5];
            
            int[] iArray = new int[5];
            char[] cArray = { 'A', 'B', 'C' };

            //Linq has methods for enumerable objects to find values accross the board
            WriteLine($"Sum of integer array: {iArray.Sum()}");

            //populating the integer array
            for (int i = 0; i < iArray.Length; i++)
            {
                WriteLine($"Enter Array elements in integer");
                input = ReadLine();

                //validation because the user can't read "integer"
                while (!int.TryParse(input, out value))
                {
                    WriteLine("Invalid Input");
                    WriteLine($"Enter Array elements in integer");
                    input = ReadLine();
                }
                iArray[i] = value;
            }

            //initializing with first elements of the array 
            max = iArray[0];
            min = iArray[0];

            //making Linq feel useless
            foreach (int i in iArray)
            {
                if (min > i) min = i;
                if (max < i) max = i;
            }

            WriteLine($"Minimum: {min}" +
                $"\nMaximum: {max}");

            ReadKey();
        }
    }
}
