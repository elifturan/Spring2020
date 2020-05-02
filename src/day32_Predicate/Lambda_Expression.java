package day32_Predicate;

import OfficeHours.Practice_04_29_2020.ArraysList_Methods2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expression {
    public static void main(String[] args) {
        Predicate<Integer> oddNumber = x -> x %2 !=0;


        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.removeIf(oddNumber);
        System.out.println(list);
        System.out.println("==================================");

     Predicate<Integer> lessThan5 = Y -> Y <5 ;
     ArrayList<Integer> list2 = new ArrayList<>();
     list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
     list2.removeIf(lessThan5);
        System.out.println(list2);
        System.out.println("=============================");


        Predicate<String>startwithE = s -> s.startsWith("E");
      ArrayList<String> names =new ArrayList<>();
      names.addAll(Arrays.asList("Elif","Hatice","Sefer","Ersin","Dursun","Orhan"));
        System.out.println(names);
        names.removeIf(startwithE);
        System.out.println(names);
        System.out.println("==============================");

        Predicate<String> startwithMorA= each -> each.startsWith("M")||each.startsWith("A");
        ArrayList<String> nameList =new ArrayList<>();
        nameList.addAll(Arrays.asList("Aydin","Huriye","Humeyra","Sevdenur","Zeynep","Ahmed"));

        System.out.println(nameList);

        nameList.removeIf(startwithMorA);

        System.out.println(nameList);
        System.out.println("==========================");

                                        //      c>= 48 && c <=57
        Predicate<Character> removedigits =c ->Character.isDigit(c);
ArrayList<Character> chars = new ArrayList<>(Arrays.asList('A','B','3','4','5','@','&','Z'));
chars.removeIf(removedigits);
        System.out.println(chars);



ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
nums.removeIf(p -> p>5);//easy way of predicate
        System.out.println(nums);

    }
}
