package day14_StringClass;

import java.util.Scanner;

public class middleCharacter {
    public static void main(String[] args) {
       /*
        3. Write a Java method to display the middle character of a string
        a) If the length of the string is even there will be two middle characters.
        b) If the length of the string is odd there will be one middle character.
          */
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your word");
String word = input.next();// bananas
                           // 0123456
        String middleChar = "";//to store middle character at the end
         int totalChar = word.length(); //7
        int middleNum = totalChar / 2 ; // 7/2 ==>2
        if(totalChar%2 != 0){ //odd numbers
            middleChar = middleChar+word.charAt(middleNum);
        }else{
            middleChar = middleChar + word.charAt(middleNum-1)+word.charAt(middleNum);
        }
        System.out.println(middleChar);




    }
}
