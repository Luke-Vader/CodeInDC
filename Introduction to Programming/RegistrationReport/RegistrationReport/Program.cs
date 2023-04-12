using static System.Console;
using System.Text;

namespace RegistrationReport
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                StreamReader sr = new StreamReader("RegistrationData.txt");
                while (!sr.EndOfStream)
                {

                    string line = sr.ReadLine();
                    int space = int.Parse(line.Substring(12,2)) - int.Parse(line.Substring(8, 2));
                    if (space >= 0)
                        WriteLine($"{line.Substring(0, 5)} has {space} spots left");
                    else
                        WriteLine($"Problem with Course: {line.Substring(0, 5)}" +
                            $"\nStudents Enrolled: {line.Substring(12, 2)}" +
                            $"\nMaximum Allowed: {line.Substring(8, 2)}");
                }

                sr.Close();

            }catch(IOException exc)
            {
                WriteLine("Unable to Read File");
            }

            ReadKey();
        }
    }
}