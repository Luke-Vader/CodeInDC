using static System.Console;

namespace rishabhA1_1175_01
{
	public class CommissionedEmployee
	{

        //data declarations
		string name;
		string number;
		double weeklySales;
		double commissionRate;

        //parameterized constructor
        public CommissionedEmployee(string name, string number, double weeklySales, double commissionRate)
        {
            this.name = name;
            this.number = number;
            this.weeklySales = weeklySales;
            this.commissionRate = commissionRate;
        }

        //explicit default constructor
        public CommissionedEmployee() { }

        //Method to calculate gross pay
        public double CalculateGrossPay()
        {
            return this.weeklySales * (commissionRate/100);
        }

        //Method to calculate Federal Tax
        public double CalculateFedTax() => CalculateGrossPay() * 0.12;
        
        //Method to Calculate Social Security Deduction
        public double CalculateSocSecDed() => CalculateGrossPay() * 0.05;

        //Method to Calculate Total Deductions
        public double CalculateDeductions() => CalculateFedTax() + CalculateSocSecDed();

        //Method to calculate Take-Home Pay
        public double CalculateTakeHomePay() => CalculateGrossPay() - CalculateFedTax() - CalculateSocSecDed();

        //ovverriden method to display all details
        public override string ToString()
        {
            return $"\nDisplaying commissioned employee information:" +
                $"\nName: {name} Employee number: {number}" +
                $"\nWeekly Sales: {weeklySales:c2}" +
                $"\nGross Pay: {CalculateGrossPay():c2}" +
                $"\nFed. Taxes: {CalculateFedTax():c2}" +
                $"\nSoc. Sec.: {CalculateSocSecDed():c2}" +
                $"\n\nTotal Deductions: {CalculateDeductions():c2}" +
                $"\nTake-Home pay: {CalculateTakeHomePay():c2}\n";
        }

    }
}

