package ex07.Test;

public class CellPhoneTest {

    String model;
    String color;

    public CellPhoneTest(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void powerOn1() {
        System.out.println("전원을 킵니다.");

    }

    void powerOff1() {
        System.out.println("전원을 끕니다.");

    }

    void bell1() {
        System.out.println("벨이 울립니다.");

    }

    void sendVoice1(String massage) {
        System.out.println("자기: " + massage);
    }

    void reciveVoice1(String massage) {
        System.out.println("상대발: " + massage);
    }

    void hangUp1() {
        System.out.println("전화를 끊습니다.");
    }
}
