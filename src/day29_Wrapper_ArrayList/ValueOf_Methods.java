package day29_Wrapper_ArrayList;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;

public class ValueOf_Methods {
    public static void main(String[] args) {

        String str = "123";
        Integer a =Integer.valueOf(str);//Integer , 123

        System.out.println(a);

        double b= Integer.valueOf(str);//unboxing
        // double =Integer
        System.out.println(b);

    String str1 = "15.5";
   double d1 = Double.parseDouble(str1);//15.5
   // double = double //none
        System.out.println(d1);

        double d2 =Double.valueOf(str1); //15.5
        //    double = Double // unboxing
        System.out.println(d2);

        System.out.println(d1 == d2);

        System.out.println("===================================");

        Short sh1 = 3000;
        int z2 =sh1;

        System.out.println("====================");
    String r1 = "true";// "Today is Monday" it returns false !
     Boolean t1 =   Boolean.valueOf(r1);
             // Boolean = Boolean // none

  boolean t2 = Boolean.valueOf(r1); //Boolean; true
   //boolean = Boolean = unboxing


        System.out.println(t1);
        System.out.println(t2);

int maxNum = Integer.MAX_VALUE;
        System.out.println(maxNum);

    double maxNum2 =Double.MAX_VALUE;
        System.out.println(maxNum2);


     int minNum = Integer.MIN_VALUE;
        System.out.println(minNum);

byte Maxnum = Byte.MAX_VALUE;
        System.out.println(Maxnum);
        byte MinNum=Byte.MIN_VALUE;
        System.out.println(MinNum);

        System.out.println("=============================");
        boolean[]arr = new boolean[3];
        System.out.println(Arrays.toString(arr));
        Integer[] arr2 = new Integer[3];
        System.out.println(Arrays.toString(arr2));





    }
}
