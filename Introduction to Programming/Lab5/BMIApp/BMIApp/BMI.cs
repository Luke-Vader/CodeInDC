using static System.Console;

namespace BMIApp
{
	internal class BMI
	{

		public float height;
		public float weight;

        public BMI(float height, float weight)
        {
            this.height = height;
            this.weight = weight;
        }

        public BMI() {}

        public float GetBmi()
        {
            return this.weight / (this.height / 100 * this.height / 100);
        }

        public string GetWeightStatus()
        {
            if (GetBmi() < 18.5)
                return "Underweight";
            else if (GetBmi() >= 18.5 & GetBmi() <= 24.9)
                return "Normal";
            else if (GetBmi() >= 25 & GetBmi() <= 29.9)
                return "Overweight";
            else if (GetBmi() >= 30)
                return "Obese";
            else
                return "";
        }

        public override string ToString()
        {
            return "\tBMI App" +
                $"\nWeight (kilograms): {this.weight}" +
                $"\nHeight (Meters): {(this.height)/100:f2}" +
                $"\nBMI: {GetBmi():f2}" +
                $"\nWeight Status: {GetWeightStatus()}";
        }
    }
}

