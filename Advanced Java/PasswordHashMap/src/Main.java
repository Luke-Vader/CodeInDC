import com.sun.jdi.Value;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        HashMaps();
//        Hash();
        validatePassword();
    }

    public static void HashMaps(){
        HashMap<String, Integer> stock = new HashMap<>();
        HashMap<String, Double> prices = new HashMap<>();

        stock.put("banana", 6);
        stock.put("apple", 0);
        stock.put("orange", 2);
        stock.put("pear", 15);

        prices.put("banana", 4.0);
        prices.put("apple", 2.0);
        prices.put("orange", 1.5);
        prices.put("pear", 3.0);

        for (Map.Entry<String, Double> entry : prices.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println("The price is " + entry.getValue());
            System.out.println("The stock price is " + stock.get(entry.getKey()));
            System.out.println("The total value is " + stock.get(entry.getKey()) * entry.getValue());
        }

    }


    public static void Hash(){
        HashMap<String, List<String>> inventory = new HashMap<>();

        inventory.put("gold", new ArrayList<>(List.of("500")));
        inventory.put("pouch", new ArrayList<>(Arrays.asList("flint", "gemstone", "twine")));
        inventory.put("backpack", new ArrayList<>(Arrays.asList(
                "xylophone",
                "dagger",
                "bedroll",
                "bread loaf"
        )));

        inventory.put("pocket", new ArrayList<>(Arrays.asList(
                "seashell",
                "strange berry",
                "lint"
        )));

        inventory.get("pouch").add("rope");                 //adding element tp hashmap value list
        inventory.get("backpack").remove("dagger");      //removing value

        Collections.sort(inventory.get("backpack"));


        for (Map.Entry<String, List<String>>entry : inventory.entrySet()){
            System.out.println(entry.getKey());
            for (int i = 0; i < inventory.get(entry.getKey()).size(); ++i){
                System.out.println("\t" + inventory.get(entry.getKey()).get(i));
            }
        }

    }

    public static void validatePassword(){
        Scanner scan = new Scanner(System.in);
        String password;
        ArrayList<Character> passwordSplit;
        String specials = "!@#$%^&*()-+?_=,<>/";
        String message = "";
        do{
            message = "";
            int lcCount = 0;
            int ucCount = 0;
            int numOfDigits = 0;
            boolean specialCharacter = false;
            passwordSplit = new ArrayList<>();
            System.out.print("Enter Password: ");
            password = scan.next();
            password = password.trim();
            for (int i = 0; i < password.length(); ++i){
                passwordSplit.add(password.charAt(i));
            }
            for (char c: passwordSplit) {
                if (Character.isUpperCase(c))
                    ucCount++;
                else if (Character.isLowerCase(c))
                    lcCount++;
                else if (Character.isDigit(c))
                    numOfDigits++;
                else if (specials.indexOf(c) != -1) {
                    specialCharacter = true;
                }
            }
            if (ucCount < 2)
                message += "It should have at least 2 upper case letters\n";
            if (lcCount < 2)
                message += "It should have at least 2 lower case letters\n";
            if (numOfDigits < 1)
                message += "It should have at least 1 digit\n";
            if (!specialCharacter)
                message += "It should have at least one special character(s) such as =!@#$%^&*()-+?_=,<>/“\n";
            if (passwordSplit.size() < 6)
                message += "Add a minimum number of 6 characters";
            if (message.equals(""))
                System.out.println("Valid Password");
            else
                System.out.println(message);
        }while(!message.equals(""));
    }
}
