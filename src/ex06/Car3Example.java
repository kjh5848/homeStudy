package ex06;

public class Car3Example {
    public static void main(String[] args) {

        Car3 c = new Car3();
        //잘못된 속도 변경
        c.setSpeed(-50);

        System.out.println(c.getSpeed());
    //  올바른 속도 변경
        c.setSpeed(60);

        if (!c.isStop()) {
            c.setStop(true);
        }
        System.out.println(c.getSpeed());
    }
}
