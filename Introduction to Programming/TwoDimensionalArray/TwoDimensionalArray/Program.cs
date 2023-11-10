using static System.Console;

namespace TwoDimensionalArray
{
    internal class Driver
    {

        static TwoDimensional array;

        public static void Main(String[] args)
        {
            WriteLine("Create a Two Dimensional Integer Array" +
                "\n Enter Rows: ");

            int row, col;

            while (!int.TryParse(ReadLine(), out row))
            {
                Write("Invalid Input: Expected Value was of type int" +
                    "\nEnter Rows: ");
            }

            WriteLine("Enter Columns: ");
            while (!int.TryParse(ReadLine(), out col))
            {
                Write("Invalid Input: Expected Value was of type int" +
                    "\nEnter Columns: ");
            }

            array = new TwoDimensional(row, col);
            array.fillMatrix();
            array.display();

        }
    }

    internal class TwoDimensional
    {

        int row;
        int col;
        int[,] matrix;

        public TwoDimensional(int row, int col)
        {
            this.row = row;
            this.col = col;
            matrix = new int[row, col];
        }

        public void display()
        {
            for (int i = 0; i < row; i++)
            {
                WriteLine();
                for(int j = 0; j < col; j++)
                {
                    Write($"{matrix[i,j]}" + "\t");
                }
            }
        }

        public void fillMatrix()
        {
            WriteLine("Filling the MATRIX.\n\n");
            for(int i = 0; i < row; i++)
            {
                for(int j = 0; j < col; ++j)
                {
                    int data;
                    WriteLine($"[{i},{j}] : Row -> {i+1} | Column -> {j+1}  :  ");
                    while (!int.TryParse(ReadLine(), out data))
                    {
                        Write("Invalid Input: Expected Value was of type int" +
                            $"[{i},{j}] : Row -> {i+1} | Column -> {j+1}  :  ");
                    }
                    matrix[i,j] = data;
                }
            }
        }
    }
}