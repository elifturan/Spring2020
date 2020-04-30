package day31_Bulk_Operation;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer>list =new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3));

        ArrayList<Integer>result =new ArrayList<>();
    for (Integer each : list){//each:1,
      if(!result.contains(each)){
          result.add(each);
      }

    }
        System.out.println(result);
        System.out.println("======================");

        Integer  [] arr1 ={1,1,2,2,3,3};

        ArrayList<Integer > nonDup = new ArrayList<>();
       for(int i =0; i<arr1.length;i++){
           if(!nonDup.contains(arr1[i])){
               nonDup.add(arr1[i]);
           }
       }
        System.out.println(nonDup);



    }
}
