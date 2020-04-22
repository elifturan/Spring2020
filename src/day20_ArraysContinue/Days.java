package day20_ArraysContinue;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        String[] days ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = scan.nextInt();

       int attempts= 0;
        while (num>7 || num<=0){
            System.out.println("Invalid Entry");
            System.out.println("Please re-enter");
           num = scan.nextInt();
           attempts++;
           if(attempts ==3 &&(num>7 || num<=0)){
               System.out.println("Invalid Entry , You already have 3 attempts");
               System.exit(0);
           }
        }
        String result = days[num-1];
        System.out.println(result);

    }
}
