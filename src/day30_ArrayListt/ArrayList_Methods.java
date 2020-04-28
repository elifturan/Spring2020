package day30_ArrayListt;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(7);
        list1.add(8);
        list1.add(1,6);
//1
        // {5,6, 7,8}

        //   list1.add( 7, 10);  // index out of bound

        list1.set(3, 9);
        System.out.println(list1);

        int[] arr = {1, 2, 3, 4}; // {1,2,3,4,5}
        arr[3] = 5;   // {1,2,3,4,5}

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A"); // {A}
        list2.add("B");  //{A, B}
        list2.add(1, "C"); // {A, C, B}
        list2.add(1, "D");  // {A, D, C, B}

        list2.set(3, "F"); // {A, D, C, F}

        list2.set(2,  "E"); // {A, D, E, F}

        System.out.println(list2);   // {A, D, E, F}


        System.out.println("===============================================");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1); // 0
        list3.add(2); // 1
        list3.add(3); // 2
        list3.add(4); //3

      //  list3.remove(1);

     /*   int a1 =1 ;
        list3.remove(a1);

      */


       Integer a =1;
       list3.remove(a);

        System.out.println(list3);


ArrayList<Integer> list4 = new ArrayList<>();
         list4.add(10);
        list4.add(20);
        list4.add(30);

      //  list4.remove(20); // out of bound


        //  list4.remove(1);  //{10, 30}

        Integer a2 = 100;
        boolean r1 = list4.remove(a2);  // false

        System.out.println(list4);
        System.out.println(r1);

    }
}
