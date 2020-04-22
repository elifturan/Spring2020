package day22_Arrays_Loops;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Multi_Arrays {
    public static void main(String[] args) {
        int [] arr ={1,2,3};
                  // 0,1,2
  //n dimensional array contains (n-1) dimensional arrays
        int [][] arr2D = {  {1,2,3} , {4,5,6}  };
                            // 0

       int[] arr1D = arr2D[0];        //{1,2,3}
        System.out.println(Arrays.toString(arr1D));
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(arr2D[0][2]);//3

       // System.out.println(Arrays.toString(arr2D));// you must convert to Arrays.toString method!
        System.out.println(Arrays.toString(arr2D[1]));

for(int eachElement : arr2D[0]){
    System.out.println(eachElement);
}
for ( int i = 0; i< arr2D[0].length;i++){
    int num = arr2D[0][i];
    System.out.println(num);
}



    }
}
