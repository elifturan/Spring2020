package day13_StringClass;

public class String_Literals {
    public static void main(String[] args) {

        String str1="Cat";// String pool not independent object
        String str2 = new String("Cat");// Java Heap independent object

        System.out.println(str1+" : "+str2);

        System.out.println(str1 == str2);
         String str3 = "Cat"; //String pool not independent object
        System.out.println(str1 == str3);

        String str4 = new String("Cat");// independent object
        System.out.println(str2 == str4);

        String s1 = "Java"; // String pool, immutable we cannot modify it
        s1 = "JavaScript";// new object will be created in memory

        System.out.println(s1);//JavaScript

        String s2 = "Java";// no new object will be created int he memory
        System.out.println(s1==s2);
//                "JavaScript"== "Java"





    }
}
