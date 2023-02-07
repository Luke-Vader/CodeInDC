using static System.Console;

namespace SchoolInformation
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Asterisks();
            PrintInformation();
            Asterisks();
        }

        static void PrintInformation()
        {
            WriteLine("Douglas College" +
                "\n700 Royal Ave, New Westminster, BC V3M 5Z5" +
                "\nhttps://www.douglascollege.ca/");
        }

        static void Asterisks()
        {
            WriteLine("******************************************");
        }

    }
}