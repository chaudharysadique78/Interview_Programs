package programs;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    /**
     * This method should return the longest substring without repeating characters.
     * If there are multiple such substrings, the function should return the first one.
     * If there are no such substrings, the function should return null.
     *
     * @param input The input string
     * @return The longest substring without repeating characters
     */
    public String longestSubstring(String input) {

        /* We are using a technique called Sliding Window Approach to solve this problem.
         * Initialization:
         * <p>
         * charIndexMap is a HashMap to store the last index of each character.
         * maxLength keeps track of the length of the longest substring found so far.
         * start is the starting index of the current window.
         * startIndexOfMaxSubstring stores the starting index of the longest unique substring found.
         * Iteration:
         * <p>
         * Iterate through each character in the string using the end pointer.
         * If the current character is already in the charIndexMap, update the start to the right of the last occurrence of the
         * current character (charIndexMap.get(currentChar) + 1), ensuring all characters in the current window are unique.
         * Update the charIndexMap with the current character and its index.
         * Update the longest unique substring:
         * <p>
         * If the current window size (end - start + 1) is greater than maxLength, update maxLength and startIndexOfMaxSubstring.
         * Return the result:
         * <p>
         * Extract the substring from startIndexOfMaxSubstring to startIndexOfMaxSubstring + maxLength and return
         */
        if (input == null && input.isEmpty()) {
            return "";
        }

        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        int startIndexOfMaxSubstring = 0;

        for (int end = 0; end < input.length(); end++) {
            char currentChar = input.charAt(end);
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
                start = charIndexMap.get(currentChar) + 1;
            }
            charIndexMap.put(currentChar, end);
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                startIndexOfMaxSubstring = start;
            }
        }


        return input.substring(startIndexOfMaxSubstring, startIndexOfMaxSubstring + maxLength);
    }

    public static void main(String[] args) {
        LongestSubstring longestSubstring = new LongestSubstring();
        System.out.println(longestSubstring.longestSubstring("abcabcbb")); // abc
        System.out.println(longestSubstring.longestSubstring("bbbbb")); // b
        System.out.println(longestSubstring.longestSubstring("pwwkew")); // wke
    }

}
