package ex07.carExample;

public class HankookTrie extends Tire {
    public HankookTrie(String location, int maxRotation) {
        super(location, maxRotation);
    }

    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + "HankookTrie 수명 : " +
                    (maxRotation - accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** "+ location + "HankookTrie 펑크 ***");
            return false;
        }

    }
}
