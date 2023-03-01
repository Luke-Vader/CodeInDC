using static System.Console;

namespace Week8Project
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int score = 57;
            bool check = true;

            if (check)
            {
                WriteLine("checked");
            }
            else
            {
                WriteLine("Not Checked");
            }

            int count = 10;

            if (score > 50 & count++ == 10)
            {
                WriteLine("Pass");
            }
            else
                WriteLine("Fail");
        }
    }
}
