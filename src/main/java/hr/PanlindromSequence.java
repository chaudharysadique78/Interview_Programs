package hr;

import java.util.Scanner;

//Question: Given a String determine the no of its substring that are palindroms

public class PanlindromSequence {

    public static int countPalindromes(String s) {
        // Write your code here
        int count = 0;
        for (int center = 0; center < 2 * s.length() - 1; center++) {
            int left = center / 2;
            int right = left + center % 2;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }
        return count;

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any String");
        String input = sc.nextLine();
        int count = countPalindromes(input);
        System.out.println("No of Palindrom substring = "+count);

    }
    }

