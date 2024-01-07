package ex07.Test;

public class DmbCellPhoneTest extends CellPhoneTest {
    int channel;

    public DmbCellPhoneTest(String model, String color, int channel) {
        super(model, color);
        this.channel = channel;
    }

    void turnOnDmb1() {
        System.out.println("채널" + channel + "번 dmb방송 수신을 시작합니다");
    }

    void changeChannelDmb1(int channel) {
        this.channel = channel;
        System.out.println("채널"+channel+"번으로 바꿉니다.");
    }

    void turnOffDmb1() {
        System.out.println("DMB방송 수신을 멈춥니다.");

    }
}
