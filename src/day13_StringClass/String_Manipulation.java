package day13_StringClass;

public class String_Manipulation {
    public static void main(String[] args) {

        String str = "Cybertek";
        //index=      01234567
        //charAt(); method √
        char ch1 =    str.charAt(5);
        System.out.println(ch1== 't');//true
        System.out.println(ch1== 'C');//false

        //length(); method √
        int totalLength = str.length(); // uzunluk 01234567 = 8 numbers
        System.out.println(totalLength);
        System.out.println(totalLength > 250);// false
        System.out.println(totalLength >7); // false


        String str2 = "Today is great day, Java is Fun";
                    // 01234.....
        int maxIndexNum = str2.length() -1;
        System.out.println(maxIndexNum);


        /*
        Topics: String class
        String Manipulations
package name: day13_StringClass
class: numberToWords
warmup tasks:
        1. Wash your hands
        2. write a java program that can convert any given numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
            MUST use Scanner and switch statement
        3. write a program for the shipping info that, the program should ask:
                    building number
                    Street address (Assume it has more than one word)
                    city name
                    state name
                    zip code
                    full name of the person:
            and prints the ship to info in the following format:
            ex output:
                    Ship To:  Jimmy joe
                              7925 Jones Branch Dr
                              MCLean, VA 22102
String Class:
        1. Object,  there are two ways we can create string object
                1. String literals:
                        String str1 = "Muhtar";
                2. new keyword:
                        String str2 = new String("Cybertek");
            String pool: special memory location for all String literal objects
            Java Heap: memory location in java that where all objects will be saved at
        2. String is IMMUTABLE:
                once the object is created, cannot change it
        3. String represents the sequences of characters

         */

          String s1 = "Cybertek";
             s1 =    s1.concat(" School"); //"Cybertek School"
        System.out.println(s1);

        String s2 = "Java ";
        System.out.println(s2.concat("is a programming language"));//Java is a programming language
        System.out.println(s2);//Java
        s2 = s2.concat("is a programming language");
        System.out.println(s2);//Java is a programming language

String r1 = "Java is fun";
      r1 = r1.concat(", and it's esay");
        System.out.println(r1);


     String name1 = "CYBERTEK";
       name1 = name1.toLowerCase();
        System.out.println(name1);

        String name2 = "cybertek";
        name2= name2.toUpperCase();
        System.out.println(name2);

String A1 = "              Today is a great day";
       A1= A1.trim();//trim is used for trim the spaces. Removes the unused spaces , and returns new String
        System.out.println(A1);









    }
}
