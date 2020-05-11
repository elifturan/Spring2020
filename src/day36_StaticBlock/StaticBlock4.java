package day36_StaticBlock;

import day34_CustomClass.Tester;

public class StaticBlock4 {

    static String name;
    static Tester tester1 = new Tester();
   // tester1.setTesterInfo("Elif",123,"SDET",110000);
    int insVariables;
    static {
        //gets executed as soon as the class is loaded
        // designed to initialize static variables
        name="Elif";
       tester1.setTesterInfo("Elif",123,"SDET",110000);
       tester1.setTesterInfo("Orhanoo",123,"SDET",110000);
//StaticBlock4 obj1 = new StaticBlock4();
  //     obj1.insVariables = 300;//Do NOT use static block for initializing instance variables

   }

    public static void main(String[] args) {
        System.out.println(name);// Elif
          System.out.println(tester1);
        StaticBlock4 obj2 = new StaticBlock4();
        System.out.println(obj2.insVariables);
    }



}
