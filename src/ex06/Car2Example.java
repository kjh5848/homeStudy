package ex06;

import java.util.Scanner;

public class Car2Example {
    public static void main(String[] args) {
        Car2 c = new Car2();




        int num = c.setGas(10);
        for (int i = 0; i < 10; i++) {
            num--;
            System.out.println("가스를 주입하세요: "+num);

            boolean gasState = c.isLeftGas();
            if (gasState) {
                System.out.println("출발합니다.");
                c.run();
            }

            if (c.isLeftGas()) {
                System.out.println("주입할필요가 없습니다.");

            }
        }
    }
}
