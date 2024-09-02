package Prototype;

public class Rectangle extends Shape{

    public Rectangle(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public Shape clone() {
        return new Rectangle(x, y, color);
    }


}
