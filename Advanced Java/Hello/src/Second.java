public class Second {

    static int num = 100;
    int data = 9;

    public static void main(String[] args) {

        int a;
        int c = myMethod1(5, 6);

        System.out.println("Hello again num is " + num);
        System.out.println(c);
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