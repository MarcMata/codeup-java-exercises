import java.util.Scanner;
import java.lang.Math;
public class MethodsExercise {
//    public static void addition(int num1, int num2) {
//        System.out.println(num1 + num2);
//    }
//    or
    public static int addition(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
    public static int subtraction(int num1, int num2) {
        int subtraction = num1 - num2;
        return subtraction;
    }

    public static int multiplication(int num1, int num2) {
        int multiplied = num1 * num2;
        return multiplied;
    }

    public static int division(int num1, int num2) {
        int quotient = num1 / num2;
        return quotient;
    }
    public static int remainder(int num1, int num2) {
        int modulus = num1 % num2;
        return modulus;
    }

    public static int multiplyMethod(int num, int num2){
       int result = 0;
       for (int i = 0; i < num2; i++) {
          result += num;
       }
        return result;
    }
    public static int multiplyRecursion(int num1, int num2) {
        if (num2 == 0) { // Base case: if num2 is 0, return 0
            return 0;
        } else if (num2 > 0) { // Recursive case 1: if num2 is positive
            return num1 + multiplyRecursion(num1, num2 - 1);
        } else { // Recursive case 2: if num2 is negative
            return -num1 + multiplyRecursion(num1, num2 + 1);
        }
    }


//    problem2

    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: ", min, max);
        String inputString = sc.nextLine();
        int userInput;
        if (inputString.matches("\\d+") && (userInput = Integer.parseInt(inputString)) >= min && userInput <= max) {
            System.out.printf("Number %d is between %d and %d%n", userInput, min, max);
            return userInput;
        } else {
            System.out.println("Invalid input or out of range. Please try again.");
            return getInteger(min, max); // Recursive call to getInteger
        }
    }


    public static long getFactorial(int n) {
        long result = 1;
        System.out.printf("%d! = 1", n);
        for (int i = 2; i <= n; ++i) {
            result *= i;
            System.out.printf(" x %d", i);
        }
        System.out.printf("1 = %d%n", result);
        return result;
    }
//problem 4
    public static void rollDice(long n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to roll the dice? y/n");
        String userInput = sc.nextLine();
        int randomNumber = (int)(Math.random()*n) + 1;
        int randomNumber2 = (int)(Math.random()*n) + 1;
        int total = randomNumber + randomNumber2;
        if (userInput.equalsIgnoreCase("y")) {
            System.out.printf("You first dice rolled a %d!%n", randomNumber);
            System.out.printf("You second dice rolled a %d%n!", randomNumber2);
            System.out.printf("Move forward %d spaces", total);
        }
    }

    public static long diceSides(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many sides are on your dice: ");
        long diceSides = sc.nextLong();
        System.out.printf("You will roll two %d sided dice! %n", diceSides);
        return diceSides;
    }
//problem 5


    public static void main(String[] args) {
        //create basic arithmetic, addition, subtraction, multiplication, division.
//        System.out.println(addition(1,3));
//        System.out.println(subtraction(2,5));
//        System.out.println(multiplication(3,21));
//        System.out.println(division(0,5));
        //if you divide by zero you get an error
//        System.out.println(remainder(5,2));
//        System.out.println(multiplyMethod(5,2));
//        System.out.println(multiplyRecursion(5,20));
        rollDice(diceSides());
    }

}
