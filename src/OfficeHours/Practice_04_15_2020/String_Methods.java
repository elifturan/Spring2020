package OfficeHours.Practice_04_15_2020;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.lang.reflect.Array;
import java.util.Arrays;

public class String_Methods {
    public static void main(String[] args) {
 /*
 String methods:
      toCharArray(): returns char array
      split():
  */
String str = "Cybertek";

char [] ch1 = str.toCharArray();

        System.out.println(str.length() == ch1.length);//true
// str1 ="abc" , str2="cab"

        String str1 = "abc";
        String str2 ="cab";

char [] ch2 = str1.toCharArray();
char [] ch3 = str2.toCharArray();
Arrays.sort(ch3);
        System.out.println(Arrays.equals(ch2,ch3));

        System.out.println("=================================");
String sentence ="I like to learn Java ";
  String [] words =   sentence.split(" ");

        System.out.println(Arrays.toString(words));
int totalWords = words.length;
        System.out.println(totalWords);

        // java learned to like I reversed

String result ="";
        for(int i = words.length-1; i>=0; i--){
            //System.out.print(words[i]+" ");
            result +=words[i]+" ";
        }
        System.out.println(result.trim());




    }
}
