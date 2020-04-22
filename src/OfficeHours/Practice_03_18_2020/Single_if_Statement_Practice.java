package OfficeHours.Practice_03_18_2020;

public class Single_if_Statement_Practice {
    public static void main(String[] args) {

        /* Single if Statement:
        if (condition){
            System.out.println(condition)
        } */


    int a =100 ;
    int b = 200;
    boolean aGreater = a >b ;
    boolean bGreater = b>a;
    //boolean aEqualb = a == b;
        //boolean aEqualB= aGreater == false && bGreater ==false;
        //               if a is not greater than and b is not greater than a , that means == b

       // boolean aEqualB = aGreater == bGreater;
        //               if is

    if (aGreater){
        System.out.println(a+ " is greater number");
    }
    if (bGreater){
        System.out.println(b+ " is greater number");
    }


        System.out.println(a+ " is equal to "+b);




    }
}
