package day14_StringClass;

import java.util.Scanner;

public class credentials {
    public static void main(String[] args) {

        String username = "cybertek";
        String password = "cybertekschool";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username");

        String scanUsername= scan.next();
        System.out.println("Enter your password");

        String scanPassword = scan.next();

        if(scanUsername.equals(username) && scanPassword.equals(password) ){
            System.out.println("Log in successfully");
        }else{
            System.out.println("Invalid credentials");
        }








    }
}
