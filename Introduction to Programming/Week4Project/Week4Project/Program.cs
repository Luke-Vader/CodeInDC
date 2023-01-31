using System;
using static System.Console;

namespace Week4Project
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = 10;
            char c;
            Pbr(ref n);                 //passing by reference with "ref" with INITIALISATION
            Pbr(out c);                 //passing by reference with "out" but has to be uninitialised
            WriteLine($"Post Pbr: {n}");

            double area = Area(GetDimension("width"), GetDimension("length"));
            WriteLine($"Cost: {Cost(area, 5):c2}");
            ReadKey();

            //Optional Parameters
            DoSomething("Rishabh");
            //paramters can be labelled as well to change the order
            DoSomething("Rishabh", major: "BUIS");
        }

        private static void Pbr(ref int num)              //adding ref to the parameter makes it a pbr
        {
            num /= 10;
            WriteLine($"Inside Pbr: {num}");
        }

        //adding out to the parameter makes it a pbr but the passed variable has to have garbage value
        private static void Pbr(out char c)
        {
            c ='A';
            WriteLine($"Inside Pbr with \"out\": {c}");
        }

        public static void DoSomething(string name, int age = 21,
            bool currentStudent = true, string major = "CS")
        { 
            WriteLine(name);
            WriteLine(age);
            WriteLine(currentStudent);
            WriteLine(major);
        }


        static void DisplayInstruction()
        {
            WriteLine("Instructions");
        }

        static double GetDimension(string side)
        {
            Write($"Enter {side}:");
            string input = ReadLine();
            //float length = float.Parse(input);
            double length = Convert.ToDouble(input);
            /*WriteLine($"Entered Width: {width:f1}");*/
            return length;
        }

        static double Area(double w, double l)
        {
            WriteLine($"Area: {w*l}");
            return w*l;
        }

        static double Cost(double area, double rate) => area*rate;
    }
}
