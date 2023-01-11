package class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        String Country = "China";

        System.out.println(Country.toLowerCase());

        switch (Country.toLowerCase()) { //convert to lower caseUSA =>usa

            case "usa":
                System.out.println("Burgers");
                break;
            case "Italy":
                System.out.println("Pasta");
                break;
            case "afghanistan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("Wrong Country");

        }
    }
}
