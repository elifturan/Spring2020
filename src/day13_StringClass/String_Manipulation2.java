package day13_StringClass;

public class String_Manipulation2 {
    public static void main(String[] args) {
/*
String manipulations:

        charAt(indexNumber): it returns the char at the given index
        length(): returns the total number of characters as int
                length is ALWAYS one unit above the maximum index number
                    maxIndex: length()-1;
        concat(Value): Concatenation , concats the given value to the String and returns a new value
        toLowerCase(): converts to lowercase and returns a new String
        toUpperCase(): converts to uppercase and returns a new String
        trim(): removes the unused spaces , and returns new String
                only if there is any space that's not seperating the words, will be removed
        substring(beginning index, ending index): creates substring of the string value from the beginning index till the ending iondex (ending index is EXCLUDED)
        substring(beginning index): creates substring of the string value from the beginning index till the end

 */
   String str = "Cybertek School is the best";
          //str.substring();// creates substring of the string value from

        String schoolName = str.substring(0,27);
        System.out.println(schoolName);

        String fullName = "Kuzzat Altay";
        //                 012345

String firstNAme = fullName.substring(0,7);
String lastName =   fullName.substring(7,12);
        System.out.println(fullName);

        //full nam = firstname lastname
        // gmail: lastName_firstname@gmail.com

        String Orhan ="Orhan Turan";

        String firstname=Orhan.substring(0,5);
        String lastname = Orhan.substring(6,10+1);
        String gmail = lastname.concat("_").concat(firstname).toLowerCase().concat("@gmail.com");
//String gmail = lastname+ "_"+firstname + "@gmail.com";
        System.out.println(gmail);


String s1 = "I love Java Programming Language";
String className = s1.substring(7);
        System.out.println(className);


        String s2 = "I like C# Programming ";
        s2= s2.replace("C#","Java");
        System.out.println(s2);

        String name = "COVID 18";
        name=name.replace("8","9");
        System.out.println(name);

        String r1 = "I like C#, C# is fun, C# is cool";
        r1= r1.replaceFirst("C#","Java");//replacefirst just one
        String r2 = "I like C#, C# is fun, C# is cool";
        r2 = r2.replace("C#","Java");//Replace all of them
        System.out.println(r1);
        System.out.println(r2);

String r3 = "Tomorrow is Monday, Tomorrow is Tuesday";
r3= r3.replaceFirst("tomorrow","Today");
        System.out.println(r3);





    }
}
