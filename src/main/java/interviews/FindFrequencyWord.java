package interviews;


/*Sentence is a form of String,write a code to get each word,and the number of occurrances of each word.
        mention if it has atleast one vowel or not.*/

import java.util.*;
import java.util.stream.Collectors;

public class FindFrequencyWord {

    public static void main(String[] args) {
        String str = "Hello java world ttr in";

        String[] words = str.split(" ");
        Map<String, Integer> frequencyMap = new HashMap();

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            String word = entry.getKey();
            int frequency = entry.getValue();
            System.out.print(word + " 0ccurs " + frequency + " time");
            int count = 0;
            for (char c : word.toLowerCase().toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                    break;
                }
            }
            if (count >= 1) {
                System.out.print(" also its contain vowel");
            } else {
                System.out.print(" its not contain vowel");
            }
            System.out.println();

        }
    }
}