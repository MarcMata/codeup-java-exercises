package shapes;

public class Rectangle extends Quadrilateral {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    void setWidth() {
        super.setWidth(this.width);
    }

    @Override
    void setLength() {
        super.setWidth(this.length);
    }

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
