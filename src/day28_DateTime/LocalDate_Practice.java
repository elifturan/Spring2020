package day28_DateTime;

import java.time.LocalDate;

public class LocalDate_Practice {
    public static void main(String[] args) {

       String[] friends = {"Burcak","Kubra","Sulti"};
                     //      0        1        2


        LocalDate BurcakBirthday= LocalDate.of(1994,2,16);
        LocalDate KubraBirthday= LocalDate.of(1996,11,20);
        LocalDate SultiBirthday=LocalDate.of(1997,9,20);
        LocalDate [] birthdays ={BurcakBirthday,KubraBirthday,SultiBirthday};

        for(int i =0; i<friends.length;i++){
            String name = friends[i];
            LocalDate brth = birthdays[i];
            System.out.println(name+" 's birthday is: "+brth);
        }






     /*   int a =100;
        int b =200;
        int c =300;
        int[] array1 ={a,b,c};

      */






    }
}
