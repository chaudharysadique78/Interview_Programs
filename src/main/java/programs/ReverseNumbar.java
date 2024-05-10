package programs;

import java.util.Scanner;

public class ReverseNumbar {

    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int reminder;
        int sum = 0;

        // Find revere number
        while(n>0){
            reminder=n%10;
            rev=rev*10+reminder;
            n=n/10;
        }
        System.out.println("reverse of given Number is: " +rev);

        //find sum of every number
        while (n > 0) {
            reminder = n % 10;
            sum = sum + reminder;
            n = n / 10;
        }
        System.out.println("sum on given Number is: " + sum);

    }
}
