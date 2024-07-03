package programs.array;

/*Write a program to find first and last occurence of given numbers
        input1: (1,3,3,3,4,5,6,7,7,7,7)
        input2: 3, 7

        output : first occurence of 3 and last occurence of 7*/


public class FirstAndLastOccurence {

    public static int firstOccurence(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int lastOccurence(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,3,3,3,4,5,6,7,7,7,7};
        int[] targets={3,7};

        for (int num:targets){
            int firstOccurence = firstOccurence(arr, num);
            System.out.println("First Occurence of "+num+" "+firstOccurence);
            int lastOccurence = lastOccurence(arr, num);
            System.out.println("Last Occurence of "+num+" "+lastOccurence);

        }
    }

}
