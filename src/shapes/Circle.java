package shapes;

public class Circle {
    private static double radius;

    public Circle(double radius) {
        System.out.println();
    }
    public static double getArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    public static double getCircumference(double radius) {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

}
