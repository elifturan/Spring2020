package day14_StringClass;

import java.util.Scanner;

public class Combine_TwoString {
    public static void main(String[] args) {
        /*
        1. Ask user to enter two words. Print the first word, second word,
        second word, first word
			Input:
				one
				two
			Output:
				onetwotwoone
					DO NOT USE + OPERATOR

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
       String words1 = scan.next();

        System.out.println("Enter second word");
String words2 = scan.next();

String result = words1.concat(" "+words2).concat(" "+words2).concat(" "+words1);
        System.out.println(result);






    }
}
