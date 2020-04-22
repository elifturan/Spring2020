package day07_if_Statement;

public class If_Else_Statement {
    public static void main(String[] args) {

        int number = 0;
        if (number >=0){
            System.out.println(number + " is positive");
        }
        if (number < 0){
            System.out.println(number+ " is negative ");
        }

        if (number >=0){
            System.out.println(number+ " is positive");
        } else {
            System.out.println(number+ " is negative");
        }

        boolean evenNum = number % 2 == 0;
        if ( evenNum){
            System.out.println(number+ " is even number");
        }
       if ( evenNum ) {
           System.out.println(number+ " is odd number");
       }

       if (evenNum) {
           System.out.println(number+ " is even number");
       }else {
           System.out.println(number+ " is odd number");
       }

      int age = 30 ;
       if (age >= 21){
           System.out.println("Here is your Vodka");
       }else{
           System.out.println("Go home kid");
       }

       boolean testedPositiveForCorona =true; // you can use false and you get do more coding
       if (testedPositiveForCorona){
           System.out.println("Buy more toilet papers");
           System.out.println("Stay home");
       } else {
           System.out.println("Do more coding");
       }

















    }



}
