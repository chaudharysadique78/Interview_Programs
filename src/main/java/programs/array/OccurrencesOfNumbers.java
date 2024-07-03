package programs.array;

/* program on number of occurrences of a number in an array:
        input:--int[] arr = {1,1,1,2,2,3,3,4,4};
        output:- 1--> 3times, 2--> 2 times, 3--> 2times, 4--> 2times */


import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurrencesOfNumbers {

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,4,4};
        Map<Integer, Long> frequncyMap = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(num -> num, Collectors.counting()));
        frequncyMap.forEach((k,v)->{
            System.out.println(k+"--> "+v+" times");
        });

    }
}
