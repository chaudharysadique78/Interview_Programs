package programs.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMap {

    public static void main(String[] args) {

        //map
        List<Integer> list=List.of(1,3,4);

        List<Integer> collect = list.stream().map(i -> i * 3).collect(Collectors.toList());
        System.out.println(collect);


        //flatMap

        List<List<Integer>> numbersList=new ArrayList<>();
        numbersList.add(Arrays.asList(1,2,3));
        numbersList.add(Arrays.asList(4,5,6));
        numbersList.add(Arrays.asList(7,8,9));

        List<Integer> collect1 = numbersList.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
        System.out.println(collect1);
        numbersList.stream().flatMap(n-> n.stream()).forEach(System.out::println);
    }
}
