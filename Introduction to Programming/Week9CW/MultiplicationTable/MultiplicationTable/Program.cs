using System.Runtime.Remoting.Messaging;
using static System.Console;

namespace MultiplicationTable
{
    internal class Program
    {
        static void Main(string[] args)
        {

            //Multiplication();
            //Sum();
            //Power();
            //Sentinel();
            DW();
        }

        static void Multiplication()
        {
            //data declarations
            string input;
            int n;
            int ctr = 1;

            //user input and conversion
            Write("Enter a Number: ");
            input = ReadLine();
            n = int.Parse(input);

            //loop to display and multiply values
            while (ctr < 11)
            {
                WriteLine($"{ctr} x {n} = {ctr * n}");
                ctr++;
            }
        }

        static void Sum()
        {
            int ctr = 0;
            int sum = 0;

            while(ctr <= 10)
            {
                sum += ctr;
                ctr++;
            }

            WriteLine($"Sum: {sum}");
        }

        static void Power()
        {
            string input;
            int ctr = 1;
            int b;
            int exp;
            int result = 1;

            WriteLine("Enter Base: ");
            input = ReadLine();
            b = int.Parse(input);

            WriteLine("Enter Exponent: ");
            input = ReadLine();
            exp = int.Parse(input);

            while (ctr <= exp)
            {
                result *= b;
                ctr++;
            }
            WriteLine($"{b}^{exp} = {result}");
        }

        static void Sentinel()
        {
            char c;
            string input;

            Write("Enter 'Y' to exit");
            input = ReadLine();
            c = char.Parse(input);

            while(c != 'Y' && c != 'y')
            {
                WriteLine("Enter 'Y' to exit");
                input = ReadLine();
                if(!char.TryParse(input, out c))
                {
                    WriteLine("Invalid Input");
                    c = 'a';
                }
            }

        }

        static void DW()
        {
            string input;
            do
            {
                WriteLine("Enter -999 to Exit");
                input = ReadLine();

            } while (input != "-999");

        }



    }
}
