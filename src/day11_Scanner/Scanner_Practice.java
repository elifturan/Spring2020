package day11_Scanner;

import java.util.Scanner;
/*
Task: Scanner_Practice1
    1. ask the user enter first name
    2. ask user to enter last name
    3. ask the user employeed or not? true ==> employeed, false ==> unemployeed
    4. if he is employeed , ask the salary
    4. if he is not employeed set the salary to 0
    output:
        full name:
        employeeed status:
        salary:
 */
public class Scanner_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter First name: ");
       String firstName = scan.next();

        System.out.println("Enter Last name: ");
        String lastName = scan.next();

        String fullName = firstName+ " "+lastName;

        System.out.println("Are you employed:");
        boolean employe =scan.nextBoolean();

        double salary=0;
        if (employe == true){
            System.out.println("Enter your Salary: ");
            salary = scan.nextDouble();

        }else {
            System.out.println("Unemployed");
        }


        System.out.println("Full name is:"+fullName);
        System.out.println("Employed: "+employe);
        System.out.println("Salary: $"+salary);
    }
}
