package Replit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Predicate;

public class Assessment4 {
    public static String extractNum(String s) {
         char[] ch = s.toCharArray();
         String result ="";

        for (int i = 0; i <ch.length ; i++) {
         if(Character.isDigit(ch[i])){
             result+=ch[i];
         }
        }

        return result;



    }

}
