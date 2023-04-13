using static System.Console;

namespace RainfallAnalysis
{

    internal class Program
    {
        //data declarations
        static int[] rainfall = new int[12];
        static string[] month = new string[12]
            { "January" , "February" , "March" , "April" , "May" , "June"
                , "July" , "August" , "September" , "October" , "November" , "December" };

        static int sum = 0;


        static void Main()
        {
            for (int i = 0; i < month.Length; ++i)
            {
                Write($"Please enter the rainfall amount for {month[i]}: ");
                while (!int.TryParse(ReadLine(), out rainfall[i]))
                {
                    WriteLine($"Invalid Input" +
                        $"\n Please enter the rainfall amount for {month[i]}: ");
                }
                sum += rainfall[i];
            }
            Display();
            ReadKey();
        }

        private static void Display()
        {
            WriteLine($"\tRainfall App\n\nAverage Rainfall: {sum/12}" +
                $"\n\nMonth\t\tRainfall Amt.\t\tVariance");

            for(int i = 0; i < month.Length; ++i)
                WriteLine($"{month[i]}\t\t{rainfall[i]}\t\t{Math.Abs(rainfall[i] - (sum/12))}");
        }
    }

}