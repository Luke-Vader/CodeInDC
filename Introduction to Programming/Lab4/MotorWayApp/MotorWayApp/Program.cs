using static System.Console;

namespace MotorWayApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //data declarations
            string input;
            Motorway mw = new Motorway();

            //taking data from the user
            Write("\t\tEnter Motorway Details\n" + "Name: ");
            mw.Name = ReadLine();

            Write("Type: ");
            mw.Type = ReadLine();

            Write("Direction: ");
            mw.Direction = ReadLine();

            Write("Surface: ");
            mw.Surface = ReadLine();

            Write("Number of Lanes: ");
            mw.Lanes = int.Parse(ReadLine());

            Write("Toll Status: ");
            mw.Toll = ReadLine();

            Write("Maintainence Party: ");
            mw.Maint = ReadLine();
            
            //display methods 
            mw.DisplayName();
            mw.DisplayNameLanes();
            mw.DisplayNameToll();

            WriteLine(mw.ToString());
            ReadKey();
        }
    }
}
