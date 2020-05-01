package Replit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assessment4 {
    public static void main(String[] args) {

ArrayList<String> worldList1 = new ArrayList<>();



    }
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> num){
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        int count=0;
        for (int i = 0; i < num.size() ; i++) {
            if(num.get(i)>0){
                list.add(num.get(i));
                sum+=num.get(i);
                count++;
            }
        }
        list.add(count,sum);
return list;

    }










}
