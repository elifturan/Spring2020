package day24_Methods;

import java.util.Scanner;

public class Birthyear_Calculator {
    public static void main(String[] args) {
      //  int a= 1994;
      //  Age(a);
        printHelloCybertek();
   //     Age(1996);
    }
    public static void Age (int birthYear){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the current year");
        int currentYear =scan.nextInt();
        int age =currentYear-birthYear;
        if(birthYear<=currentYear && birthYear>1900){
            System.out.println(age);
        }else{
            System.out.println("You are not born yet :D ");
        }



    }
public static void printHello(){
    System.out.println("Hello");
}
public static void printCybertek(){
    System.out.println("Cybertek");
}
public static void printHelloCybertek(){
    printHello();
    printCybertek();
}

}
