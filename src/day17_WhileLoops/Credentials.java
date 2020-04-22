package day17_WhileLoops;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter User name");
               String username =   input.next();
        System.out.println("Enter Password");
               String password = input.next();

int count=1;
     while(!(username.equalsIgnoreCase("elif")&& password.equalsIgnoreCase("eliforhan"))){
         System.out.println("Please re-enter your credentials");
         System.out.println("Enter User name");
         username=input.next();

         System.out.println("Enter Password");
         password=input.next();

         count++;
         if(count ==3){
             System.out.println("Your account is locked");
             break;
         }
     }
 if(username.equalsIgnoreCase("elif")&& password.equalsIgnoreCase("eliforhan")){
     System.out.println("Logged in");
 }


    // System.out.println("Logged in");






    }
}
