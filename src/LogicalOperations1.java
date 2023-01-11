public class LogicalOperations1 {
    public static void main(String[] args) {

          boolean wifi = false;
         

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        // System.out.println(false||true||false||false);


      /*  boolean boughtCho=true;
        boolean boughtFlower=true;
        if(boughtCho||boughtFlowers) {
            System.out.println("I am Happy");
        } else{
                System.out.println("I am Sad");
            }
        }
        boolean wifi=true; //    boolean wifi=false;      boolean fiveG=false;*/

        boolean fiveG = true;
        if (wifi || fiveG) {
            System.out.println("You are good for browsing internet");

        }else{
            System.out.println("Either connect to wifi or 5G");
        }
    }
}



