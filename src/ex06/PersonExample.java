package ex06;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("1111", "kkk");
        Person p2 = new Person("2222", "kkk");

        System.out.print(p1.nation);
        System.out.print(p1.ssn);
        System.out.print(p1.name);
        System.out.println();

        System.out.print(p2.nation);
        System.out.print(p2.ssn);
        System.out.print(p2.name);


    }
}
