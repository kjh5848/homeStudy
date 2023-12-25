package ex06;

public class ComputerExample {
    public static void main(String[] args) {
        Computer c = new Computer();
        int[] values1 = {1, 2, 3};
        int result = c.sum1(values1);
        System.out.println(result);

        int num = c.sum2(2, 2, 3);
        System.out.println(num);
        int num2 = c.sum2(2, 2, 3,4,5);
        System.out.println(num2);
    }
}
