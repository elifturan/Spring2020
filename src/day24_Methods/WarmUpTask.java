package day24_Methods;

import java.util.Arrays;

public class WarmUpTask {
    /*
     //create a function that can print the max number from any given number
    //create a function that can print the min number from any given number
    //create a function that can print out the array in descending order[1,2,3]==>[3,2,1]
     */
    public static void main(String[] args) {
        int[]arr={10,8,9,5,4,3,2,1};
maxNum(arr);
minNum(arr);
int []arr2 = {100,20,30,40,40,-100};
maxNum(arr2);
minNum(arr2);

  descending(arr);
  descending(arr2);
    }

    public static void maxNum (int[]array){
        Arrays.sort(array);//ascending order
        System.out.println(array[array.length -1]);

    }
public static void minNum(int[]array){
        Arrays.sort(array);
    System.out.println(array[0]);
}
public static void descending(int[]array){
        Arrays.sort(array);

        for(int i= array.length-1; i>=0;i--){
            System.out.print(array[i]+" ");
        }
    System.out.println();
}




}
