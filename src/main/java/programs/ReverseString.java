package programs;

public class ReverseString {

    public static void main(String[] args) {
        String s = "Sadik Husain";
        StringBuilder st = new StringBuilder(s);
        st.reverse();
        String s1 = st.toString();
        System.out.println("reverse String is: " + s1);

        // Another way
        String input = "SADIK";
        StringBuilder result = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);
            result.append(c);
        }
        System.out.println(result.toString());

    }


}

