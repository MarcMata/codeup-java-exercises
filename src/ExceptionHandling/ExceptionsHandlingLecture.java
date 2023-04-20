package ExceptionHandling;

public class ExceptionsHandlingLecture {
    public static void main(String[] args) {

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[99]);
            throw new Exception("something bad happened");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e){
            System.out.println(e);
            System.out.println("After that error happens...");
        } finally {
            System.out.println("This is my finally block");
        }
        System.out.println("This is after the try/catch/finally");
    }
}
