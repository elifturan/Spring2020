package day16_ForLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Palindrom_Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your words");
     String word = scan.nextLine();
     String reversedWord=""; //a

       for (int i = word.length()-1 ; i >= 0  ; i--){
                  reversedWord   +=  word.charAt(i);

       }

        //System.out.print(reversedWord);

boolean palindrome = word.equalsIgnoreCase(reversedWord);
        System.out.println(palindrome);


    }
}
