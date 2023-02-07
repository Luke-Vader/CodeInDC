using static System.Console;

namespace NameSayingApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string name = GetInput("Name");
            string saying = GetInput("Your favourite saying");

            WriteLine($"{name}" +
                $"\n<><><>{saying}<><><>\n");
            ReadKey();
        }

        static string GetInput(string argument)
        {
            Write($"Enter {argument}: ");
            string input = ReadLine();
            return input;
        }

    }
}