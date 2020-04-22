package day05_Unary_ShorthandOperators;

import com.sun.media.jfxmediaimpl.HostUtils;

import java.sql.SQLOutput;

public class PrimitiveCastings {

    public static void main(String[] args) {

        // implicit casting : done automatically


        int a = 10;
        long b = a;// implicit casting is done autamatically
        // b = 10L;
        // int c = b; // b is still long dataType thats why wrong
        int a1 = 100;
        long b1 = (long) a1; // manually doing the implicit casting
        // int c1 = b1;
        System.out.println("=====================================");
        // Explicit Casting: Larger primitives to smaller size

        int Inum = 100;
        byte Bnum = (byte) Inum;

        short Snum = (short) Inum;

        double Dnum = 5.5;
        float Fnum = (float) Dnum;// we can use float,long, int,short,byte = 5.5
        // float Fnum = (int)Dnum; // 5.0

        System.out.println(Fnum);

        double D1 = 10.5;
        // long L1= (float)D1 !! compile error
        // long L1 = (long) ( (float)D1); you can use
        // long L1 = (float)D1; !! comple error

        long L1 = (int) D1;
        System.out.println(L1); //10

        float F1 = 60.5f;
        int I1 = (int) F1; //preferred
        System.out.println(I1);//60

        long largerNum = 99999999999L;

        int intNum = (int) largerNum;
        System.out.println(intNum);// it gives different number because 9999999 is out of int' range

        char ch1 = 'a';
        short sh1 = (short) ch1;
        System.out.println(sh1);// you can get number 97 is corresponding number for a

        char ch2 = 23456;
        double dbl1 = ch2;
        System.out.println(dbl1); //23456.0

        int z1 = 10;
        double tb1 = z1; //10
        short y1 = (short) z1;


        float f1 = (long) a1;
        long l1 = (long)f1;
        System.out.println(l1);

        String name;
        // System.out.println(name);// local variables cannot be used without initilazing
       // name = "Cybertek"; // in java : first come first serve
        





    }
}
