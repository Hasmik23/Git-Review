import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {

        /* Write a program to find largest of three double values using if-else..if and logical operators
        provided by a user (numbers must be distinct)
         */

        Scanner input = new Scanner(System.in);
        double a,b,c;
        System.out.println("Please enter 3 numbers");
        a=input.nextDouble();
        b=input.nextDouble();
        c=input.nextDouble();
       /* int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();*/

        if (a>b && a>c) {
           // System.out.println("a is the largest number");
            System.out.println(a+" is the largest number");
        } else if (b > a && b > c) {
            System.out.println(b+" is the largest number");
        } else if (c > a && c > b){
            System.out.println(c+" is the largest number");
        }
    }
}












