import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //problem 1
//        int i = 5;
//        while ( i <= 15) {
//            System.out.println(i);
//            i++;
//        }
        //problem 1b first bullet
//        int x = 0;
//        do {
//            System.out.println(x);
//            x += 2;
//        }while (x <= 100);
        //problem 1b second bullet
//        int x = 100;
//        do {
//            System.out.println(x);
//            x -= 5;
//        }while (x >= 0);
//        problem 1b third bullet
//        long x = 2;
//        do {
//            System.out.println(x);
//            x = x * x;
//        }while (x < 1000000);
//        1c -1a
//        for (int i = 5; i <= 15; i++){
//            System.out.println(i);
//        }
//        1c -1b.1
//        for (int i = 0; i <=100; i+=2) {
//            System.out.println(i);
//        }
//        1c -1b.2
//        for (int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }
//        1c -1b.3
//        for (long i = 2; i < 1000000; i*= i){
//            System.out.println(i);
//        }
//        problem 2.1
//        for (int i = 0; i <= 100; i++){
//            System.out.println(i);
//        }
//        problem 2.2
//        for (int i = 0; i <= 100; i++){
//            if (i % 3 == 0) {
//                System.out.println("Fizz: " + i);
//            }
//        }
//        problem 2.3
//        for (int i = 0; i <= 100; i ++) {
//            if (i % 5 == 0) {
//                System.out.println("Buzz: " + i);
//            }
//        }
//        problem 2.4
//        for (int i = 0; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz: " + i);
//            }
//        }
        //problem 3
//        System.out.println("What number would you like to go up to? ");
//        int num = 1;
//        int squared = 0;
//        int cubed = 0;
//        String output = sc.nextLine();
//        int newOutput = Integer.parseInt(output);
//        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for (int i = 1; i <= newOutput; i++){
//            num = i;
//            squared = num * num;
//            cubed = num * num * num;
//            System.out.printf("%-7d| %-8d| %-7d%n", num, squared, cubed);
//        }
//      problem 4 starts
        boolean continueGrades = true;
        while (continueGrades) {
            System.out.println("Enter a numerical grade from 0 - 100: ");
            String grade = sc.nextLine();
            int parsedGrade = Integer.parseInt(grade);
            if (parsedGrade <= 100 && parsedGrade >= 88){
                System.out.println("You received an A");
            } else if (parsedGrade <= 87 && parsedGrade >= 80) {
                System.out.println("You received a B");
            }  else if (parsedGrade <= 79 && parsedGrade >= 67) {
                System.out.println("You received a C");
            }  else if (parsedGrade <= 66 && parsedGrade >= 60) {
                System.out.println("You received a D");
            }  else if (parsedGrade <= 59 && parsedGrade >= 0) {
                System.out.println("You received an F");
            } else {
                System.out.println("You did not enter a number between 0 and 100");
            }

            boolean validResponse = false;
            while (!validResponse) {
                System.out.println("Enter more grades? (Y/N)");
                String response = sc.nextLine();
                if(response.equalsIgnoreCase("N")) {
                    continueGrades = false;
                    validResponse = true;
                } else if (response.equalsIgnoreCase("Y")){
                    validResponse = true;
                } else {
                    System.out.println("You did not enter a valid response");
                }
            }
        }
        //problem 4 ends


    }
}
