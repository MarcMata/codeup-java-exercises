import java.sql.SQLOutput;
import java.util.Scanner;
public class RequestName {
    public static void main(String[] args) {
//        Scanner fname = new Scanner(System.in);
//        System.out.println("Enter a First Name: ");
//        String firstName = fname.next();
//        Scanner lname = new Scanner(System.in);
//        System.out.println("Enter a Last Name: ");
//        String lastName = lname.next();
//        System.out.printf("Hello, %s %s", firstName, lastName);
        //instead of creating two scanners do this
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a first name: ");
//        String firstName = scanner.next();
//        System.out.println("Enter your last name: ");
//        String nextLine = scanner.nextLine();
//        String lastName = scanner.nextLine();
//        System.out.printf("Hello %s %s %n", firstName, lastName);
//        System.out.println("Enter the secret code: ");
//        String sentence = scanner.nextLine();
//        System.out.println("Secret code: " + sentence);
        System.out.println("Please enter an integer: ");
        String userInputInteger = scanner.nextLine();
        System.out.println(userInputInteger + userInputInteger);
        System.out.println("Your integer was: " + Integer.parseInt(userInputInteger));
        int parsedUserInput = Integer.parseInt(userInputInteger);
        System.out.println(parsedUserInput + parsedUserInput);
    }
}
