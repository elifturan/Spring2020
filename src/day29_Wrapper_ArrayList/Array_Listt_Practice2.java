package day29_Wrapper_ArrayList;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Array_Listt_Practice2 {
    public static void main(String[] args) {
/*
1.create a list of Integers
2.add 5 Integers to it
3.return the maximum number from the list
 */
        ArrayList<Integer>List = new ArrayList<>();
        List.add(100);
        List.add(20);
        List.add(300);
        List.add(400);
        List.add(50);
        List.add(700);
        List.add(800);

        System.out.println(List.size());//5
        System.out.println("======================");
      //  int max =List.get(0);
      int max =Integer.MIN_VALUE;
        for (int i =0; i< List.size();i++) {
          if(List.get(i)>max)  {
              max= List.get(i);
          }
        }
        System.out.println(max);


        int max2 = Integer.MIN_VALUE;
        for(Integer each : List){
            if(each>max2){
                max2 = each;
            }
        }
        System.out.println(max2);
        System.out.println("=========================================");
ArrayList <Integer > list2=new ArrayList<>();
list2.add(150);
list2.add(300);
list2.add(450);
       int maximum =      max(list2);
        System.out.println(maximum);


    }
    public static int max(ArrayList<Integer>List){
        int max =Integer.MIN_VALUE;
        for (int i =0; i< List.size();i++) {
            if(List.get(i)>max)  {
                max= List.get(i);
            }
        }
        return max;
    }


}
