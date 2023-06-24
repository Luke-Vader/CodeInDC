import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        validatePassword();
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