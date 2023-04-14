import java.util.Scanner;
import java.lang.Math;

public class ReferenceProblems {
    public static void main(String[] args) {

    }

    static class ArithmeticSample {
        public static String main(String[] args) {
            int integers = 5;
            String string = "Hello";
            return integers + string;
        }}

    public static class Demo {
        public static void main(String[] args) {
            int[] ages = new int[20];
            for (int i = 0; i < ages.length; i++){
                ages[i] = (int) (Math.random() * 100) + 1;
                System.out.printf("Age %d: %d%n", (i + 1),ages[i]);
                //ages[i] while in a for loop targets each element in the array
                //ages.length targets the length of the array
                //Using the for loop you create a new object inside each of the elements
            }
        }
    }

    public static class Program {
        public static void main(String[] args) {
            String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            for (int i = 0; i < menu.length; i++){
                if (input == i){
                    System.out.printf(menu[i]);
                } else if (input > menu.length){
                    System.out.println("Invalid");
                    break;
                }
            }
        }
    }

    public static class Demo2 {
        public static void main(String[] args){
            int[] ages = {18, 33, 24, 64, 45};
            int sum = 0;
            for(int x=0;x<ages.length;x++){
                sum+= ages[x];
            }
            System.out.println(sum);
        }
    }
    //finding an average of arrays
    public static class Program2 {
        public static void main(String[] args) {
            double[] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};
            double sum = 0;
            for (double x : revenue){
                sum += x;
            }
            double average = sum / revenue.length;
            System.out.println(average);
        }
    }
}
