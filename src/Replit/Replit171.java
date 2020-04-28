package Replit;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Replit171 {
    public static boolean isPalindrome (String check){
          String result ="";
        for (int i = check.length()-1; i >=0 ; i--) {
        result += check.charAt(i);
        }
if(check.equalsIgnoreCase(result)){
    return true;
}
return  false;
    }

    public static void main(String[] args) {


    }
}
