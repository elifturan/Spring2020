package day29_Wrapper_ArrayList;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Parse_Methods {
    public static void main(String[] args) {
        String str ="123";
      int a1 =  Integer.parseInt(str);//123

        System.out.println(str);//text
        System.out.println(a1);//number

        System.out.println(str+1);
          //              "123"+1 = 1231 = concetenation
        System.out.println(a1+1);
//                        123+1 =124 = addition

           byte b1=  Byte.parseByte(str); //
        System.out.println(b1+5);

       Integer I1 =(int) Byte.parseByte(str);//Autoboxing

    String str2 = "10.5";

    float f1=   Float.parseFloat(str2);

        System.out.println(f1+1);

  double d2=  Double.parseDouble(str2);
        System.out.println(d2+2);


        String str3 ="2147483647";
    long l1 = Long.parseLong(str3);//long
        System.out.println(l1+2);


        Long num2 = Long.parseLong(str3); //autoboxing
        System.out.println(num2+2);

     String result1 ="true";
    boolean a =true;
  boolean bo1 = Boolean.parseBoolean(result1);
        System.out.println(bo1);

        String result2 ="Today is Monday";// not true or not false ==>always returns false
       boolean aa =true;
        boolean bo2 = Boolean.parseBoolean(result2);
        System.out.println(bo2);//It returns false !

        String result3 ="fAlsE"; //"false "
        boolean r2 = Boolean.parseBoolean(result3);
        System.out.println(r2);// false


    }
}
