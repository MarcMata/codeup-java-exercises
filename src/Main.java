import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int myFavoriteNumber = 32;
        String myString = "Good Afternoon ";
        //number 3 does not work
//        myString = 'b';
        //number 4
//        does not work
//        myString = 3.14159;
//        number 5
//        long myNumber;
//        System.out.println(myNumber);
//        java: variable myNumber might not have been initialized
//        number 6
//        myNumber = 3; //cannot be a long number because it's not a whole number --integer has to be double or float
        //number 7
//        myNumber = 123L; //works
//        number 8
//        works
        //number 9
        //float = myNumber; // does not work
//        long myNumber1 = myNumber;
//        float = myNumber;
//        myNumber = (long) 3.14;
//        change the variable name. or introduce it as a float
//        float myNumber;
//        myNumber = 3.14F;
//        number 10
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
        //prints 5 and 6
        int x = 5;
        System.out.println(++x);
        System.out.println(x);
//        prints 6 and 6
        //x is incremented after the output runs on the first one and increments before the output on the second
//        number 11
//        var class;
//        expects a name
//        number 12
        String theNumberThree = "three";
        Object o = theNumberThree;
//        int three = (int) o;
        //expectation - cannot cast int on an object
//        Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
//        at Main.main(Main.java:45)
//        int three = (int) "three";
//        non convertible type
//        number 13
//        int x = 4;
//        x += 5;

//        int x = 3;
//        int y = 4;
//        y *= x;
//
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//        number 14;
//        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold?
//            it will get cut in half
        //        What happens if you increment a numeric variable past the type's capacity?
//        it will stay the same unless you use math.. add zeros
//        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.

    }
}