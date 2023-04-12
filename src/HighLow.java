import java.util.Scanner;
import java.lang.Math;
public class HighLow {
    public static void main(String[] args) {
        guessTheNumber((int) randomNumber());
    }
    public static long randomNumber() {
        long randomNumero = (long)(Math.random() * 100) + 1;
        return randomNumero;
    }
    public static void guessTheNumber(int randomNumber){
        Scanner sc = new Scanner(System.in);
        System.out.println("A random number was generated between 1 and 100 \nGuess that number below!!!!!!");
        boolean correct = false;
            while (!correct){
            int userInput = sc.nextInt();
            String message1 = "HIGHER!";
            String message2 = "LOWER!";
            String message3 = "YOU WIN! YAHTZEE!";
            if (randomNumber > userInput) {
                System.out.println(message1);
                guessTheNumber(randomNumber);
            } else if (randomNumber < userInput) {
                System.out.println(message2);
                guessTheNumber(randomNumber);
            } else {
                System.out.println(message3);
                correct = true;
            }
        }
    }
}