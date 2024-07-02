package programs.array;

import java.util.Arrays;

public class ArraySum {

    public static void main(String[] args) {

        int[] numbers = { 8, 2};
        int sum = Arrays.stream(numbers).sum();
        int reduce = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
        System.out.println("Sum of array elements is: " + sum);
        System.out.println("Sum of array elements is: " + reduce);

    }

}
