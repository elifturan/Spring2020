package day38_Consructors;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {
        Item item1 = new Item("Cherry",2,4.99);
        Item item2 = new Item("Milk",2,2.50);
        Item item3 = new Item("Icecream",1,5.99);
        Item item4 = new Item("Pineapple",1,3.50);
        Item item5 = new Item("Peanut",5,3.75);

        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
        System.out.println(item4);
        System.out.println(item5);

        ArrayList<Item> shoppingList=new ArrayList<>();
        shoppingList.addAll(Arrays.asList(item1,item2,item3,item4,item5));//Arrays.asList is the collection type

        double totalCost =0;
        for(Item each: shoppingList){
            totalCost+=each.calcCost();
        }
     /*   for (int i = 0; i <shoppingList.size() ; i++) {
          totalCost +=  shoppingList.get(i).calcCost();

        }

      */
        System.out.println("Total price of all items purchased: $"+totalCost);




    }
}
