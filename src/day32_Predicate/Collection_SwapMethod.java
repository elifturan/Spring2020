package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collection_SwapMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        //              index num 0,1,2,3,4
        System.out.println(list);
       Collections.swap(list,0,4);
        System.out.println(list);







    }
}
