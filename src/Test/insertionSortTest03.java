package Test;

public class insertionSortTest03 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4};

        int N = arr.length;

        int temp = 0, key;


        for (int i = 0; i < N; i++) {

            temp = arr[i];
            for (int j = i+1; j > 0; j--) {
                if (temp < arr[j]) {
                    arr[j] = arr[j-1];

                }
                arr[i] = temp;

            }
        }


        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }

    }
