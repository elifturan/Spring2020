package day03_VariablesContinue;

public class SalaryCalculator {


    public static void main(String[] args) {

       /* Task 08:
        Create a class called salary calculator, write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
        ex:
        if:
        rate = 55;
        stateTax = 0.04;
        federalTax =0.22;
        weeklyHours = 40;
        then output will be:
        your salary is: 105600 USD
        your total tax is: 27456 USD
        your income after tax is: 78144 USD
        if:
        rate = 45.25;
        stateTax =0.045;
        federalTax = 0.25;
        weeklyHours = 45;
        then output will be:
        your salary is: 91260 USD
        your total tax is: 26921.7
        your income after tax: 64338.3 USD
         */
        //DataType varaibleName = Data ;

        double hourlyRate = 55;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        byte weeklyHours = 40;
        byte totalWeeks = 52;
        // salary = hourlyRate * weeklyHours * 52

        double salary = hourlyRate * weeklyHours * totalWeeks ;
                  // Salary before tax

        //stateTax = slary* stateTaxRate
         double stateTax = salary * stateTaxRate;

         //federalTax = salary * federalTaxRate
        double federalTax = salary * federalTaxRate;

        //salaryAfterTax = salary - stateTax - federalTax ;
        double salaryAfterTax = salary - (stateTax + federalTax);



        System.out.println("Your salary is: $"+salary); //concatenation
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Federal Tax is: $" + federalTax);
        System.out.println("Total Tax is: $" + federalTax + stateTax);
        System.out.println("Salary After Tax is; $"+salaryAfterTax );

        System.out.println("9"+ 3 ); // 93 , concatenation
        System.out.println( 9 + "3 "); // 93 , concatenation
        System.out.println(9 + 3 ); // 12 ,addition

        //number+number ===> addition
        // text+number ====> concatenation
        // number+text ====> concatenation
        // text+text ====> concatenation




    }


}
