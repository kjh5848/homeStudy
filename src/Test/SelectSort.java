package Test;

/**
 * 최솟값을 찾아서 정렬하는 프로그램
 * 배열의 첫번째 방에 있는 변수와
 * 최솟값을 저장하는 변수가 필요 = min
 * 최솟값을 찾고 min 보다 작으면 true
 * 작은 값을 min에 저장한다.
 * 작으면 그대로, 크면 스왑한다.
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {5,2,1,4,8,9,3};

        int N = arr.length;

        int temp,min,min2=0;

        for (int i = 0; i < N-1; i++) {
            min = i;
            for (int j =i+ 1; j <N ; j++) {
                if (arr[j]<arr[min]) {
                    min = j;

                }

            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}


