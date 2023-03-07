using System.Runtime.Remoting.Messaging;
using static System.Console;

namespace MultiplicationTable
{
    internal class Program
    {
        static void Main(string[] args)
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
            while(ctr < 11)
            {
                WriteLine($"{ctr} x {n} = {ctr*n}");
                ctr++;
            }

        }
    }
}
