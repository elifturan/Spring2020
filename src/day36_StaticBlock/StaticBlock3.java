package day36_StaticBlock;

import day34_CustomClass.Tester;

public class StaticBlock3 {
    static String name;
    static int num;
static Tester tester1 = new Tester();
//tester1.setInfo(); you must do it in static block
    static {
        name ="Muhtar";
        num=100;
        tester1 = new Tester();
        tester1.setTesterInfo("Elif",1234,"SDET",90000);
    }


  /*  public static void main(String[] args) {
        name ="Muhtar";
        num=200;
        System.out.println(name);
        System.out.println(num);
    }

   */
}
