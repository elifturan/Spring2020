package day11_Scanner;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        // ex :long a =99999999999l;
        System.out.println("Enter a long number: ");

        long a = scan.nextLong();
        System.out.println("You have entered: "+a);

        System.out.println("====================================================");

        System.out.println("Enter a decimal: ");
         float b = scan.nextFloat();
        System.out.println("You have entered:" +b);

        System.out.println("=====================================================");

        System.out.println("Enter a decimal number: ");
        double c = scan.nextDouble();
        System.out.println("You have entered: "+c);

        System.out.println("Enter true or false: ");
        boolean d = scan.nextBoolean();
        System.out.println(d);

        System.out.println("Enter your sentence:");
          String e = scan.next();
        System.out.println("You have entered: "+e);








    }
}
