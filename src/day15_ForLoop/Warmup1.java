package day15_ForLoop;

import java.util.Scanner;

public class Warmup1 {
    public static void main(String[] args) {
        /*
        1. write a program that asks user's first and last name, then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB
         */
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your first name");
        String firstname =scan.next();
        System.out.println("Enter your last name");
        String lastname = scan.next();
     /*
        String initials2 =firstname.substring(0,1).toUpperCase() + lastname.substring(0,1).toUpperCase();
/// initials2 = initials.toUpperCase();
        System.out.println("inital is:"+initials2);

      */
      String initials = ""+firstname.charAt(0)+ lastname.charAt(0);//returns string
        initials=initials.toUpperCase();
        System.out.println(initials);
    }
}
