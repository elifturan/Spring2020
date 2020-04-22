package day14_StringClass;

import java.util.Scanner;

public class Credentials2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");
        String username = input.next();

        System.out.println("Enter your password");
        String password = input.next();

        boolean logedIn = username.equals("Cybertek")&& password.equals("cybertekschool") ;
        boolean invalidUsername= !username.equals("Cybertek") && password.equals("cybertekschool");
        boolean invalidpassword= username.equals("Cybertek") && !password.equals("cybertekschool");

        if (!username.isEmpty() && !password.isEmpty()){

        if (logedIn)  {

        }else if(invalidUsername){
            System.out.println("Password is correct, username is incorrect");

            }else if(invalidpassword){
            System.out.println("Username is correct, password is incorrect");
        }else{
            System.out.println("Both username and password are incorrect");
        }




        }else{
            System.out.println("Please enter the credentials");
        }







    }
}
