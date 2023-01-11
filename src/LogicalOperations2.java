public class LogicalOperations2 {
    public static void main(String[] args) {

        System.out.println(true && true);// true if all true
        System.out.println(true && false);// false if one of them false

        double mathscore = 92.5;
        double historyScore = 91.5;
        double ScienceScore = 93.5;

       /* if(mathscore>90);{
        System.out.println("You are brilliant student");
    }else{
        System.out.println("You need to work hard");
            if(historyScore>90){
                System.out.println("You are brilliant student");
            }else{
                System.out.println("You need to work hard");
                if(cienceScore>90){
                    System.out.println("You are brilliant student");
                }else{
                    System.out.println("You need to work hard");
                }
            }
        }not correct*/

        //we do Logical Operator
        if (mathscore > 90 && historyScore > 90 && ScienceScore > 90) {
            System.out.println("You are a brilliant student");

        } else {
            System.out.println("You need to work hard");

        }
    }
}
