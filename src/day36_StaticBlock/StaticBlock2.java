package day36_StaticBlock;

import OfficeHours.Practice_05_06_2020.Tester;

public class StaticBlock2 {
    static int a;
    static int b;
    int c;
    static Tester tester1 = new Tester();

    public static void main(String[] args) {
     //   tester1.setTesterInfo("Elif","SDET",120000,120000);
        System.out.println(tester1);
    }
    static{
        a=100;
        b=200;
       // c=300; // static only accepts static
        if(100>200){
            a=100;
        }else{
            b=200;
        }
        tester1.setTesterInfo("Elif","SDET",120000,120000);



    }



}
