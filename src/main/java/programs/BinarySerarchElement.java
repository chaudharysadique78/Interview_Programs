package programs;

/*given the array and target element find the index position for the same retrn -1 if not found.*/


public class BinarySerarchElement {

    public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 7, 9, 11, 12, 45};
        System.out.println(binarySearch(numbers, 67));
    }

}
