/*list= 1,5,6,7,5,4,9,2,2
        n=5
        ouput: 5,5,1,6,7,4,9,2,2
        public List<Integer> get(List<Integer> list , int n){
}
 complete the above function to print the pattern given number should comes first/
*/
package interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPatternPrint {

    static List<Integer> patternList = new ArrayList<>();

    public static List<Integer> get(List<Integer> list, int n) {

        // printing given number first
        for (int num : list) {
            if (num == n) {
                patternList.add(num);
            }
        }

        // Printing rest of the elments
        for (int num : list) {
            if (num != n) {
                patternList.add(num);
            }

        }

        return patternList;
    }


    private void show() {
        System.out.println("Show");
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 6, 7, 5, 4, 9, 2, 2);
        int n = 2;
        System.out.println(get(list, n));

    }

}
