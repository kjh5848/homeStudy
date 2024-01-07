package ex07.Test;

public class DmbCellPhoneExampleTest {
    public static void main(String[] args) {
        DmbCellPhoneTest d1 = new DmbCellPhoneTest("자바폰", "검정", 10);

        System.out.println("모델: " + d1.model);
        System.out.println("색상: " + d1.color);
        System.out.println("채널: " + d1.channel);

        d1.powerOn1();
        d1.bell1();
        d1.sendVoice1("여보세요");
        d1.reciveVoice1("안녕하세요 저는 김주혁인데요");
        d1.sendVoice1("아~예!반갑습니다");
        d1.hangUp1();

        d1.turnOnDmb1();
        d1.changeChannelDmb1(10);
        d1.turnOffDmb1();

    }
}
