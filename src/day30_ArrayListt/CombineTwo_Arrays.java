package day30_ArrayListt;

import java.util.ArrayList;

public class CombineTwo_Arrays {
    public static void main(String[] args) {
        /*
       write a program that can combine two String arrays into one arrayList
    		ex:
    			arr1 = {"A", "B", "C"};
    			arr2 = {"D", "E", "F", "G"};
    			list ==> {"A", "B", "C", "D", "E", "F", "G"}
         */
     String []    arr1 ={"A","B","C"};
     String[] arr2 ={"D","E","F","G"};

        ArrayList<String > list = new ArrayList<>();// {"A", "B", "C", "D", "E", "F", "G"}

        for (int i = 0; i < arr1.length; i++) {
         String eachElement =   arr1[i];
         list.add(eachElement);
        }
     //   System.out.println(list);

        for(String each : arr2){
            list.add(each);
        }







    }
}
