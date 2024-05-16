package interviews;

// Find First Repeating Character from given string str="JAVAJAVAEE"

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindFirstRepeatingCharacter {

    public static void main(String[] args) {
        String str="JAVAJAVAEE";
        Set<Character> set=new HashSet<>();
        List <Integer> l=Arrays.asList(3,6,9);
        System.out.println(l.get(0));
        Optional<Character> first = IntStream.range(0, str.length()).mapToObj(str::charAt).filter(ch -> !set.add(ch)).findFirst();
        System.out.println(first.get());


    }
}
