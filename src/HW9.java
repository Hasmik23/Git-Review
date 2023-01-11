import java.util.Scanner;
public class HW9 {
    public static void main(String[] args) {
        /*Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad,
    any other grade --> Not Acceptable. At the end your program should print which
    grade was entered by a user with explanation.*/

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter grade A, B, C, or D");
        char grade=input.next().charAt(0);

        switch(grade){
            case 'A':
                System.out.println("excellent");
                break;
            case 'B':
                System.out.println("good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Bad");
                break;
            default:
                System.out.println("Wrong grade");
        }

    }

}
