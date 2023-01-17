using System;
//System is a namespace existing in .NET FCL.

using static System.Console;
//This makes Console class functions accessible

namespace FirstProject        
//A Collection of classes(namespace) in this case FirstProject is user defined namespace.
{
    class HelloWorld
    {
        static void Main(string[] args)
        //program execution will start from this method.
        {
            WriteLine("Hello World");
            WriteLine("Douglas College \n \nBC");
            //Console.WriteLine("BC");
            WriteLine(4567);
            WriteLine("****");
            ReadKey();
        }
    }
}
