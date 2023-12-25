package bubbleEx01;

public class bubbleEx01 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 8, 3};

        int N = arr.length;


        int temp;
        for (int k = 1; k < N; k++) {
            for (int i = 0; i < N-k; i++) {
                if (arr[i]>arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            for (int j = 0; j < N; j++) {
                System.out.print(arr[j]+ "\t");
            }
            System.out.println();
        }


    }
}
