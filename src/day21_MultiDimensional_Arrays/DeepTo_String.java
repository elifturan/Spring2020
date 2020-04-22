package day21_MultiDimensional_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DeepTo_String {
    public static void main(String[] args) {
 int [] arr1D = {1,2,3};
        System.out.println(Arrays.toString(arr1D));
int [][] arr2D = { {1,2,3},{4,5,6,7}};
        System.out.println(Arrays.toString(arr2D));
        System.out.println(Arrays.deepToString(arr2D));

int [][][] arr3D = { {  {1,2,3},{4,5,6,7}  }   , {  {7,8,9}  , {10,11,12}  } };
                          //   0                            1

        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(Arrays.toString(arr3D[0][1]));



    }
}
