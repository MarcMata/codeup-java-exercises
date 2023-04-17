package shapes;

public class Square extends Rectangle {

    public Square() {
        System.out.println("New square created");
    }

    public Square(int sideLength) {
        super(sideLength, sideLength); // Call the constructor of Rectangle with equal width and length
    }

    public int getSideLength() {
        return getWidth(); // Since Square has equal width and length, getSideLength() can just return the width
    }

    public void setSideLength(int sideLength) {
        setWidth(sideLength); // Since Square has equal width and length, setSideLength() can just set the width
        setLength(sideLength);
    }

    @Override
    public int getPerimeter(){
        return getSideLength() * 4; // Perimeter of a square is sideLength * 4
    }

    @Override
    public int getArea(){
        return getSideLength() * getSideLength(); // Area of a square is sideLength * sideLength
    }

}
