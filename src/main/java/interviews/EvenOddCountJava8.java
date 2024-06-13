package interviews;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddCountJava8 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Map<Boolean, Long> evenOddCount = list.stream().collect(Collectors.groupingBy(e -> e % 2 == 0, Collectors.counting()));
        Long evenCount = evenOddCount.get(true);
        Long oddCount = evenOddCount.get(false);

        System.out.println("Even Count:" + evenCount + " OddCount:" + oddCount);


        //Just for Knowledge checking Conversions of types

        Integer i = evenCount.intValue();
        Integer i1 = oddCount.intValue();

        System.out.println("Even Count:" + i + " OddCount:" + i1);

        Integer test = 6;
        Long l = test.longValue();

        long b = 34;
        Integer t = Integer.valueOf(String.valueOf(b));
        Long aLong = Long.valueOf(b);
        Long bLong = b;
        String s = String.valueOf(b);

    }

}
