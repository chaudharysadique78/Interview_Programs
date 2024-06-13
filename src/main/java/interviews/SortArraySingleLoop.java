package interviews;

// sort thr given array by single loop

import java.util.Arrays;

public class SortArraySingleLoop {

    public static int[] sortArrayAsendingOrder(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = -1;

            }

        }
        return arr;
    }

    public static int[] sortArrayDesendingOrder(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = -1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 3, 2};
        //Arrays.stream(sortArray(arr)).forEach(System.out::println);
        System.out.println("Sort Array in Ascending order");
        System.out.println(Arrays.toString(sortArrayAsendingOrder(arr)));
        System.out.println("Sort Array in Descending order");
        System.out.println(Arrays.toString(sortArrayDesendingOrder(arr)));
    }

}
