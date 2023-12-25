package chap03Progamming;

import java.util.Scanner;

/**
 * 정수를 입력하세요.
 * 1,2,9...One, Two, Nine 같이 출력하는 프로그램
 * 1~9가 아니면 OTHER를 출력한다.
 */
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("정수를 입력: ");
            int num= sc.nextInt();
            System.out.println( );
            if (1 == num) {
                System.out.println(num+"는 ONE 입니다.");
            }
            if (2 == num) {
                System.out.println(num+"는 TWO 입니다.");
            }
            if (3 == num) {
                System.out.println(num+"는 three 입니다.");
            }
            if (4 == num) {
                System.out.println(num+"는 four 입니다.");
            }
            if (5 == num) {
                System.out.println(num+"는 five 입니다.");
            }
            if (6 == num) {
                System.out.println(num+"는 six 입니다.");
            }
            if (7 == num) {
                System.out.println(num+"는 seven 입니다.");
            }
            if (8 == num) {
                System.out.println(num+"는 eight 입니다.");
            }
            if (9 == num) {
                System.out.println(num+"는 nine 입니다.");
            }
            if (9 < num) {

                System.out.println(num+"은 OTHER 입니다.");
            }
        }
    }
}
