package interviews;

// Find First Repeating Character from given string str="JAVAJAVAEE"

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindFirstRepeatingCharacter {

    public static void main(String[] args) {
        String str="JAVAJAVAEE";
        Set<Character> set=new HashSet<>();
        char first = IntStream.range(0, str.length()).mapToObj(str::charAt).filter(ch -> !set.add(ch)).findFirst().get();
        System.out.println(first);



    }
}
