package Java2Study;

import java.sql.Array;
import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        //correct
//        System.out.println(subtractTen(1));
        System.out.println(average(new int[]{1, 2, 3, 4, 97}));

    }
    public static int subtractTen(int num){
        return num - 10;
    }
    public static double average(int[] intArray) {
        double sum = 0;
        double average = 0;
        for (int num : intArray) {
            sum += num;
            average = (sum / intArray.length);
        }
        return average;
    }

    public static ArrayList<Integer> multipleAll(int num, ArrayList<Integer> arrList){
        ArrayList<Integer> newArrList = new ArrayList<>();
        for(int number:arrList){
             number *= num;
             newArrList.add(number);
        }
        return newArrList;
    }



}
