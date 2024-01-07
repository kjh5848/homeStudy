package ex07.carExample;

public class CarExample {
    public static void main(String[] args) {
        Car c = new Car();

        for (int i = 0; i <= 5; i++) {
            int problemLocation = c.run();

            switch (problemLocation) {
                case 1:
                    System.out.println("앞왼쪽 HankookTrie 교체");
                    c.frontLeftTire = new HankookTrie("앞왼쪽", 15);
                    break;
                case 2:
                    System.out.println("앞오른쪽 KumhoTire 교체");
                    c.frontRightTire = new KumhoTire("앞오른쪽", 13);
                    break;
                case 3:
                    System.out.println("뒤왼쪽 HankookTrie 교체");
                    c.backLeftTire = new HankookTrie("뒤왼쪽", 14);
                    break;
                case 4:
                    System.out.println("뒤오른쪽 KumhoTire 교체");
                    c.backRightTire = new KumhoTire("뒤오른쪽", 17);
                    break;
            }
            System.out.println("------------------------");
        }
    }
}
