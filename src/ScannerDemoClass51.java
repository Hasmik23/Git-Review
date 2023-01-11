import java.util.Scanner;

public class ScannerDemoClass51 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        /*
        Scanner => Name of the class
        scan is a variable like we create primitive variables
        =  => assignment operator
        System.in => TELLS THE COMP to read  DATA from keyboard
         */


       /* System.out.println("Are you hungry");
        boolean hungry=scan.nextBoolean();
        System.out.println("Hungry"+hungry);*/

       /* System.out.println("Please enter your gender");
        char gender=scan.next().charAt(0); //char(0) takes only first char from input, char(1) takes 2nd letter or char
        System.out.println("Your gender is "+gender);*/

        /*System.out.println("Please enter your name");
        String name=scan.next();
        System.out.println("Your name is "+name);// will take everything before the space*/

        scan.nextLine();// Trick to make next line work after we have used any other methods from scanner class
        System.out.println("Please enter your full name");
        String fullName=scan.nextLine();
        System.out.println("Your full name is "+fullName);

        scan.close();//Close the scanner is a good practice









    }
}
