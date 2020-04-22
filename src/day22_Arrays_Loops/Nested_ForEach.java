package day22_Arrays_Loops;

import java.util.Arrays;

public class Nested_ForEach {
    public static void main(String[] args) {
      int [] arr ={1,2,3,4,5};
                 //0 1 2 3 4

      for(int each : arr){
          System.out.println(each);
      }
        System.out.println("==================================");
        int [][] arr2D = {  {1,2,3} ,{4,5,6} };
                       //     0          1
        for (int[] each2D :arr2D){
           for( int eachElement : each2D){
               System.out.println(eachElement);
           }
        }

        System.out.println("==============================");

char[][] ch2D ={ {'A','B'},{'C','D','E'}, {'F','J','H'} };

for (char [] each1D : ch2D){
  for ( char eachelement: each1D){
      System.out.println(eachelement);
  }
}










    }
}
