public class MulTable {

    public static void display(){
        int ctr = 55;
        System.out.printf("%6s", "*");
        while(ctr > 0){
            System.out.print("*");
            ctr--;
        }
        System.out.println();
        System.out.printf("%40s", "Multiplication Table");
        System.out.println();
        ctr = 55;
        System.out.printf("%6s", "*");
        while(ctr > 0){
            System.out.print("*");
            ctr--;
        }

        for (int i = 0; i < 10; ++i){
            System.out.println();
            for (int j = 0; j < 10; ++j){
                System.out.printf("%4s", (i+1)*(j+1));
            }
        }

    }

}
