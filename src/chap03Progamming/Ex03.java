package chap03Progamming;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 369게임을 만들어보자.
 * 숫자에 3,6,9가 포함되어 있으면 그 개수만큼 박수를 치는 게임
 * 1~50까지의 정수
 */
public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[50];
        int N = arr.length;
        int x;

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int j = 0; j < N; j++) {
            //System.out.println(arr[j]);
            if (arr[j]%10 == 3) {
                System.out.print("짝");
                System.out.print("\t");
            } else if (arr[j]%10 == 6) {
                System.out.print("짝");
                System.out.print("\t");
            } else if (arr[j]%10 == 9) {
                System.out.print("짝");
                System.out.print("\t");
            } else {
                System.out.print(arr[j]);
                System.out.print("\t");
            }


        }



//        System.out.println(arr[0] + "1");
//        System.out.println(arr[1] + "2");
//        System.out.println(arr[2] + "짝");
//        System.out.println(arr[3] + "4");
//        System.out.println(arr[4] + "5");
//        System.out.println(arr[5] + "짝");
//        System.out.println(arr[6] + "7");
//        System.out.println(arr[7] + "8");
//        System.out.println(arr[8] + "짝");
//        System.out.println(arr[9] + "10");
//        System.out.println(arr[10] + "11");
//        System.out.println(arr[11] + "12");
//        System.out.println(arr[12] + "짝");


//        for (int i = 1; i < 50 ; i++) {
//            arr[i] = sc.nextInt();
//
//
//        }

    }
}
