using static System.Console;

namespace RishabhA2_1175_001
{
    internal class LibraryApp
    {

        static int index = 0;

        static void Main()
        {
            //data declarations
            Book[] books = new Book[30];
            string choice;

            do
            {
                choice = GetChoice();                   //function to display choices and execute relevant actions
                switch (choice)
                {
                    case "A":
                        AddBook(ref books);
                        break;

                    case "S":
                        SearchBook(ref books);
                        break;

                    case "D":
                        DisplayAll(ref books);
                        break;

                    case "E":
                        WriteLine("Goodbye");
                        break;

                    default:
                        Write("Invalid Input");
                        break;
                }
            } while (choice != "E");
            ReadKey();
        }

        //Choice Display Method
        static string GetChoice()
        {
            Write("\n..................Library Database...................." +
                "\n\nPlease select an option from the given menu:" +
                "\n\n\tAdd a book to the database...........enter 'A'" +
                "\n\tSearch a book in the database........enter 'S'" +
                "\n\tDisplay all books in the database....enter 'D'" +
                "\n\tExit.....enter 'E'" +
                "\nEnter your choice here:");
            return ReadLine();   
        }

        //Method to add books in the array
        static void AddBook(ref Book[] books)
        {

            //staging variables
            string id;
            string name;
            string author;
            string[] locations = new string[4];
            int[] copies = new int[4];

            
            Write("Enter book id: ");
            id = ReadLine();
            Write("Enter book name: ");
            name = ReadLine();
            Write("Enter author name: ");
            author = ReadLine();
            Write("Enter the location and number of copies for four locations\n");

            //fetching input from user for 4 locations
            for (int i = 0; i < locations.Length; ++i)
            {
                Write($"Enter location {i+1}: ");
                locations[i] = ReadLine();
                Write("Enter the number of copies: ");
                copies[i] = int.Parse(ReadLine());
            }

            //creating the object to add it to the array
            Book book = new Book(id, name, author, locations, copies);
            if(index == 0)
            {
                books[0] = book;
            } else
            {
                books[index] = book;
            }
            index++;
            WriteLine($"{name}, {author} has been added to the array\n");

        }

        //method to search for a book in the array by id
        static void SearchBook(ref Book[] books)
        {
            string id = "";                         //id of book to search
            Book searchedBook = new Book(); //staging the searched book
            if(index != 0)
            {
                Write("Enter Book ID to search: ");
                id = ReadLine();
                for(int i = 0; i < index; ++i)             //searching array against id
                {
                    if (books[i].GetId() == id)
                    {
                        searchedBook = books[i];
                    }
                }

                //attempting to display searched book
                if (searchedBook.GetId() == null)
                {
                    Write($"Book with {id} was not found");
                }
                else
                {
                    Write(searchedBook.ToString());
                }
            } else
            {
                Write("The array is empty");
            }
            
        }

        //method to display all elements in the array 
        static void DisplayAll(ref Book[] books)
        {

            if(index == 0)
            {
                WriteLine("There is no data to display");
            }
            else
            {
                for(int i = 0; i < index; ++i) Write(books[i].ToString());
            }

        }
    }
}