package programs;

import java.util.HashMap;
import java.util.Map;

public class FindMinMaxOccurance {

    public static void main(String[] args) {

        String str = "AABBCRRRRRRRR______________";
        Map<Character, Integer> frequancyMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            if(Character.isLetter(c))
            frequancyMap.put(c, frequancyMap.getOrDefault(c, 0) + 1);
        }

        char maxChar = '\0';
        char minChar ='\uffff';

        int maxCount = 0;
        int minCount = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : frequancyMap.entrySet()) {
            char c = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxCount) {
                maxCount = frequency;
                maxChar = c;
            }
            if (frequency < minCount) {
                minCount = frequency;
                minChar = c;
            }
        }

        System.out.println("Maxmimum number of time cocurence character " + maxChar);
        System.out.println("Minimum number of time cocurence character " + minChar);


    }
}
