import java.util.Scanner;
public class HW6{
    public static void main(String[] args) {
        /* 6)Write a program to find the largest number among three numbers using nested if provided
        by a user (numbers must be distinct) */

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=input.nextInt();

        System.out.println("Please enter second number");
        int num2=input.nextInt();

        System.out.println("Please enter third number");
        int num3=input.nextInt();

        if(num1>num2 &&num1>num3) {
            System.out.println("The largest number is " + num1);
        }else if(num2>num1 &&num2>num3){
                System.out.println("The largest number is "+num2);
        }else if(num3>num1 &&num3>num2){
                System.out.println("The largest number is "+num3);
            }
    }
}
