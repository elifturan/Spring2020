package day31_Bulk_Operation;

import java.util.ArrayList;
import java.util.Arrays;

public class AddAll_Bulk {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        // add 30,20,40,50,45,35,200

    /*    list1.add(30);
        list1.add(20);
        list1.add(40);
        list1.add(50);
        list1.add(45);
        list1.add(35);
        list1.add(200);
        System.out.println(list1);

     */

        // list1.addAll(Arrays.asList(30,20,40,50,45,35,200));
        Integer[] arr1 = {30, 20, 40, 50, 45, 35, 200};
        list1.addAll(Arrays.asList(arr1));
        System.out.println(list1);

        System.out.println("=================================");

        String[] names ={"Orhan","Elif","Selim","Selin","Turan"};
      //  names[4]  ="Osman";
        System.out.println(Arrays.toString(names));

        ArrayList<String> namesList= new ArrayList<>();
        namesList.addAll(Arrays.asList(names));
                           //collectionType

        namesList.add("Ayperi");
        namesList.remove("Turan");
        System.out.println(namesList);
        System.out.println("===============================");

        Integer [] numbers ={1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer>numList = new ArrayList<>(Arrays.asList(numbers));


        System.out.println(numList);











    }
}
