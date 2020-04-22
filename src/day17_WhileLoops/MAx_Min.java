package day17_WhileLoops;


import day07_if_Statement.MinNumber;

import java.util.Scanner;

public class MAx_Min {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int maxNumber = -999999;// any number the user provided will be greater than this number
// first user enter variable will be initialized to maxNumber
        int minNumber = 199999999;

        for(int i = 1; i <=5; i++){
        System.out.println("Enter a number");
        int num = scan.nextInt();


        if(num>maxNumber){// to compare each user inputs , and assign the max number to MaxNumber
            maxNumber = num ;

        }
        if(num<minNumber){
           minNumber=num;
        }
    }
        System.out.println(minNumber);
        System.out.println(maxNumber);





    }
}
