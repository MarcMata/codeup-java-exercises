import java.util.Arrays;
import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
        String cohort = "Bigfoot";
        String timeOfDay = "afternoon";
        int week = 9;
        //Placeholder for a string printf
//        System.out.printf("Good %s, %s!%n", timeOfDay, cohort);
//        System.out.printf("This is the %dth week of %s cohort.%n", week, cohort);
        float myFloat = 123.456F;
//        System.out.printf("The number is %f.%n", myFloat);
//
//        System.out.println("Will this be a new line?");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String userInput = scanner.next();
//        System.out.println("The user entered: " + userInput);
        System.out.printf("Your string was: %s", userInput);
    }
}
