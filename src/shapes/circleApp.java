package shapes;
import util.Input;

public class circleApp {
    public static void main(String[] args) {
        double radius = Input.getDouble();
        double area = Circle.getArea(radius);
        double circumference = Circle.getCircumference(radius);
        System.out.printf("The area of the circle is %.2f%n", area);
        System.out.printf("The Circumference of the circle is %.2f%n", circumference);
    }
}
