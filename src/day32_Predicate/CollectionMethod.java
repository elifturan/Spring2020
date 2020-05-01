package day32_Predicate;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
       int max = Collections.max(list);
        System.out.println(max);
int min = Collections.min(list);
        System.out.println(min);



     ArrayList<Integer > numbers = new ArrayList<>(Arrays.asList(1,1,2,3,4,4));
     //second max num : 3
     // second min num: 2
     Integer maxNum=   Collections.max(numbers); //4
Integer minNum= Collections.min(numbers);//1
     numbers.removeAll(Arrays.asList(maxNum));
        System.out.println(numbers);

        numbers.removeAll((Arrays.asList(minNum)));
     int secondMax = Collections.max(numbers);
     int secondMin =Collections.min(numbers);
        System.out.println(secondMax);
        System.out.println(secondMin);

ArrayList <Integer>list2 = new ArrayList(Arrays.asList(1,1,2,3,4,5,6,7,8));
      Integer min2 =  Collections.min(list2);
       list2.removeAll(Arrays.asList(min2));
       int scndMin = Collections.min(numbers);
        System.out.println(scndMin);




    }
}
