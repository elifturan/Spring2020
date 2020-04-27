package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class Array_List_Intro {
    public static void main(String[] args) {

        ArrayList <Integer> scores = new ArrayList<Integer>(); //size: 0
//                                          add five elements , size:5
            //                             remove two elements, size:3

                  scores.add(10); //Autoboxing size : 1
                  scores.add(20); //Autoboxing size : 2
                  scores.add(30);//Autoboxing size : 3
        System.out.println(scores);

            Integer a1   =   scores.get(2);// wrapper class to wrapper class none auto unbox
                 int a2 = scores.get(2);// wrapper class to the primitive unboxing
                double a3=scores.get(2);// wrapper class to the primitive unboxing

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);//30.0 coz of double primitive!

    //    System.out.println(scores.get(100)); // out of bound!






    }
}
