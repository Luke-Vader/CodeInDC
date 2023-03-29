using System;
namespace RishabhA2_1175_001
{
	public class Book
	{
        //fields
        string id;
        string name;
        string author;
        string[] locations;
        int[] copies;

        //paramtereised constructor
        public Book(string id, string name, string author, string[] locations, int[] copies)
        {
            this.id = id;
            this.name = name;
            this.author = author;
            this.locations = locations;
            this.copies = copies;
        }

        //default constructor
        public Book() { }

        public string GetId() => this.id;
        public string GetName() => this.name;
        public string GetAuthor() => this.author;
        public string[] GetLocations() => this.locations;
        public int[] GetCopies() => this.copies;

        public override string ToString()
        {
            //data declarations
            string avail = "";
            int max = this.copies[0];
            int max_pos = 0;
            int total = 0;
            int ctr = 0;

            //finding the maximum available copies location
            foreach(string location in this.locations)
            {
                if (max < copies[ctr])
                {
                    max = copies[ctr];          //max quantity
                    max_pos = ctr;              //max location position 
                }
                total += copies[ctr];
                avail += "\n" + location + "\t\t\t" + this.copies[ctr];
                ctr++;
            }
            return $"Book Id : {this.id} name : {this.name}" +
                $"\nLocation \t\t Number of Books Available" +
                $"{avail}" +
                $"\n\n{total} are the total number of copies" +
                $"\n{this.locations[max_pos]} has the maximum number of copies";
        }
    }
}

