package Test;

public class insertionSortTest01 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4};

        int N = arr.length;

        int temp;
        if (arr[1] > arr[2]) {
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }

        if (arr[0] > arr[1]) {
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }


        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);


    }
}
