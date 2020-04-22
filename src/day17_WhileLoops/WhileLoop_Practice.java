package day17_WhileLoops;

import java.util.Scanner;

public class WhileLoop_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Yes or No");

           String word = scan.next();

          boolean valid =word.equalsIgnoreCase("Yes")|| word.equalsIgnoreCase("No");

         while(!valid) {
             System.out.println("Please re-enter");
             word = scan.next();
             if (word.equalsIgnoreCase("Yes") || word.equalsIgnoreCase("No")) {
break;
             }
         }
        if(word.equalsIgnoreCase("Yes")){
            System.out.println("Entered yes");
        }if(word.equalsIgnoreCase("No")){
            System.out.println("Entered No");
        }







    }
}
