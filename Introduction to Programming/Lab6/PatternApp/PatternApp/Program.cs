using static System.Console;

namespace PatternApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Pyramid();
            ReadKey();
        }


        public static void Show(int input)
        {
            int temp;
            temp = input;
            for (int i = 1; i <= input; i++)
            {
                for (int j = 1; j <= temp - 1; j++)
                {
                    Console.Write(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++)
                {
                    Console.Write("*");
                }
                temp--;
                Console.WriteLine();
            }
        }
        static void Pyramid()
        {
            Console.WriteLine("Enter the number of rows \n");
            int input = Convert.ToInt32(Console.ReadLine());
            Show(input);
            Console.ReadLine();

            ReadKey();
        }


    }
}