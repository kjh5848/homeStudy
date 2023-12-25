package Test;

public class insertionSortTest02 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        /**
         * 4,5,3,2,1
         *
         * 4,3,5,2,1
         * 3,4,5,2,1
         */

        int N = arr.length;

        int temp,key;


        if (arr[0] > arr[1]) {
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }

        if (arr[1] > arr[2]) {
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;

            if (arr[0] > arr[1]) {
                temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
            }
        }

        if (arr[2] > arr[3]) {
            temp = arr[2];
            arr[2] = arr[3];
            arr[3] = temp;

            if (arr[1] > arr[2]) {
                temp = arr[1];
                arr[1] = arr[2];
                arr[2] = temp;

                if (arr[0] > arr[1]) {
                    temp = arr[0];
                    arr[0] = arr[1];
                    arr[1] = temp;
                }
            }
        }

        if (arr[3] > arr[4]) {
            temp = arr[3];
            arr[3] = arr[4];
            arr[4] = temp;

            if (arr[2] > arr[3]) {
                temp = arr[2];
                arr[2] = arr[3];
                arr[3] = temp;

                if (arr[0+1] > arr[1+1]) {
                    temp = arr[1];
                    arr[1] = arr[2];
                    arr[2] = temp;

                    if (arr[0] > arr[1]) {
                        temp = arr[0];
                        arr[0] = arr[1];
                        arr[1] = temp;
                    }
                }
            }
        }








        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }


    }
}
