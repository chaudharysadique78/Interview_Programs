package programs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;


public class MostFrequentIntegers {

    public int mostFrequent(int[] input) {
        Map<Integer, Long> frequencyMap = Arrays.stream(input).boxed().collect(Collectors.groupingBy(num -> num, Collectors.counting()));
        long maxFrequency = 0;
        int result = 0;

        for (Map.Entry<Integer, Long> entry : frequencyMap.entrySet()) {
            Integer num = entry.getKey();
            Long frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                result = num;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MostFrequentIntegers mostFrequentIntegers = new MostFrequentIntegers();

        // Test case 1
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println("Test case 1 output: " + mostFrequentIntegers.mostFrequent(input));
        // Expected Output: 1

        // Test case 2
        int[] input2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Test case 2 output: " + mostFrequentIntegers.mostFrequent(input2));
        // Expected Output: 1

        // Test case 3
        int[] input3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 2};
        System.out.println("Test case 3 output: " + mostFrequentIntegers.mostFrequent(input3));
        // Expected Output: 2
    }

}
