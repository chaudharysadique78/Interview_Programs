package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateCharacter {

    public static List<Character> findDuplicate(String str){
        List<Character> duplicateCharacter=new ArrayList<>();
        Map<Character,Integer> frequencyMap=new HashMap<>();

        for (char ch:str.toCharArray()){
            if (Character.isLetter(ch)){
                frequencyMap.put(ch,frequencyMap.getOrDefault(ch,0)+1);
            }
        }

        for (Map.Entry<Character,Integer>entry:frequencyMap.entrySet()){
            char c=entry.getKey();
            int frequency=entry.getValue();

            if(frequency>1){
                duplicateCharacter.add(c);
            }
        }

        return duplicateCharacter;
    }

    public static void main(String[] args) {
        String str="sasssasb";
        List<Character> duplicate = findDuplicate(str);

        System.out.println("Duplicate Characters in String: "+duplicate);
    }
}
