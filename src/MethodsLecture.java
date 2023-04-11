public class MethodsLecture {
    public static void main(String[] args) {
//        System.out.println(sayHello("dumbo", "williams"));
//        System.out.println(returnThree());
//        System.out.println(highFive("Jason"));
        count(5);
    }
    //method overload
    public static String sayHello(String name){
        String message = "Hello....... I have no idea who you are";
        return message;
    }
    public static String sayHello(String firstName, String lastName){
        return "Hello " + firstName + " " + lastName;
    }
    public static int returnThree(){
        return 3;
    }
    public static String highFive(String name){
        return name + " gives no one a high five, he has no frineds";
    }
    public static String highFive(String name1, String name2){
        return name1 + " gives " + name2 + " a high five!";
    }

    //recursion
    //like a loop but calls itself to rerun the method
    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }
}
