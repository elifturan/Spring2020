package day22_Arrays_Loops;

import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {
// 2. write a program that sort the array in descending order
        //1. sort the array in ascending
        //2. reverse the array that's sorted in ascending ordesr --> descending orders

        int [] arr = {10,78,2,-1,500,70};
        Arrays.sort(arr);// sorts in ascending orders

     //   System.out.println(Arrays.toString(arr)); ascending orders
        int [] RevArr = new int [arr.length];

        int j =arr.length-1; //4
        for(int i = 0; i <arr.length;i++){
            RevArr[i]= arr[j];
            j--;

        }
        System.out.println(Arrays.toString(RevArr));












    }
}
