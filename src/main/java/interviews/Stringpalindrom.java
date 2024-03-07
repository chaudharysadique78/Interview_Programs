package interviews;

public class Stringpalindrom {

    public static void main(String[] args) {
        String str = "ABA";
        StringBuilder st = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            st.append(str.charAt(i));
        }
        if (str.equalsIgnoreCase(st.toString())) {
            System.out.println("given String is pallindrom");
        } else {
            System.out.println("given String is not pallindrom");
        }

        // Optimize Way
        if (isPalindrom(str)){
            System.out.println("Given String is Palindrom");
        }else{
            System.out.println("Given String is not palindrom");
        }


    }

    public static boolean isPalindrom(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
