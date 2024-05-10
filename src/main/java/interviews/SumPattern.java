package interviews;

//collection of numbers 1 to 10, when we add them get the sum as k=10 some value

public class SumPattern {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 15;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length - 1; j++) {
                if (numbers[i] + numbers[j] == k) {
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }

    }


}
