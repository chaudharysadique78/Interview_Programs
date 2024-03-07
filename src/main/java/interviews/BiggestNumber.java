package interviews;

public class BiggestNumber {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;

        // using 4th Variable
        /*int biggest = a;
        if (b > biggest) {
            biggest = b;
        }
        if (c > biggest) {
            biggest = c;
        }
        System.out.println(biggest);*/

        //without using 4th variable
        if (a >= b & a >= c) {
            System.out.println(a);
        }
        else if (b >= a & b >= c) {
            System.out.println(b);
        }
        else if (c >= a & c >= b) {
            System.out.println(c);
        }
    }
}
