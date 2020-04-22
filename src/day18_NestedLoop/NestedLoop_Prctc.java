package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoop_Prctc {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        while(true){
            System.out.println("Enter two numbers");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            System.out.println("Addition of two numbers: "+(num1+num2));
            System.out.println("Do you want to continue?");
            String answer = scan.next();
            if(  ! (answer.equalsIgnoreCase("Yes"))|| answer.equalsIgnoreCase("no")){
                System.out.println("Invalid Entry, please re-enter the Yes or No");
            }
            if(answer.equalsIgnoreCase("No")){
                System.out.println("Thank you for using the calculator");
                break;
            }
        }
        System.out.println("================================================");














    }

}
