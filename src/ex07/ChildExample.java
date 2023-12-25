package ex07;

public class ChildExample {
    public static void main(String[] args) {
        Child c = new Child();

        Paret p = c;
        p.method1();
        p.method2();

    }
}
