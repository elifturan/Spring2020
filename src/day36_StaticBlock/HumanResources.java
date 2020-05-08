package day36_StaticBlock;

import OfficeHours.Practice_05_06_2020.Developer;

public class HumanResources {

  static   Developer dev1 = new Developer();
 // dev1.setDevInfo("Orhan","Developer",250000,1234); you must use inside static block
   static Developer dev2 = new Developer();
  static   Developer dev3 = new Developer();
  static   Developer dev4 = new Developer();
   static Developer dev5 = new Developer();
   /*
    public static void main(String[] args) {
        dev1.setDevInfo("Orhan","Developer",250000,1234);
         }
    */

   static{
       dev1.setDevInfo("Orhan","Developer",250000,1234);
   }




}

