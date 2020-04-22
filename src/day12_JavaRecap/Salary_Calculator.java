package day12_JavaRecap;

import java.util.Scanner;

public class Salary_Calculator {
    public static void main(String[] args) {

/*
        ask the user enter salaray
        ask the user enter full name
        ask the user to enter company name
        ask the user to enter SSN
        ask the user to enter JobTitle
     */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary:");
        double salary = input.nextDouble();

         input.nextLine();
        System.out.println("Enter full name:");
        String fullName = input.nextLine();

        //input.nextLine();
        System.out.println("Enter company name:");
        String companyName = input.nextLine();

        System.out.println("Enter your SSN number:");
        int SSN = input.nextInt();

        input.nextLine();
        System.out.println("Enter your job title:");
        String jobTitle = input.nextLine();

        System.out.println("Full name :"+fullName+"\nSSN number :"+SSN+"\nJob Title :"+jobTitle+"\nCompany name:"+companyName+"\nSalary is: $"+salary);

    }



}
