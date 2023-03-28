using static System.Console;

namespace SayMyName
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string input;
            do
            {
                Write("Rishabh\nEnter Y to see it again");
                input = ReadLine();
            } while (input == "Y" || input == "y");
        }
    }
}