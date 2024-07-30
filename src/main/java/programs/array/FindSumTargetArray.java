/* Input: candidates = [2,3,6,7], target = 7 Output: [[2,2,3],[7]]
find the target sum numbers used multiple times
Explanation:2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
        7 is a candidate, and 7 = 7.
        These are the only two combinations. */


package programs.array;

import java.util.ArrayList;
import java.util.List;


public class FindSumTargetArray {

    public static void main(String[] args) {

        int[] numbers = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> combination = findCombination(numbers, target);
        System.out.println(combination);
    }

    public static List<List<Integer>> findCombination(int[] numbers, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombination(numbers, target, 0, new ArrayList<>(), result);
        return result;
    }

    static void findCombination(int[] numbers, int target, int start, List<Integer> current, List<List<Integer>> result) {

        if (target < 0) {
            return;
        }

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < numbers.length; i++) {
            current.add(numbers[i]);
            findCombination(numbers, target - numbers[i], i, current, result);
            current.remove(current.size() - 1);
        }
    }
}


