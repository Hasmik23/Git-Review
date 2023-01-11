public class SwitchCaseDemo {
    public static void main(String[] args) {
       //Week days
       /*  switch  case is faster than if-else but it's limited can't use boolean
         can't use for more than 2 variables but we can use scanner*/
        int day=1;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;  //prevent to print all week days once
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
               case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong Day");
        }

    }
}
