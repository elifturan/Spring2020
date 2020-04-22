package day21_MultiDimensional_Arrays;

public class Avarage_Number {
    public static void main(String[] args) {
        int [] arr ={10,20,30,40,50};
        //avarage : sum of all numbers / length
       int length = arr.length; // total number of the elements
       int sum = 0;

       for(int i = 0; i<length;i++){
         int eachnum = arr[i];
         sum +=eachnum;
       }


        System.out.println(sum);
       double avarage = sum/(double)length;
       // System.out.println(sum/length);
        System.out.println(avarage);

        System.out.println("===================================");
    /*    int[] arr2 ={1,2,3};
        System.out.println(5/3);
        System.out.println(5/(double)3);
 */


















    }



}
