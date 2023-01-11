import java.util.Scanner;
public class HW3 {
    public static void main(String[] args) {
        /* 3) Write a program that will read three inputs of scores (quiz, mid term, and final scores)
        and determine the grade based on the following rules:
           if the average score >=90 → grade=A, if the average score >= 70 and <90 → grade=B
               if the average score>=50 and <70 → grade=C,  if the average score<50 → grade=F  */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter quiz score");
        int quiz=input.nextInt();

        System.out.println("Please enter med term score");
        int mid=input.nextInt();

        System.out.println("Please enter final score");
       int finalScore=input.nextInt();

    if(quiz+mid+finalScore>=90){
         System.out.println("Grade=A");
    }else if(quiz+mid+finalScore>=70 &&quiz+mid+finalScore<90){
        System.out.println("Grade=B");
    }else if(quiz+mid+finalScore>=50 &&quiz+mid+finalScore<70){
        System.out.println("Grade=C");
    }
   } }

