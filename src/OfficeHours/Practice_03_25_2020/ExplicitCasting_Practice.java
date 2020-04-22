package OfficeHours.Practice_03_25_2020;

import com.sun.media.jfxmediaimpl.HostUtils;

public class ExplicitCasting_Practice {
    public static void main(String[] args) {

//implicit casting: done automatically /  smaller primitive types can be always assigned to larger primitives types

        byte bnum = 100;
        short snum = bnum;//implicit casting

//explicit casting:Must be done manually / larger primitives types can be always assigned to


        int iNum = 200;
        short sNum= (short)iNum;// explicit casting

        float fNum= 0.5f;

        System.out.println(fNum);
        float fNum2 = (long)0.5;
        System.out.println(fNum2);

        // long, int , short , byte ==> only accepts whole numbers

        long lNum1= (long) 4.5;
        System.out.println(lNum1);

        System.out.println(9/2);//4
        System.out.println(9/(float)2);//4.5

        System.out.println(10.0/ 3);












    }
}
