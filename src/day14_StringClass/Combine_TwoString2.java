package day14_StringClass;

import java.util.Scanner;

public class Combine_TwoString2 {

    public static void main(String[] args) {

  /*
  2. Ask user to enter two words. Print first word without its first
  character then print the second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana

   */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
       String word1 = scan.next();

        System.out.println("Enter second word");
String word2 = scan.next();

word1 = word1.substring(1, word1.length());
        word2 = word2.substring(1 , word2.length());
String result = word1+word2;
        System.out.println(result);







    }




}
