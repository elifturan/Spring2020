package day13_StringClass;

public class String_Manipulation3 {
    public static void main(String[] args) {

   //indexOf(Value): returns the index number of the first occured character as an int
        String str = "I like java programming John";
        int num1 = str.indexOf("j");
        System.out.println(num1);
        System.out.println("===============================================");

        String str2 = "Cybertek school is awesome";
        int num2 = str2.indexOf("s");
        System.out.println(num2);
        int firstS = str2.indexOf("s"); // 9
        int secondS= str2.indexOf("is")+1;
        System.out.println(firstS);
        System.out.println(secondS);


        int maxIndexnumber = "Cybertek".length() -1; //8-1 = 7
        System.out.println(maxIndexnumber);

        String names = "Muhtar";
               int num3    = names.indexOf("Good Guy");
        System.out.println(num3);

/*
replace(old Value, new Value): new value will be replaced with ALL the given old value, and returns new string
        replaceFirs(old Value, new Value): new value will be replaced with  the very first given old value, and returns new string
        indexOf(Value): returns the index number of the first occured character as an int
                        if the value is not exist in the String , it will return negative number

 */

String fullname ="Kuzzat Altay";
String firstName =fullname.substring(0, fullname.indexOf(" ")  ) ;
String lastname= fullname.substring(fullname.indexOf(" ") +1);
        System.out.println(firstName);
        System.out.println(lastname);
    }
}
