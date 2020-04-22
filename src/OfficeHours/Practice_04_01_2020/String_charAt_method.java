package OfficeHours.Practice_04_01_2020;

public class String_charAt_method {
    public static void main(String[] args) {

//charAt(indexNumber)method:  returns the char at the given index,char primitive
        String str1 = "Java";
        char ch1 = str1.charAt(3);
        System.out.println(ch1);
        System.out.println("====================================================");
//length(): total number of characters ,int dataType we must use
        String str2 = "Cybertek School";
        int num1 = str2.length(); //-1 with maxIndex number;
        System.out.println(num1);
       int maxIndex = str2.length()-1;
      char ch3 = str2.charAt(maxIndex);
        System.out.println(ch3);
        System.out.println("===================================================");
//concat(strng): concatenation ,returns new String, + also does concatenation
        String str3 = "Cybertek";
      str3 =  str3.concat(" School");
        System.out.println(str3);


       String str4 = "Java";
        str4 = str4.concat(" is fun");
        System.out.println(str4);

        //toLowerCase() & toUpperCase(): change the case of strings to upper case to lower case

          String str5 = "CYBERTEK SCHOOL";
             str5 = str5.toLowerCase();
        System.out.println(str5);
          String str6 = "elif & orhan";
           str6=str6.toUpperCase();
        System.out.println(str6);

        System.out.println("=====================================================");
       //trim(): removes unused (white) spaces from the string, returns new string
       String str7 ="          Cybertek" ;
       str7=str7.trim();
        System.out.println(str7);
        System.out.println(str7.length());

        System.out.println("======================================================");
// substring(beginning index, ending index):creates substring forom beginning index till ending index()



String sentence1 = "I like Java";
//                  0123456789...

      String word1=  sentence1.substring(7,11);//Java
        String word2 = sentence1.substring(2,6);
        System.out.println(word1);//Java
        System.out.println(word2);//like

                              //likeJava
        String word3 =sentence1.substring(2,6)+sentence1.substring(7,11);
        System.out.println(word3);

        String sentence2 = "I like to learn Java";
        //                  0123456789....
//sunstring(beginning index):creates the substring from beginning index till end of the s tring. returns new string
         sentence2 = sentence2.substring(10);
        System.out.println(sentence2);


        String r2 = "Java";

        String r3 = r2.replaceFirst("Java", "JaVa");
        System.out.println(r3);
        System.out.println("=================================================");
//replace (old str, new str): replaces all the matching ones , returns new string
String str = "I like C#, C# is cool";
str = str.replace("C#","Java");
        System.out.println(str);

//replaceFirst(old str,new str ): replace the first matching one ,returns new string
String t1 = "Java is fun, Java is good";
t1 =t1.replaceFirst("Java","C#");
        System.out.println(t1);
        System.out.println("=======================================================");
// indexOf(str):returns the index of first matching character , as an int
        String y1 ="Today W is Wednesday";
        int a1 = y1.indexOf("W");
        int a2 = y1.indexOf("Wednesday");
        System.out.println(a1);//first W' index number
        System.out.println(a2);//second W' index number
        //lastindexOf(str):returns the last matching character , as an int

        String y2 ="Cybertek School, School";
        int b1 = y2.lastIndexOf("S");
        System.out.println(b1);



    }
}
