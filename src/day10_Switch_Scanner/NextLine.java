package day10_Switch_Scanner;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the full name: ");

        String fullName = scan.nextLine();// accepts the Enter

        System.out.println(fullName);

        System.out.println("Enter your sentence: ");
        String sentence = scan.nextLine();

        System.out.println("You entered: "+ sentence);






    }
}
