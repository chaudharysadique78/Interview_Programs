package hr;

//Question :You are in charge of the cake for a child’s birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest. For example, in the array candles = [4, 4, 1, 3], return 2.

public class CountTallestCandale {

    public static int countTallestCandle(int[] arr){
        int max=0;
        int count=0;
        for (int a:arr)
        {
            if(max<a){
                max=a;
            }
        }
        for (int a:arr){
            if(a==max){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] candles={4, 4, 1, 3};
        int count = countTallestCandle(candles);
        System.out.println(count);
    }
}
