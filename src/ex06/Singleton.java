package ex06;

public class Singleton {

    private static Singleton singleton = new Singleton();

//    private Singleton() {
//
//    }


    static Singleton getInstance() {
        return singleton;
    }

}

class Singleton1 {
    private static Singleton1 singleton2 = new Singleton1();
    private static Singleton singleton3 = new Singleton();
    private static Singleton singleton4 = new Singleton();

    static Singleton1 getInstance() {
        return singleton2;
    }
}
