package ex06;

class MenberExample {
    String name;
    String id;

    public MenberExample(String name, String id) {
        this.name = name;
        this.id = id;

    }
}

public class Menber {


    public static void main(String[] args) {
        MenberExample m = new MenberExample("홍길동","hong");

        System.out.println(m.name+","+m.id);
    }



}
