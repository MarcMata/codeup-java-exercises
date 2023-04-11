import java.util.Scanner;
public class ControlStatementsLoopsLecture {
    public static void main(String[] args) {
        /*Boolean expressions*/
        /* >, >=, <, <=, ==, != */
        double discountPercentage = 2.3;
//        System.out.println(discountPercentage != 2.0);


        /*Logical operators*/
        /*&&, ||, &, |, !*/
        //System.out.println(discountPercentage > 3 & discountPercentage == 2.3);

        /*String Comparison*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Continue? [y/N]");
//        String userInput = sc.next();
//
//        boolean confirmation = userInput.equalsIgnoreCase("y");
//        System.out.println(confirmation);

        /*Control structures*/
        /*if, else if, else*/
//        if (discountPercentage > 3){
//            System.out.println("Discount percentage is, in fact, definitley greater than 2.");
//        } else {
//            System.out.println("No discount for you.");
//        }

        /*=========Switch*/
//        int caseSwitch = 1;
//        switch (caseSwitch) {
//            case 1:
//                System.out.println("Case 1");
//                break;
//            case 2:
//                System.out.println("Case 2");
//                break;
//            default:
//                System.out.println("Default Case");
//                break;
//        }

        //intellij recommended???
//        switch (caseSwitch) {
//            case 1 -> System.out.println("Case 1");
//            case 2 -> System.out.println("Case 2");
//            default -> System.out.println("Default Case");
//        }


        /*While loop*/
//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }
        /*Do-While loop*/
//        do {
//            System.out.println("i is " + i);
//            i++;
//        } while (i < 10);
        //for loop
//        for (int i = 0; i < 10; i++){
//            System.out.println("i is " + i);
//        }

        //break and continue
        for (int i = 0; i < 10; i++){
            if (i == 2) {
                continue;
            }
            System.out.println("i is " + i);
        }
    }
}
