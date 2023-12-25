package ex06;
public class CalculatorExample {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.powerOn();

        int result = c.plus(5, 6);
        System.out.println("리절트는: " + result);

        double result2 = c.divide(1000,40);
        System.out.println("리절트2는: " + result2);

        c.powerOff();
    }
}
