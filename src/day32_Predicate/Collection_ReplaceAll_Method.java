package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collection_ReplaceAll_Method {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Nurella","Elif","Orhan","Yusuf","Mehmet","Satilmis","Nurella","Nurella"));

     //  names.addAll(Arrays.asList("Elif","Orhan","Yusuf","Mehmet","Satilmis","Nurella")) ; you can use this method too

     /*   names.set(0,"Nurella");
        names.set(3,"Nurella");
        names.set(5,"Hamdis");

      */
        Collections.replaceAll(names,"Nurella","Hamdis");

        System.out.println(names);











    }
}
