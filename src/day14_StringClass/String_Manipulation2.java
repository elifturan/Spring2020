package day14_StringClass;

public class String_Manipulation2 {
    public static void main(String[] args) {

String str = "";
      boolean a1 = str.isEmpty(); //true--"";  " " --> false

        System.out.println(a1);

String username ="";
if (username.isEmpty()){
    System.out.println("Please provide the user name first");
}
String s1 = "Cat"; //String literal
String s2 = new String("Cat");

        System.out.println(s1== s2);// different memory

        System.out.println(        s1.equals(s2) );    //true

String z1 = "Tiger";

String z2 = new String("Tiger");

String z3 ="Tiger";

        System.out.println(z1 == z2);//false
        System.out.println(z2== z3);//false
        System.out.println(z1==z3);//true
         System.out.println(z1.equals(z2));
        System.out.println(z2.equals(z3));
        System.out.println( z1.equals(z3));










    }
}
