package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Hellooooo {


    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));



    }

    public static ArrayList<String> swapMet(ArrayList<String> list, int pos1, int pos2) {
        Collections.swap(list, pos1, pos2);

        return list;
    }
}