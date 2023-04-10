import java.util.Arrays;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %s%n", pi);


//        System.out.print("Enter a integer: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println(userInput);

//        problem 1
//        will throw an error if a number is not entered
        //problem 2
//        System.out.print("Enter three words: ");
//        String enterThreeWords = scanner.nextLine();

        // Split the input string into three words
//        String[] words = enterThreeWords.split(" ");

//         Display the words on separate lines
//        System.out.println(words[0]);
//        System.out.println(words[1]);
//        System.out.println(words[2]);

        //problem 3
//        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//        System.out.print("Enter a sentence: ");
//        String sentence = scanner.next();
//        System.out.println("You entered: " +sentence);
//        do you capture all the words?
        //no
//        System.out.print("Enter a sentence: ");
//        String sentence = scanner.nextLine();
//        System.out.println("You entered: " +sentence);
//        Yes now we capture all the words.

        //Calculate the perimeter of the codeup classroom
        System.out.println("Enter a length: ");
        int length = scanner.nextInt();
        System.out.println("Enter a width: ");
        int width = scanner.nextInt();
        var area = length * width;
        var perimeter = (length * 2) + (width * 2);
        System.out.printf("The total area of your room is: %d ft.%n", area);
        System.out.printf("The total perimeter of your room is: %d ft", perimeter);
    }
}