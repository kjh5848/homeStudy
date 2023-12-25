package ex06;

public class SingletonExample {
    public static void main(String[] args) {
        Singleton n1 = Singleton.getInstance();
        Singleton n2 = Singleton.getInstance();

        if (n1 == n2) {
            System.out.println("같은 싱글톤객체입니다.");
        } else {
            System.out.println("다른 싱글톤객체입니다.");

        }
    }
}
