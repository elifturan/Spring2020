package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Replit151 {


    public static void add_to_r(int[] r,int n)
    {
        //create new array with one more position.

        int[] arr = new int[r.length];
        int number = n;

        for(int j =0; j<r.length;j++){
            arr[j] += r[j];
            arr[r.length]=number;
        }
        System.out.println(Arrays.toString(arr));

    }



    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(),n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);


    }


    }

