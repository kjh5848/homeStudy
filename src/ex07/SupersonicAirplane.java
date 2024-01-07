package ex07;

public class SupersonicAirplane extends Airplane {
    public static final int NOPMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NOPMAL;

    @Override
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속");
        } else {
            super.fly();
        }
    }
}
