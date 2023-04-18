package shapes;

public class Square extends Quadrilateral {

    public Square(double length) {
        super(length, length);
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    void setWidth() {
        super.setWidth(this.length);
        super.setLength(this.length);
    }

    @Override
    void setLength() {
        super.setWidth(this.length);
        super.setLength(this.length);
    }
}
