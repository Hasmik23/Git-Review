package class6;

public class HW4 {
    public static void main(String[] args) {
       /* Create a boolean variable workDay and assign true create int variable day and assign it to 1
          As long as it is workDay print “I need a day off” and increase day.
          Once day is 6 print “I do not need a day off any more”
          Print numbers from 1 to 100 in 1 line with space */


        boolean workday = true;
        int day = 1;

        while (workday) {
            if (day > 5) {
                System.out.println("I need a day off");
                workday = false;
            } else {
                System.out.println("I do not need a day off any more");
            }
            day++;

        }
    }
}
