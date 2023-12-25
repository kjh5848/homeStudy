package ex07.Programming;

class Rectangle {
    int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
}

class ColorRectangle extends Rectangle {
    String color;

    public ColorRectangle(int width, int height, String color) {
        super(width, height);
        this.color = color;
    }
}

public class ex04 {
    public static void main(String[] args) {
        ColorRectangle co = new ColorRectangle(100,100,"blue");
        System.out.println("가로: "+ co.width);
        System.out.println("세로: "+ co.height);
        System.out.println("색상: "+ co.color);
    }
}
