package day24_Methods;

import java.util.Arrays;

public class ReturnMethod_Descending {
    public static void main(String[] args) {
int [] arr1 ={1,10,9,8,14,15};
int [] arr2 ={200,100,150,500,400};
int [] arr3={1000, 800, 5000, 3000 };
//sortDescending(arr1);
arr1 =sortDescending(arr1);
arr2 = sortDescending(arr2);
arr3= sortDescending(arr3);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

      //  System.out.println(arr1[0]);
    }
    public static int[] sortDescending(int[]arr){
        Arrays.sort(arr);
        int[]RevArr = new int[arr.length];

        int j = arr.length-1;
        for(int i= 0; i< arr.length;i++){
            RevArr[i]=arr[j];
            j--;
        }
        System.out.println(Arrays.toString(RevArr));
        return RevArr;
    }


}
