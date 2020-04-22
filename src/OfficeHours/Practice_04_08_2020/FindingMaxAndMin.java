package OfficeHours.Practice_04_08_2020;

import java.util.Scanner;

public class FindingMaxAndMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int max = -214783647; //0,
       int min = 2147483647;
        int i = 1;
        while(i<=3){

            System.out.println("Enter a number");
            int num = scan.nextInt();//0, -5
     if(num>max){
         max = num;
     } if(num<min) {
         min = num;
     }

            i++;
        }


        System.out.println("MAximum number is "+max);
        System.out.println("Minimum number is "+min);






    }
}
