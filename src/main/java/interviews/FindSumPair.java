package interviews;

// find the pair form list that sum form the given number k=10

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSumPair {

    public static void main(String[] args) {

       int[] numbers= {1,2,3,4,5,6,7,8,9,10};
        int target=5;
       List<String> output = new ArrayList<>();
       int [] outputArray=new int[2];

        for(int i=0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                   // System.out.println(numbers[i]+" "+numbers[j]);
                    outputArray[0]=numbers[i];
                    outputArray[1]=numbers[j];
                    output.add(Arrays.toString(outputArray));
                }
            }
        }

        System.out.println(output);


    }
}
