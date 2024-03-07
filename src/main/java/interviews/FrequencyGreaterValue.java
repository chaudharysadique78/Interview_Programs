package interviews;

// java 8 question:
//List  list= [2,3,4,5,9,2,5,5,0,6,123,123,12,9,8,9,8].
// Sort this list based on element frequency,
// if any two number have same frequency greater value comes first


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyGreaterValue {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 3, 4, 5, 9, 2, 5, 5, 0, 6, 123, 123, 12, 9, 8, 9, 8);

        Map<Integer, Long> frequencyMap = list.stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
        list.sort(Comparator.<Integer>comparingLong(frequencyMap::get)
                .reversed()
                .thenComparing(Comparator.reverseOrder()));
        //list.sort(Comparator.reverseOrder());
        System.out.println(list);

        //sorting

        List list1=Arrays.asList(-1,2,5,7,8,-10);
        list1.sort(Comparator.naturalOrder());
        System.out.println(list1);

    }

}
