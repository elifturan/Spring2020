package day32_Predicate;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Arrays;

public class Move_Zero {
    public static void main(String[] args) {

/*
Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declear  any extra lists

 */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0,0,0,0));
        System.out.println(list);

        int count =0;
for(Integer each : list){
    if(each==0){
        count++;
    }
}
        System.out.println(count);
list.removeAll(Arrays.asList(0));
        System.out.println(list);



for (int i =0; i<count;i++) {
    list.add(0);

}

        System.out.println(list);
        System.out.println("=========================================");




    }
}
