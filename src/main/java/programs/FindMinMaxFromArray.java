package programs;

import java.util.Arrays;

public class FindMinMaxFromArray {

    public static void main(String[] args) {

        int[] numbers = {2, 3, 4, 5, 9, 2, 0, 32};
        // int[] numbers = {};

        //using Java 8

        int min = Arrays.stream(numbers).min().orElseThrow(() -> new IllegalArgumentException("Array is Empty"));
        int max = Arrays.stream(numbers).max().orElseThrow(() -> new IllegalArgumentException("Array is Empty"));

        System.out.println("Min Element: " + min);
        System.out.println("Max Element: " + max);

        System.out.println("_______________________________");

        //using logic

        int min1 = findMin(numbers);
        System.out.println("Min Element: " + min1);

        int max1 = findMax(numbers);
        System.out.println("Min Element: " + max1);


    }

    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
