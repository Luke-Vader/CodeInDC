public class Second {

    static int num = 100;
    int data = 9;

    public static void main(String[] args) {

        int a;
        int c = myMethod1(5, 6);

        double d = (double)17/2;                    //if the operands are integer the result is also an integer or
//        double d = 17/2.0;                        //this would also give the same result

        System.out.println("Hello again num is " + num);
        System.out.println(d);
//        System.out.println(myMethod2());
    }

    static int myMethod1(int a, int b) {            //static method
        num = 10;
        int c = 10;
        return a + b;
    }

    public String myMethod2() {                     //non-static method
        int c = data;
        return "This is method 2";
    }
}