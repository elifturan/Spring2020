package OfficeHours.Practice_03_11_2020;

public class Practice_Variables {

    public static void main(String[] args) {
        /*

       brand
       year
       price
       model
       miles

         */

        String brand = "BMW";
        // variables that are decleared in a block, must be initilazed before used
        short year = 2020;
        float price = 50000.50f;
         String model = "X6";
         short maximumMiles = 32767;



        System.out.println(brand);

             /*output
             The vehicle 2020 BMW X6, has 32767 miles, price is 50000.5 dollars
              */


        System.out.println("The vehicle " + year +" "+ brand +" " +model +" "+ ", has"+" " + maximumMiles +"miles, price is"+" " +price+ " " +"dollars");








    }


    public static class Practice_EscapeSeqeuences {


        public static void main(String[] args) {
            System.out.println("    Java is a programming language");
            System.out.println("\tJava is a programming language");
              //\t   is used for giving paragraph space


            System.out.println("\n We love learning Java");
              // \n is used for starting a new line

            System.out.println("I love the Tv Show \"Flash\" ");
            System.out.println("My favorite qoute is \"Beautiful life begins with a beautiful mind\" ");
       // \" used for printing double quote

            System.out.println("/\\");
            //  \\(double back slash) is used for Single back slash!






        }


    }
}
