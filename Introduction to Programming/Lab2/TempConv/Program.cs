using static System.Console;

namespace TempConv
{
    internal class Program
    {

        static void Main(string[] args)
        {
            //data declarations
            int celsius = 32;
            float farenheit = ((float)celsius * 9)/5 + 32;

            WriteLine($"\t\tTemperature Conversion App\n" +
                $"Degree Celsius: {celsius}\n" +
                $"Degree Fahrenheit: {farenheit:f1}\n");

        }
    }
}
