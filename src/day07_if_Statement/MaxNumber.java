package day07_if_Statement;

public class MaxNumber {
    public static void main(String[] args) {
        /* write a java program that accepts three numbers and return the maximum
        number (assume that none of them are equal)
         */

        double a = 100.5;
        double b = 200.5;
        double c = 300.5;

        boolean aGreater = a > b && a > c; // if a greater than both b and c , then a is maximum
        boolean bGreater = b > a && b > c; //if b greater than both a and c , than b is maximum
       //compile error=> boolean bGreater2 = b > a || b > c ; // if b is greater than either both a and c , then b is maximum
        boolean cGreater = c > a && c > b; //if c greater than both a and b , than c is maximum

       /* System.out.println(a+ " is greater number");
        System.out.println(b+ " is greater number");
        System.out.println(c + " is greater number ");
        */
         if (aGreater){
             System.out.println(a+ " is greater number");
         }

        if(bGreater){
            System.out.println(b+ " is greater number");
        }
        if (cGreater){
            System.out.println(c + " is greater number");
        }












    }
}
