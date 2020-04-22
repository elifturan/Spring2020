package day13_StringClass;

import java.util.Scanner;

public class Shipping_Info {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        2. write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
         */
        System.out.println("Enter your building number");
       String Bnum =scan.next();

        scan.nextLine();
        System.out.println("Enter your street address");
        String street = scan.nextLine();

        System.out.println("Enter your city name");
        String city = scan.next();

        System.out.println("Enter your state name");
        String state = scan.next();

        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();

           scan.nextLine();
        System.out.println("Enter your full name");
        String fullName= scan.nextLine();

        System.out.println("Ship to: \t " +fullName+"\n \t \t \t "+Bnum+" "+street+"\n \t \t \t "+city+", "+state+" "+zipcode);


    }
}
