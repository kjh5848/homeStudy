package chap03Progamming;

import java.util.Scanner;

/**
 * 연산을 입력하세요.
 * 피연산자 2개를 입력
 * 간단한 계산기 프로그램
 *
 * 문자(-,+,*,/)를 입력받고 피연산자 2개를 입력받는다.
 * 나눗셈은 분모가 0이 아닌지 검사해야한다.
 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;

        for (int i = 0; i < 2; i++) {
            System.out.print("연산(-,+,*,/)을 입력: ");
            String s = sc.nextLine();

            if (s.equals("+")) {
                System.out.println("피연산자 2개를 입력해주세요:");
                x = sc.nextInt();
                y = sc.nextInt();
                System.out.println("덧셈 결과는: " + (x+y));
            }
            if (s.equals("-")) {
                System.out.println("피연산자 2개를 입력해주세요:");
                x = sc.nextInt();
                y = sc.nextInt();
                System.out.println("뺄셈 결과는: " + (x-y));
            }
            if (s.equals("/")) {
                System.out.println("피연산자 2개를 입력해주세요:");
                x = sc.nextInt();
                y = sc.nextInt();
                if (x > 0) {
                    System.out.println("나눗셈 결과는: " + (x / y));
                } else {
                    System.out.println("분모는 0보다 커야 합니다.");

                }
            }
            if (s.equals("*")) {
                System.out.println("피연산자 2개를 입력해주세요:");
                x = sc.nextInt();
                y = sc.nextInt();
                System.out.println("곱셈 결과는: " + (x*y));
            }
            System.out.println( );
        }
    }
}
