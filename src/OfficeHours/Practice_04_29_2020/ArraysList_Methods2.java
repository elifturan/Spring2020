package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList_Methods2 {
    public static void main(String[] args) {
        // indexOf(Object) == returns the index num
        ArrayList<Character> list = new ArrayList<>();
        list.add('A');//0
        list.add('B');//1
        list.add('C');//2
        list.add('D');//3
        list.add('E');//4
        list.add('C');//5
        int num1 = list.indexOf('C');//2 -- first index of matching number
        int num2 = list.lastIndexOf('C');//5-- last index of matching number
        System.out.println(num1);// index num is 2 cos is indexOf num
        System.out.println(num2);// index number is 5 coz lastindexOf num

        System.out.println(list);
        list.remove(list.lastIndexOf('C'));
        System.out.println(list);
        System.out.println("============================");
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10, 11, 12, 13};

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int each : arr1) {//each element of arr1
            list1.add(each);

        }
        for (int each : arr2) {
            list1.add(each);
        }

        System.out.println(list1);


    }
}
