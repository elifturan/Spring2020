package day30_ArrayListt;

import java.util.Arrays;

public class SumOfDigits {
    public static void main(String[] args) {
        /*
        1. write a program that can return the sum of all the digits from a string
			ex:
				input: "a1b2c3"
				output: 6
					(1+2+3= 6)
				input: "Today's date is 04/27/2020"
				output: 17
					(0+4+2+7+2+0+2+0=17)
			HINT: on ascii table, the characters between #48 ~ #57 are digits
         */

        String str ="a1b2c3";
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));

        int sum= 0;//will contain sum of all digits
        for (char each: chars) {

       /*    boolean isDigit= each>= 48 && each <=57;//if each is digit , we will convert to int and add it to sum
           if(isDigit){
             sum += Integer.parseInt(""+each);// "0" String zero
           }     */

       if(Character.isDigit(each)){// isDigit(); identified if the given character is digit
           sum+=Integer.parseInt(""+each);
       }


        }
        System.out.println(sum);

       boolean a = Character.isAlphabetic('A');// identifies if the character is alphabet
        System.out.println(a);






    }
}
