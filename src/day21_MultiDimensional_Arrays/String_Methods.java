package day21_MultiDimensional_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class String_Methods {
    public static void main(String[] args) {

  String name ="Java";//'J' , 'a' , 'v' , 'a'

        char[] chars =name.toCharArray();
        System.out.println(chars[0]);//'J'
        System.out.println(chars[3]);//a
       // System.out.println(chars[4]);// out of bound

        String str="I like Java";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

/*
reverse sentence : day great is today
 */
String sentence = "Today is great day";
String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words)); // [Today, is, great, day]
String result = "";
for(int i = words.length-1; i>=0;i--){
    String eachWord= words[i] ;
   // System.out.print(eachWord+" ");
    result += eachWord+ " ";
}

        System.out.println(result);


String str2 = "ABCD";
     String [] arr2 =     str2.split("") ;    //["A" , "B", "C", "D"]
 char [] ch2 = str2.toCharArray();
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(ch2));








    }
}
