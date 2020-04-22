package day20_ArraysContinue;

import java.util.Scanner;

public class kahoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //str= str.length()-1;
        int count = 0;




        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i,i+2).equals("hi")) {
                count++;
            }


        }
        System.out.print(count);


    }


}
