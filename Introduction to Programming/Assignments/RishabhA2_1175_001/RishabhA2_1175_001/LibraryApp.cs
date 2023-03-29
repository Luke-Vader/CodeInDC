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

            //function to display choices and execute relevant actions
            switch (GetChoice())
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

                default:
                    Write("Invalid Input");
                    break;
            }

            ReadKey();
        }

        static string GetChoice()
        {
            Write("..................Library Database...................." +
                "\n\nPlease select an option from the given menu:" +
                "\n\n\tAdd a book to the database...........enter 'A'" +
                "\n\tSearch a book in the database........enter 'S'" +
                "\n\tDisplay all books in the database....enter 'D'" +
                "\n\tExit.....enter 'E'" +
                "\nEnter your choice here:");
            return ReadLine();   
        }

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
            Write("Enter the location and number of copies for four locations");

            for (int i = 0; i < locations.Length; ++i)
            {
                Write($"Enter location {i}: ");
                locations[i] = ReadLine();
                Write("Enter the number of copies: ");
                copies[i] = int.Parse(ReadLine());
            }

            Book book = new Book(id, name, author, locations, copies);
            if(index == 0)
            {
                books[0] = book;
            } else
            {
                index++;
                books[index] = book;
            }

        }

        static void SearchBook(ref Book[] books)
        {
            string id = "";                         //id of book to search
            Book searchedBook = new Book(); //staging the searched book
            if(books.Length != 0)
            {
                Write("Enter Book ID to search: ");
                id = ReadLine();
                int index = 0;
                    foreach(Book book in books)             //searching array against id
                    {
                        if(book.GetId() == id)
                        {
                            searchedBook = book;
                        }
                        index++;
                    }                
            } else
            {
                Write("The array is empty");
            }

            if (searchedBook.GetId() != null)
            {
                Write($"Book with {id} was not found");
            }
            else
            {
                Write(searchedBook.ToString());
            }
        }

        static void DisplayAll(ref Book[] books)
        {

            if(books.Length == 0)
            {
                WriteLine("There is no data to display");
            }
            else
            {
                foreach(Book book in books)
                {
                    Write(book.ToString());
                }
            }

        }
    }
}