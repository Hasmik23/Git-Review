public class LogicalOperators {
    public static void main(String[] args) {

       /* mathematical operators + _
          Relational operators  to compare
          Today we have logical operators: just another set of symbols that we can use multiple boolean values.
          There are !   ||  && */

        System.out.println(!true);// not true
        System.out.println(!false);// not false
        boolean rich = true;
        System.out.println(!rich);

        /* 1  2  3  4  5  6  7  8  9         15*/
        int number = 9;
        if (number == 9) {
            if (number == 2) //etc
                System.out.println("Hello World");
        } else {
            System.out.println("hello java");
        }

        String country = "China";

        if (!country.equals("BadCountry")) ;
        {     // instead to code every country

            System.out.println("You are welcome");

        }
    }
}

