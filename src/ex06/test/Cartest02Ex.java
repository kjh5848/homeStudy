package ex06.test;

import ex06.Car;

public class Cartest02Ex {
    public static void main(String[] args) {
        Cartest02 c1 = new Cartest02();

        int num1 = c1.setGas(10);
        for (int i = 0; i < 10; i++) {
            System.out.println("가스를 주입하세요: " + num1--);

            boolean gasState = c1.isLeftGsa();
            if (gasState) {
                System.out.println("출발합니다.");
                c1.run();

            }
            if (c1.isLeftGsa()) {
                System.out.println("주입할 필요가 없습니다");
            }
        }
    }
}
