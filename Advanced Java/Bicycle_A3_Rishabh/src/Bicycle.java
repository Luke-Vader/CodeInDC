public class Bicycle {

    String customerName;
    int numberOfDays;
    int model;          //1, 2 and 3
    boolean seniorCitizen;
    boolean member;

    public Bicycle(String customerName, int numberOfDays, int model, boolean seniorCitizen, boolean member) {
        this.customerName = customerName;
        this.numberOfDays = numberOfDays;
        this.model = model;
        this.seniorCitizen = seniorCitizen;
        this.member = member;
    }

    public Bicycle () { }

    public double derivedDiscount() {

        double discount = 0;

        //calculating total discount
        if (numberOfDays > 10)
            discount += 0.15;
        else if (numberOfDays > 6)
            discount += 0.08;

        if (member)
            discount += 0.12;

        if (seniorCitizen)
            discount += 0.1;

        return discount;
    }

    public double computeTariff(){

        double rate = 0;
        switch (model){
            case 1 -> rate = 14;
            case 2 -> rate = 12;
            case 3 -> rate = 10;
        }

        return (rate * this.numberOfDays) - (this.derivedDiscount() * (rate * this.numberOfDays));
    }
}
