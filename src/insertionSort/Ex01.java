package insertionSort;

/**
 * 삽입정렬 정햊니
 */

public class Ex01 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4};

        int N = arr.length;

        int key,temp;

        for (int i = 0; i < N-1; i++) {
            key = i;
            for (int j = i+1; j <N ; j++) {

                if (key > arr[j-1]) {
                    temp = key;
                    key = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}
