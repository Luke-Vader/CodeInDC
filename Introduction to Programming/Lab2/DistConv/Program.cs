using static System.Console;

namespace DistConv
{
    internal class Program
    {
        static void Main(string[] args)
        {
            float miles = 4.5f;
            float feet = miles * 5280;
            double km = miles * 1.609344;

            WriteLine($"\t\tDistance Converter App\nMiles: {miles:f2}" +
                $"\n\t\tEquivalent Values\nFeet: {feet:n0}" +
                $"\nKilometres: {km:f2}");
            ReadKey();
        }
    }
}
