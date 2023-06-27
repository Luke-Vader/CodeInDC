using System;
using static System.Console;

namespace MarkUpCalc
{
    class Program
    {
        static void Main()
        {
            double wsPrice;
            Write("Enter Wholesale Price: ");
            wsPrice = Double.Parse(ReadLine());

            WriteLine($"Wholesale Price($) \tMarkup(%) \tMarkup Price($)");
            for(int i = 5; i <= 10; ++i)
                WriteLine($"{wsPrice}\t\t\t{i}\t\t{wsPrice + (wsPrice * i) / 100}");
            
        }
    }
}