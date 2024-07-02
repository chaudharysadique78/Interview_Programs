package programs.array;


import java.util.Arrays;

public class SortArray {

    public static int[] sortArrayAsendingOrder(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] sortArrayinDesendingOrder(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 3, 2};
        System.out.println("Array Before sort " + Arrays.toString(arr));
        System.out.println("Array After sort in Asending Order " + Arrays.toString(sortArrayAsendingOrder(arr)));
        System.out.println("Array After sort in Desending Order " + Arrays.toString(sortArrayinDesendingOrder(arr)));

    }
}
