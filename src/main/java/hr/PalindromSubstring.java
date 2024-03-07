package hr;

import java.util.Scanner;

//Question: Given a String determine the no of its substring that are palindroms



public class PalindromSubstring {

    public static Integer countPalindromSubstring(String input){
        int count=0;
        int length=input.length();
        for(int i=0;i<length;i++){
            for (int j=i+1;j<=length;j++){
                String substring = input.substring(i, j);
                if(isPalindrom(substring)){
                    count++;
                }
            }
        }
        return count ;
    }

    public static boolean isPalindrom(String subString){
        int left=0;
        int right=subString.length()-1;
        while (left<right){
            if(subString.charAt(left)!=subString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return  true;
    }

    public static void main(String[] args) {
        System.out.println("Enrter Your input");
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        Integer count = countPalindromSubstring(input);
        System.out.println("No of Palindrom Substring: "+count);

    }
}
