package Replit;

import java.util.Scanner;

public class Hellooooo {
    public static void add_to_r(int[] r,int n)
    {
        //create new array with one more position.



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
