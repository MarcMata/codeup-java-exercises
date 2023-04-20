package util;

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
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        String userInput = getString();
        try {
            Integer.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("You did not enter a valid number. Try again.");
            return getInt(min, max);
        }
        int userNum = Integer.valueOf(userInput);
        if (userNum >= min && userNum <= max) {
            return userNum;
        } else {
            System.out.println("Number is outside of the specified range.");
        }
            return Integer.parseInt(userInput);
        }

    public int getInt() {
            System.out.print("Enter an integer: ");
            String userInput = getString();
            try {
                return Integer.valueOf(userInput);
            } catch (NumberFormatException e) {
                System.out.println("You did not enter a valid number. Try again.");
                return getInt();
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
            System.out.printf("Enter a number between %.1f and %.1f:", min, max);
            String userInput = getString();
            try {
                Double.valueOf(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                return getDouble(min,max);
            }
            double userNum = Double.valueOf(userInput);
            if (userNum >= min && userNum <= max) {
                return userNum;
            } else {
                System.out.printf("Enter a number between %.1f and %.1f:", min, max);
                return getDouble(min, max);
            }
        }

    public double getDouble() {
        System.out.println("Enter a double");
        String userInput = getString();
        try {
            Double.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            return getDouble();
        }
        double userNum = Double.valueOf(userInput);
        return userNum;
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

    public String getHex() {
        while (true) {
            System.out.println("Turn your number into a hex: ");
            String userInput = getString();

        try {
            int decimal = Integer.parseInt(userInput);
            return Integer.toHexString(decimal);
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
