package interviews;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set=new HashSet<>();
        //this will remove the duplicates
        Set<Integer> elements = new HashSet<Integer>(myList);
        System.out.println();
        List<Integer> listWithoutDuplicates = myList.stream().distinct().collect(Collectors.toList());
        System.out.println("listWithoutDuplicates "+listWithoutDuplicates);
        // this is to get the duplicate elements
        List<Integer> collect = myList.stream()
                .filter(n -> !set.add(n))
                .collect(Collectors.toList());
        System.out.println("++++++++++++++++++++++++++++++++");
System.out.println(myList.stream().distinct().collect(Collectors.toList()));
        System.out.println(collect);
        System.out.println(elements);
    }
}
