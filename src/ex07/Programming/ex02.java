package ex07.Programming;


class Animal {
    void walk() {
        System.out.println("걸을 수 있음");
    }
}

class Bird extends Animal {

    void fiy() {
        System.out.println("날을 수 있음");
    }

    void sing() {
        System.out.println("노래 부를 수 있음");
    }
}

public class ex02 {
    public static void main(String[] args) {
        Bird bird = new Bird();

        bird.walk();
        bird.fiy();
        bird.sing();
    }
}
