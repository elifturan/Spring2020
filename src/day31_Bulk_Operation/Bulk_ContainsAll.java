package day31_Bulk_Operation;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_ContainsAll {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        //if 10,20,60 if all objects are exists in arrayList ==> true
        // otherwise ==> false
   /*     boolean r1 = list1.contains(10);
        boolean r2 = list1.contains(20);
        boolean r3 = list1.contains(60);

        boolean result = r1 == true && r2 == true && r3 == true;
        System.out.println(result);

    */

        boolean b1 =  list1.containsAll(Arrays.asList(10,20,60));//false
        System.out.println(b1);
        boolean b2 =  list1.containsAll(Arrays.asList(10,20,30,40));//true
        System.out.println(b2);                       //collection type

Integer [] data ={10,30,40};

     boolean b3 =   list1.containsAll(Arrays.asList(data));
        System.out.println(b3);









    }
}
