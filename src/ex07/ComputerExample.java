package ex07;
// 자식클래스
public class ComputerExample   {
    public static void main(String[] args) {
        int r = 10;

        Calculator c = new Calculator();
        System.out.println("원면적의: " + c.areaCircle(r));
        System.out.println();


        Computer c1 = new Computer();
        System.out.println("원면적의: " + c1.areaCircle(r));

    }
}
