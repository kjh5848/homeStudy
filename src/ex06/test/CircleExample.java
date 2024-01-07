package ex06.test;

public class CircleExample {
    public static void main(String[] args) {
        Circle c = new Circle(3);

        c.calculateArea();
        System.out.println("반지름은: " + c.calculateArea());
    }
}
