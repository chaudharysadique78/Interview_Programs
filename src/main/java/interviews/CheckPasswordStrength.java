package interviews;

/*
        It contains
        at least one lowercase English character.
        It contains at least one uppercase English character.
        It contains at least one special character. The special characters are: !@#$%^&*()-+
        Its length is at least 8.
        It contains at least one digit.

the out put will be the numbers of criteria not matched
suppose if one criteria not matched then output will be 1 and if 2 then 2*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckPasswordStrength {

    static int result = 0;
    static boolean hasLowercase = false, hasUpperCase = false, hasSpecial = false, hasDigit = false;
    static Set<Character> set = new HashSet<>(Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'));

    public static int passwordChecker(String input) {

        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c))
                hasLowercase = true;
            if (Character.isUpperCase(c))
                hasUpperCase = true;
            if (Character.isDigit(c))
                hasDigit = true;
            if (set.contains(c))
                hasSpecial = true;
        }

        if (hasSpecial) {
        } else {
            result++;
        }
        if (hasDigit) {
        } else {
            result++;
        }
        if (hasUpperCase) {
        } else {
            result++;
        }
        if (hasLowercase) {
        } else {
            result++;
        }
        if (input.length() < 8)
            result++;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Password");
        String input = sc.nextLine();
        System.out.println("Number of Condition not matched: " + passwordChecker(input
        ));
    }

}
