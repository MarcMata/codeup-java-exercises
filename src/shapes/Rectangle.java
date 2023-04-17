package shapes;

public class Rectangle {

    private Integer width;
    private Integer length;

    public Rectangle() {
        System.out.println("New rectangle created");
    }
    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getArea(){
        return length * width;
    }

    public int getPerimeter(){
        return (length * 2) + (width * 2);
    }
}
