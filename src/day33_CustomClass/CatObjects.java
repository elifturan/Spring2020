package day33_CustomClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setCatInfo("Calico","Black -Brown-yellow",1,"Venus");
        cat1.toString();
        System.out.println(cat1);
        System.out.println("=============================");
        Cat cat2 = new Cat();
        cat2.setCatInfo("Karma","Yellow",4,"Capkin");
        System.out.println(cat2);
        System.out.println("========================");

        Cat cat3 = new Cat();
        cat3.setCatInfo("Teacup","White",1,"Pamuk");
        System.out.println(cat3);


        ArrayList<Cat> catList = new ArrayList<>();
            catList.addAll(Arrays.asList(cat1,cat2));
        for (int i = 0; i < catList.size(); i++) {
            System.out.println(catList.get(i));
        }
        System.out.println("=======================");
cat1.sleep();
cat2.sleep();
cat3.sleep();

cat1.eat("cake");
cat2.eat("tuna");
cat3.eat("lahmacun");

cat1.drink("milk");
cat2.drink("water");
cat3.drink("formula");


    }
}
