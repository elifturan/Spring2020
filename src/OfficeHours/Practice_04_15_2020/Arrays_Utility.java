package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class Arrays_Utility {
    public static void main(String[] args) {
        /* ARRAYS UTILITIES
        Arrays.sort(): sorts the array in Ascending order
        Arrays.equals(arr1,arr2): arr1 == arr2
        Arrays.toString(): converts single dimentioanal array to string
        Arrays.deeptoString():converts multi dimentional array to string

         */
       int[] arr = {9, 10 , 8, 65, 8, 6, 5} ;

        Arrays.sort(arr); // in ascending orders
        System.out.println(Arrays.toString(arr));

        int[] salaries = {100000, 20000, 30 , 5000 , 432 , 123123 ,2000000 };
        int length = salaries.length;
        int lastIndex = length -1;
        Arrays.sort(salaries);
        System.out.println(Arrays.toString(salaries));
        System.out.println("Minimum salary: "+ salaries[0]);
        System.out.println("Maximum salary: "+ salaries[lastIndex]);

        System.out.println("=================================");

      int[] arr1 ={1,2,3};
      int[] arr2 ={2,1,3};
      Arrays.sort(arr1);//{1,2,3}
      Arrays.sort(arr2);//{1,2,3}

        System.out.println(Arrays.equals(arr1,arr2));



    }
}
