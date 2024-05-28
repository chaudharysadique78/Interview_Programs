package interviews;

// find the pair form list that sum form the given number k=10

import java.util.Arrays;
import java.util.List;

public class FindSumPair {

    public static void main(String[] args) {

       int[] numbers= {1,2,3,4,5,6,7,8,9,10};
        int num=5;

        for(int i=0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==num){
                    System.out.println(numbers[i]+" "+numbers[j]);
                }
            }
        }



    }
}
