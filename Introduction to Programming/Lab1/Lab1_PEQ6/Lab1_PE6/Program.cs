using static System.Console;

namespace Lab1_PE6
{
    class Header
    {
        static void Main()
        {
            //Output 1
            WriteLine("Output #1");
            Write("\tYou either die a hero ");
            Write("or live long enough ");
            Write("to see yourself become the villain.\n");

            //Output 2
            WriteLine("\nOutput #2");
            Write("\tYou either die a hero\n");
            Write("\tor live long enough\n");
            Write("\tto see yourself become the villain.\n");

            //Output 3
            WriteLine("\nOutput #3");
            WriteLine("\tYou\n\teither\n\tdie\n\ta\n\thero\n" +
                "\tor\n\tlive\n\tlong\n\tenough\n" +
                "\tto\n\tsee\n\tyourself\n\tbecome\n\tthe\n\tvillain.\n");
        }

    }
}
