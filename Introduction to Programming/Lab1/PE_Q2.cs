using System;

using static System.Console;

namespace Lab1
{
    internal class PE_Q2
    {
        static void Main(string[] args)
        {
            header(1, "Rishabh Banerjee", "Solution for Lab1");
            ReadKey();
        }

        static void header(int asmtNumber, string name, string purpose)
        {
            WriteLine("**************************************************\n"
                + "**\tProgram Assignment #"+asmtNumber+"\t\t\t**\n"
                + "**\tDeveloper: "+name+"\t\t**\n"
                + "**\tDate Submitted: "+DateTime.Now.ToString("dd.MM.yyyy")+"\t\t**\n"
                + "**\tPurpose: "+purpose+"\t\t**\n"
                + "**************************************************");
        }
    }
}
