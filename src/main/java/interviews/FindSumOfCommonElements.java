package interviews;

// find the sum of common elements from 2 arrays

import java.util.ArrayList;
import java.util.List;

public class FindSumOfCommonElements {

    public static List findCommonElements(int[] arr1, int[] arr2){
        List<Integer> commonElements=new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    commonElements.add(arr1[i]);
                }
            }
        }
        return commonElements;
    }


    public static int findSum(int[] arr1, int[] arr2) {
        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    sum += arr1[i];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr1={1,2,2,3,4,5};
        int[] arr2={4,2,5,6};
        System.out.println("Common Elements: "+findCommonElements(arr1,arr2));
        System.out.println("Sum of Common elements are: "+findSum(arr1,arr2));

    }
}
