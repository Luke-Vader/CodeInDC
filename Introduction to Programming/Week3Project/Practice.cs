using static System.Console;

namespace Week3Project
{
    internal class Practice
    {
        static void Main(string[] args)
        {
            // datatype name = ...;
            int iValue = 35;
            double dValue = 678.8142;

            //printing variables with placeholders
            //we can format variables like ":c" is used to add the currency format
            //significant figures can be specifed by ":f3" as suffix on floating point variables
            WriteLine("iValue = {0:c} \ndValue = {1:f3}", iValue, dValue);

            //Using the $ symbol to use variables right inside the string
            WriteLine($"iValue = {iValue:c} dValue = {dValue}");

            //output formatters can be used to store in strings as well
            string output = $"iValue = {iValue:c} dValue = {dValue}";
            WriteLine("Output: " + output);

            //suffix "f" for float
            float fValue = 354.212f;
            bool bValue = false;

            //suffix "m" for decimal
            decimal decNumber = 48621.1685435m;
            string name = "Douglas";

            //@ skips any escape characters and considers the string as it is
            string fileName = @"C:\Users\Desktop\TestFile.txt";

            int a = 100;
            int b = 33;
            double result = a / b;      //This would give an integer as a result because C#
            WriteLine("a/b = " + result);


        }
    }
}
