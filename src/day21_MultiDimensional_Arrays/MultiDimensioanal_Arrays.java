package day21_MultiDimensional_Arrays;

import java.util.Arrays;

public class MultiDimensioanal_Arrays {
    public static void main(String[] args) {
        int [] arr={1,2,3};

        int [] [] arr2D = { {1,2,3},{4,5,6} };
                          // 0     , 1       =2
        System.out.println(arr2D.length);

        int [] arr1D =    arr2D[0];
        System.out.println(Arrays.toString(arr2D[0]));
      // int num1=  arr2D[1] [3];
      //  System.out.println(num1);

       char [] [] ch2D = {   {'E','L'},{'i','F'} , {'O','R','H','A','N'} };
       char ch1 = ch2D[1] [0];

       //char ch1 = ch2D [0][1];
        System.out.println(ch1);
 char [] ch2 = ch2D[2];
        System.out.println(Arrays.toString(ch2));






    }
}
