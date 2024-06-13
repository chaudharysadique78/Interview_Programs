package interviews;

// Find Highest and second Hightest in Array using java8

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindHighestAndSecondHighestArray {

    public static int findHigestNumber(int[] arr) {
        int highest = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).findFirst().get();
        return highest;
    }

    public static int findSecondHighestNumber(int[] arr) {
        int secondHighest = Arrays.stream(arr).mapToObj(Integer::valueOf).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        return secondHighest;
    }

    public static void main(String[] args) {
      int[] arr={4,7,9,10,34,5};
      System.out.println("Highest Number: "+findHigestNumber(arr));
      System.out.println("Second Highest Number: "+findSecondHighestNumber(arr));
    }


}
