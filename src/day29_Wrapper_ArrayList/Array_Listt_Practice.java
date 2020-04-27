package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class Array_Listt_Practice {
    public static void main(String[] args) {
        ArrayList <String> shoppingList= new ArrayList<>();
        shoppingList.add(" milk ");//size 1
        shoppingList.add(" Coffee ");//size 2
        shoppingList.add(" Bread ");// size 3
        shoppingList.add("Toilet Paper"); // size 4

        System.out.println(shoppingList);
        for(int i =0; i<shoppingList.size(); i++){ //.size() like length method
            System.out.println(shoppingList.get(i));
        }
        System.out.println("=============================");
        for (String each : shoppingList) {
            System.out.println(each);
        }


   /*     System.out.println(shoppingList.get(0));
        System.out.println(shoppingList.get(1));
        System.out.println(shoppingList.get(2));
        System.out.println(shoppingList.get(3));

    */
// size(): it returns max length

       int a1 =  shoppingList.size();

        System.out.println(a1);//4


    }
}
