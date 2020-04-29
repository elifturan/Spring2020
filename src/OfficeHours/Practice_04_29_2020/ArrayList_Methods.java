package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {

/*
Array List: does not support primitive
size is dynamic , size is auto adjusted
ArrayList has index number
add(), get(), set(), remove(), clear(), indexOf(),lastIndexOf(),
 */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);//{10,20}
        list.add(1,30);//adds the element at the given index



        System.out.println(list);
        System.out.println(list.size());

        int num1 = list.get(2);
        System.out.println(num1);
     //[10,20,30]
     // 0 , 1 ,2
     Byte a2 =100;
     int b2 =a2;//unboxing

        System.out.println("===================================");
ArrayList<String> list2 = new ArrayList<>();
      list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");

        list2.add(2,"E"); // A,B,E,C,D
        System.out.println(list2);
        for (int i = 0; i <=list2.size()-1 ; i++) {
            String str = list2.get(i);
            System.out.println(str);
        }

        System.out.println("==============");
        for (String each:list2) {
            System.out.println(each);//each element
        }
// list2 :{A,B,E,C,D} replace C with F

list2.set(3,"F");
        System.out.println(list2);


//list2.remove(3);//{A,B,E,D} index
    boolean r1 =    list2.remove("A");// {B,E,D} object
        System.out.println(r1);

boolean r2 =list2.remove("Z");
        System.out.println(r2);// it returns false
             list2.clear();
        System.out.println(list2.size());
        System.out.println(list2);

    }
}
