package day23_Methods;

import java.util.Arrays;

public class Methods_Task {
    //create a function that can print the max number from any given number
    //create a function that can print the min number from any given number
    //create a function that can print out the array in descending order[1,2,3]==>[3,2,1]
    public static void main(String[] args) {
maxNumber();
minNumber();
decsending();
    }
public static void maxNumber(){
        int []num ={23,5654,456,787,87,65,7} ;
        int max = num[0];
        for(int i=0; i<num.length ;i++){
           if( num[i]>max){
               max=num[i];
               decsending();
           }

        }
    System.out.println(max);
}
          public static void minNumber(){
              int []num ={23,5654,456,787,87,65,7} ;
        int min = num[0];
        for(int i=0; i<num.length;i++){
            if(num[i]<min){
                min = num[i];
            }
        }
              System.out.println(min);
          }
          public static void decsending(){
              int []num ={23,5654,456,787,87,65,7} ;
              Arrays.sort(num);
              int[] Revarr = new int [num.length];
              int j =num.length-1;
              for(int i =0; i<num.length;i++){
                  Revarr[i]=num[j];
                  j--;
              }
              System.out.println(Arrays.toString(Revarr));
          }



}
