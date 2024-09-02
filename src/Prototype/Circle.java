package Prototype;

public class Circle extends Shape{

    public Circle(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public Shape clone() {
        return new Circle(x, y, color);
    }


}
