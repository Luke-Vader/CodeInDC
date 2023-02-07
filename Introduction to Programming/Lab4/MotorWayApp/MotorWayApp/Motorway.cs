using static System.Console;

namespace MotorWayApp
{
    internal class Motorway
    {

        public string Name { get; set; }
        public string Type { get; set; }
        public string Direction { get; set; }
        public string Surface { get; set; }
        public int Lanes { get; set; }
        public string Toll { get; set; }
        public string Maint { get; set; }

        //Default Constructor
        public Motorway() { }

        //Constructor with Name, Type, Number of Lanes
        public Motorway(string name, string type, int lanes)
        {
            this.Name = name;
            this.Type = type;
            this.Lanes = lanes;
        }

        //Full Constructor
        public Motorway(string name, string type, string direction, string surface, int lanes, string toll, string maint)
        {
            Name = name;
            Type = type;
            Direction = direction;
            Surface = surface;
            Lanes = lanes;
            Toll = toll;
            Maint = maint;
        }

        public void DisplayName() {
            WriteLine($"\nMotorway Name: {this.Name}");
        }

        public void DisplayNameToll()
        {
            WriteLine($"\nMotorway Name: {this.Name}" +
                $"\nToll Status {this.Toll}");
        }

        public void DisplayNameLanes() 
        {
            WriteLine($"\nMotorway Name: {this.Name}" +
                $"\nNumber of Lanes: {this.Lanes}");

        }

        public override string ToString()
        {
            return $"\t\tMotorway Details\n" +
                $"\nName: {Name}" +
                $"\nType: {Type}" +
                $"\nDirection: {Direction}" +
                $"\nSurface: {Surface}" +
                $"\nNumber of Lanes: {Lanes}" +
                $"\nToll: {Toll}" +
                $"\nMaintainance Party: {Maint}";
        }
    }
}
