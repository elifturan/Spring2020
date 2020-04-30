package day31_Bulk_Operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<String>list1= new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");

     boolean r1 =   list1.contains("Z");//it doesn't contains Z so it returns false
        boolean r2 =   list1.contains("C");// it contains C so it returns true





        System.out.println(r1);
        ArrayList<String>list2= new ArrayList<>();
        list1.add("A");
        list1.add("C");
        list1.add("B");
        list1.add("D");



        Collections.sort(list1);//{A,B,C,D}
        Collections.sort(list2);//{A,B,C,D}

        boolean b1 = list1.equals(list2);
        System.out.println(b1);//false











        //Arrays.equal(arr1,arr2)== Array equals method other ArrayList method!
        System.out.println("================================");

        int [] arr1 ={1,2,3};
        int [] arr2 ={3,2,1};
        Arrays.sort(arr1);
        Arrays.sort(arr2);//{1,2,3}
        boolean b2 = Arrays.equals(arr1,arr2);
        System.out.println(b2);

        System.out.println("==================================");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(100);
        list3.add(1000);
        list3.add(20);
        // expected : 1000 100 20 10

        Collections.sort(list3);
        System.out.println(list3);
ArrayList<Integer> reversedList3 =new ArrayList<>();

        for (int i = list3.size()-1; i >= 0 ; i--) {
           // System.out.print(list3.get(i)+" ");

            reversedList3.add(list3.get(i));
        }
        System.out.println(reversedList3);
        list3 = reversedList3;
        System.out.println(list3);




    }
}
