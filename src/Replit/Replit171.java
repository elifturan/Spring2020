package Replit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Replit171 {

    public static boolean appearsTwice(String target, String sentence) {
        int count = 0;
        while(sentence.contains(target)) {
            sentence = sentence.replaceFirst(target,"");
            count++;
        }
        return (count==2) ? true : false ;
    }

}
