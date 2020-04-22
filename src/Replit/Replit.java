package Replit;

import java.util.Scanner;

public class Replit {
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result ="nothing";
        if(str.indexOf("bread") != -1){
            if(str.lastIndexOf("bread") !=str.indexOf("bread")){
                result = str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));
            }
        }

        System.out.println(result);





    }
}
