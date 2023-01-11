import java.util.Scanner;
public class HW7 {
    public static void main(String[] args) {
  //7) Ask user to enter their country and capture it. Once values are captured print which language user speaks.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter country");
        String country=input.next();

              switch (country){
            case "USA":
                System.out.println("user speaks English");
                break;
            case "Armenia":
                System.out.println("user speaks Armenian");
                break;
            case "France":
                System.out.println("user speaks French");
                break;
            case "England":
                System.out.println("user speaks English");
                break;
            case "Germany":
                System.out.println("user speaks Dutch");
                break;
            default:
                System.out.println("Wrong Country");
        }
    }
}

