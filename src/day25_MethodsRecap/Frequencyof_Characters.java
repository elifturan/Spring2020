package day25_MethodsRecap;

import Resources.Library;

public class Frequencyof_Characters {

    public static void main(String[] args) {
        String str ="AAABBCC";//A2B2C2
        String NonDup= Library.RemoveDuplicates(str);

        for(int i =0; i<NonDup.length();i++) {

            String ch = "" + NonDup.charAt(i); //'A'
            int num = Library.Frequency(str, ch);
            System.out.print(ch + num);
        }
        System.out.println();
        String str2 =FrequencyOfChars(str);
        System.out.println(str2);

    }
public static String FrequencyOfChars (String str){
    String NonDup= Library.RemoveDuplicates(str);
String result="";
    for(int i =0; i<NonDup.length();i++) {

        String ch = "" + NonDup.charAt(i); //'A'
        int num = Library.Frequency(str, ch);
       result += ch + num;
    }
return result;

}


}
