using System;

namespace Week5Project
{
    public class Student
    {

        private string firstName;
        private string lastName;
        private int id;
        private string major;
        private double score1;
        private double score2;

        public Student() { }

        public Student(string firstName, string lastName, int id, string major, double score1, double score2)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = id;
            this.major = major;
            this.score1 = score1;
            this.score2 = score2;
        }

        //Constructors can initialise Properties directly making fields only necessary
        //for internal abstract operations
        public Student(string firstName)
        {
            this.FirstName = firstName;
        }

        //classic getter setter methods which are obsolete because welcome to Properties
        public string GetName()
        {
            return this.firstName;
        }

        public void SetName(string firstName)
        {
            this.firstName = firstName;
        }

        //Property can replace the getter and setter methods for a field
        //Property name is in PascalCase
        public string FirstName
        {
            get { return this.firstName; }
            set { this.firstName = value; }
        }

        public string LastName
        {
            get { return this.lastName; }
            set { this.lastName = value; }
        } //properties are the way to go for attribute modification inside the class

        public int Id
        {
            get { return this.id;  }
            set { this.id = value*2; }          //Value will change according to the equation
        }

        //shorthand for default Property - field declarations can be skipped with this approach
        public string Major { get; set; }

        //This will be executed if object.ToString() is called instead of the default
        //action of the ToString()
        public override string ToString()
        {
            return firstName + " " + lastName + "\n" + id;
        }
    }
}
