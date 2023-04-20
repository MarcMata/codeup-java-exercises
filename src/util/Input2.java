package util;

import com.sun.source.tree.BinaryTree;

import java.util.Scanner;

public class Input2 {

    private final Scanner scanner;

    public Input2(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
//        System.out.println();
        return scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Do you want to continue?[y/n]");
        String userChoice = scanner.nextLine();
        return userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes");
    }

    // use this yesNo method in combination
    // with getString(). Pass the return from a getString()
    // to this method
    public boolean yesNo(String input){
        return input.trim().equalsIgnoreCase("y") || input.trim().equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        while (true) {
            System.out.print("Enter a number between " + min + " and " + max + ": ");
            String userInput = getString();
            try {
                int userNum = Integer.valueOf(userInput);
                if (userNum >= min && userNum <= max) {
                    return userNum;
                } else {
                    System.out.println("Number is outside of the specified range.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }

    public int getInt() {
        while (true) {
            System.out.print("Enter an integer: ");
            String userInput = getString();
            try {
                return Integer.valueOf(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }

    public int getInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String userInput = getString();
            try {
                return Integer.valueOf(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }

    public double getDouble(double min, double max) {
        while (true) {
            System.out.printf("Enter a number between %.1f and %.1f:", min, max);
            String userInput = getString();
            try {
                double userNum = Double.valueOf(userInput);
                if (userNum >= min && userNum <= max) {
                    return userNum;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    public double getDouble() {
        while (true) {
            System.out.print("Enter a double: ");
            String userInput = getString();
            try {
                return Double.valueOf(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    public double getDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            String userInput = getString();
            try {
                return Double.valueOf(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
    public long getBinary() {
        while (true) {
            System.out.println("Enter a number and lets turn it into binary: ");
            String userInput = getString().trim();
            try {
                int decimal = Integer.parseInt(userInput);
                return Long.parseLong(Integer.toBinaryString(decimal));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    public long getHex() {
        while (true) {
            System.out.println("Turn your number into a hex: ");
            String userInput = getString();

        try {
            int decimal = Integer.parseInt(userInput);
            return Long.parseLong(Integer.toHexString(decimal));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a integer");
            }
        }
    }

    public void getGhost(){
        System.out.println("");
        String ghost = scanner.nextLine();
    }

}
