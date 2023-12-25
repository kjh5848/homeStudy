package ex07.Programming;

class Circle {
    protected int radius;
    public Circle(int r) {
        radius = r;

    }

}

 class Pizza extends Circle {

    public String Pepperoni;

    public Pizza(int r, String pepperoni) {
        super(r);
        Pepperoni = pepperoni;

        System.out.println("피자의 종류: " + Pepperoni + "," + "피자의 크기: " + r);

    }
}

public class ex01 {
    public static void main(String[] args) {
        Pizza p = new Pizza(20,"Pepperoni");

    }
}
