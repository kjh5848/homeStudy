package ex06;

public class Car2 {
    int gas;

    int setGas(int gas) {

        this.gas = gas;
        return this.gas;
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    }
    void run(){
        while (true) {
            if (gas > 0) {
                System.out.println("달립니다(gas잔량:" + gas + ")");
                gas--;

            } else {
                System.out.println("gas잔량: " + gas );
                return;
            }
        }
    }

}



