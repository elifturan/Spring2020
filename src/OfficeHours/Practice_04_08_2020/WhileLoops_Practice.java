package OfficeHours.Practice_04_08_2020;

public class WhileLoops_Practice {
    public static void main(String[] args) {


       for(int i=0; i<5; i++) {
           System.out.println("Hello Word");
       }

        int e = 0;
       while(e<5){
         // e++; //it begins 1 to 5
           System.out.println(e+" Kocami cok seviyorum ");
           e++; // it begins 0 to 4 = 5 number such as( 0,1,2,3,4)
       }
        System.out.println("============================================");
       int z = 0;
       while(z<=100){
           if(z%15==0){
               System.out.println(z);
           }
           z++;
       }



    }
}
