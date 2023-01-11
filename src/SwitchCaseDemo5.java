import java.util.Scanner;

public class SwitchCaseDemo5 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter your gender(m/M/f/F");
        char gender=scan.next().charAt(0);

       //char gender='F';
       switch (gender){
           case 'F':
               System.out.println("Female");
               break;

           case 'f':           /*or case 'F':
                                System.out.println("Female");
                                break;*/
               System.out.println("Female");
               break;
           case 'm':
           case 'M':
               System.out.println("Male");
               break;
           default:
               System.out.println("not specified");
       }

       // Scanner scan=new.nesx
    }
}
