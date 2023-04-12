package util;
import java.util.Scanner;


public class Input {
    private static Scanner sc = new Scanner(System.in);

    public static String getString() {
        System.out.println("Type in a String");//print the prompt before reading the input
        String userInput = sc.nextLine();
        return userInput;
    }
    public static Boolean yesNo(){
        System.out.println("Enter yes/No: ");
        String userInput = sc.nextLine();
        if (userInput.equalsIgnoreCase("Yes") || userInput.equalsIgnoreCase("Y")){
            return true;
        } else {
            return false;
        }
    }

    public static int getInt(int min, int max) {
        int userInput;
        while (true) {
            System.out.printf("Enter an integer between %d and %d: %n", min, max);
            userInput = sc.nextInt();
            sc.nextLine(); // Consume newline character

            if (userInput >= min && userInput <= max) {
                return userInput;
            } else {
                System.out.printf("You did not enter a number between %d and %d%n", min, max);
            }
        }
    }
    public static int getInt(){
        System.out.println("Enter a integer(NOT PREV QUESTION): ");
        int userInput = sc.nextInt();
        sc.nextLine();//Will consume new line character.
        return userInput;
    }
    public static double getDouble(double min, double max) {
        double userInput;
        while (true){
            System.out.printf("Enter a double between %.2f and %.2f: %n", min, max); // Fix format specifier
            userInput = sc.nextDouble();
            sc.nextLine(); // Consume newline character
            if (userInput >= min && userInput <= max) {
                return userInput;
            } else {
                System.out.printf("You did not enter a number between %.2f and %.2f%n Try again!%n", min, max); // Fix format specifier
            }
        }
    }
    public static double getDouble(){
        System.out.println("Enter a Double: ");
        double userInput = sc.nextDouble();
        sc.nextLine(); //will consume the new line character
        return userInput;
    }

}