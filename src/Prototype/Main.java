package Prototype;

public class Main {

    public static void main(String[] args) {

        Shape shape = new Circle(4,50, "rojo");
        Shape shape2 = new Rectangle(4,50, "azul");


        Shape circleCopy = shape;
        circleCopy.setColor("Purpura");

        System.out.println(shape);
        System.out.println(shape2);
        System.out.println(circleCopy);
    }
}
