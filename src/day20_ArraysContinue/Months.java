package day20_ArraysContinue;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
      //
        String [] months = {"January", "February", "March", "April","May", "June","July","August","September","October","November","December"};
        /*String [] month2 = new String [12];
        month2 [0]="January";

         */
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number");
                 int num   = scan.nextInt();
                 int attempts=0;
                while(num>12 || num <= 0){
                     System.out.println("Invalid Entry");
                    // System.exit(0);
                     System.out.println("Please re-enter the number");
                     num = scan.nextInt();//12
                    attempts++;
             if(attempts == 3 && (num>12 || num <=0)){
                 System.out.println("Invalid Entry, you already have 3 attempts");
                 System.exit(0);
             }
                 }

                 String result =  months[num-1];//index number , index numbers starts from 0 ALWAYS

        System.out.println(result);









    }
}
