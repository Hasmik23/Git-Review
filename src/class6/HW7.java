package class6;
public class HW7 {
    public static void main(String[] args) {
        //Print even numbers from 20 to 1 (2 ways)

        int i = 20;
        while (i >= 1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i--;

        }


        System.out.println("**************");
        int num = 20;
        while (num >= 1) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num -= 2;

        }
    }
}

