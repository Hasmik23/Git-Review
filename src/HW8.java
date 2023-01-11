import java.util.Scanner;
public class HW8 {
    public static void main(String[] args) {
        /*HomeWork: Using scanner class create calculator. Allow user to enter 2 numbers and
        operator(+,-,*,/). Based on operator provide the result to user.*/

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int num1=input.nextInt();
        int num2=input.nextInt();
        System.out.println("Please enter operator +, _, *, /");
        char operator=input.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Wrong operator");



        }


    }
}
