package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
//        System.out.println(Input.getString("WHAT IS UP BROOKLYN"));
//        System.out.println(Input.yesNo("Are you having a good day? "));
        System.out.println(Input.getInt(12, 24, "Enter something between 12 and 24"));
        System.out.println(Input.getInt());
        System.out.println(Input.getDouble(5, 10));
        System.out.println(Input.getDouble());
        System.out.println("Congrats you made it through!");;
    }
}
