package day31_Bulk_Operation;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll_Bulk {
    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1));
        //remove 1,3,5,8

        Integer a =1 ;
        list.remove(a);
        list.remove(a);
        System.out.println(list);
  //list.removeAll(Arrays.asList(1,3,5,8));
 Integer [] arr= {1,3,5,8}  ;
        list.removeAll(Arrays.asList(arr));
 System.out.println(list);

        System.out.println("================================");

     String [] names ={"Ahmed","John","Aaron","Ahmed","Daniel"};
     // remove all names Ahmed
     ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
      nameList.removeAll(Arrays.asList("Ahmed"));
        System.out.println(nameList);// removed all Ahmed













    }
}
