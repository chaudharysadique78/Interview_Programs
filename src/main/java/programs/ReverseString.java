package programs;

public class ReverseString {

    public static void main(String[] args) {
        String s= "Sadik Husain";
        StringBuilder st=new StringBuilder(s);
        st.reverse();
        String s1 = st.toString();
        System.out.println("reverse String is: "+s1);
    }
}
