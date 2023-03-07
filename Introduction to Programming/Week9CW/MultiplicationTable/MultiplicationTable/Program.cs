using System.Runtime.Remoting.Messaging;
using static System.Console;

namespace MultiplicationTable
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string input;
            int n;
            int ctr = 1;

            Write("Enter a Number: ");
            input = ReadLine();
            n = int.Parse(input);

            while(ctr < 11)
            {
                WriteLine($"{ctr} x {n} = {ctr*n}");
                ctr++;
            }

        }
    }
}
