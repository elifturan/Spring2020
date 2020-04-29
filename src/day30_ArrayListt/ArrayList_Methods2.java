package day30_ArrayListt;

import java.util.ArrayList;

public class ArrayList_Methods2 {
    public static void main(String[] args) {

        ArrayList<String > list = new ArrayList<>();
        list.add("A");//0
        list.add("B");//1
        list.add("C");//2

        String str ="Z";
        String str2="A";
        //list.remove(str);
        System.out.println(list);
boolean r1 = list.remove(str);
boolean r2 =list.remove(str2);

        System.out.println(r1);
        System.out.println(r2);

        list.clear();// []
        System.out.println(list);

    ArrayList<Integer > list2 = new ArrayList<>();
    list2.add(1);//0
    list2.add(1);//1
    list2.add(2);//2
    list2.add(3);//3

   int num1=  list2.indexOf(1);
         //Integer = int // Autoboxing
        System.out.println(num1);

 int num2 =  list.indexOf(100); // if it returns negative number its not exist

        System.out.println(num2);


    }
}
