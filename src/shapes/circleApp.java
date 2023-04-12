package shapes;
import util.Input;

public class circleApp {
    public static void main(String[] args) {
        double radius = Input.getDouble();
        System.out.println(Circle.getArea(radius));
        System.out.println(Circle.getCircumference(radius));
    }
}
