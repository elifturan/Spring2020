package OfficeHours.Practice_05_06_2020;

import javax.swing.event.DocumentEvent;

public class DevelopersObject {
    public static void main(String[] args) {
        Developer dev1 = new Developer();
        dev1.setDevInfo("Leanardo", "Senior Developer", 160_000,18121993);

        Developer dev2 = new Developer();
        dev2.setDevInfo("Leon","Senior Developer",180000,12546);

dev1.coding();
dev2.coding();

dev1.fixingBug();
dev2.fixingBug();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Developer[] arr ={dev1,dev2};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        for(Developer each:arr){
            System.out.println(each);
        }


    }

}
