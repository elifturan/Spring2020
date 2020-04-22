package day11_Scanner;

import java.util.Scanner;

public class Salary_Calculator {
    public static void main(String[] args) {
/*
 write a program that can calculate the salary after tax
                needed informations:
                                employee' salaray
                                state tax
                                federal tax
 */
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter your salary:");

        int salary = scan.nextInt();

        System.out.println("Enter the state tax:");
     byte stateTax = scan.nextByte();
      double stateTaxPercentage = stateTax / 100.0;
        System.out.println("Enter the federal tax:");
       byte federalTax = scan.nextByte();
       double federalTaxPercentage= federalTax / 100.0;

       // totalTax = (federalTaxPercentage + stateTaxPercentage) * Salary

        double totalTax = (federalTaxPercentage + stateTaxPercentage) * salary;
        //salaryAfterTax = salary - totalTax

        double salaryAfterTax = salary- totalTax;
        System.out.println("Your net income is:" + salaryAfterTax);









    }
}
