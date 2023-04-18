package shapes;

public class Square extends Quadrilateral {

    public Square(double length) {
        super(length);
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}
