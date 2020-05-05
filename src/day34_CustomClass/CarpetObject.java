package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject {
    public static void main(String[] args) {
        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};
        carpets[0].customOrder(7, 8.5, 20, true);
        System.out.println(carpets[0]);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        carpets[1].customOrder(10, 15, 30, false);
        System.out.println(carpets[1]);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        carpets[2].customOrder(9, 20, 15, true);
        System.out.println(carpets[2]);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        carpets[3].customOrder(20, 18, 25, false);
        System.out.println(carpets[3]);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        carpets[4].customOrder(35,45,35,true);
        System.out.println(carpets[4]);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        ArrayList<Carpet> persianCarpet= new ArrayList<>();
        for (Carpet eachCarpet : carpets){
            if (eachCarpet.isPersian) {
                persianCarpet.add(eachCarpet);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("there are "+persianCarpet.size()+" persian carpets");
        System.out.println(persianCarpet.get(0).calcCost());
        System.out.println(persianCarpet.get(1).calcCost());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
ArrayList<Carpet>regularCarpets= new ArrayList<>(Arrays.asList(carpets));
//regularCarpets.removeAll(persianCarpet);
        regularCarpets.removeIf( p -> p.isPersian );


        System.out.println("There are "+ regularCarpets.size()+" regular carpet");


        for (int i = 0; i <regularCarpets.size() ; i++) {
            System.out.println(regularCarpets.get(i).calcCost());
        }










    }
}
