using static System.Console;

namespace Grading{

    class Program
    {

        static void Main()
        {
            //Initialisation
            int hw = 97;
            int proj = 82;
            int quiz = 60;
            int exam = 75;
            int fexam = 80;

            //Calculation
            double wavg = hw * (0.1) +
                proj * (0.35) +
                quiz*(0.1) +
                exam*(0.3) +
                fexam*(0.15);

            //Output
            WriteLine("\tGrading App" +
                $"\nHomework (10%): {hw}" +
                $"\nProjects (35%): {proj}" +
                $"\nQuizzes (10%): {quiz}" +
                $"\nExams (30%): {exam}" +
                $"\nFinal Exam (15%): {fexam}" +
                $"\nWeighted Average: {wavg:f2}");

        }
    }
}