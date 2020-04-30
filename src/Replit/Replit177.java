package Replit;

import java.util.ArrayList;

public class Replit177 {
    public static void main(String[] args) {


    }
    public static String combineRs(String[] r1,String[] r2)
    {
        String[] arr = new String[r1.length+ r2.length];
        String result ="";
        for (int i = 0; i <r1.length ; i++) {
            result+=r1[i];
        }
        for (int i = 0; i <r2.length ; i++) {
            result+=r2[i];
        }
        ArrayList<String> arr3 =new ArrayList<>();
        for(String each: r1){
            result +=each;
        }for(String each: r2){
            result+=each;
    }



        return  result;
    }
}
