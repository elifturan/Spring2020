package Resources;

import java.util.Arrays;

public class Library2 {
    public static int[] sortDescending(int[] arr){
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length] ;
        int j = arr.length-1;
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }
        return RevArr;
    }
    public static String Reverse(String str){
        String Reverse = "";
        for(int i = str.length()-1; i >= 0; i-- ){
            Reverse  += str.charAt(i);
        }
        return  Reverse;
    }
    // remove duplicates from string
    public static String duplicates(String str){
        String result="";
        for(int i=0;i<=str.length()-1;i++){
            if(result.contains(""+str.charAt(i))){
                continue;}
            result+=str.charAt(i);}
        return result;
    }
    // Frequency of string
    public static String frequency(String str){
        String result="";
        String nonDuplicates="";
        for(int i=0;i<=str.length()-1;i++){
            if(!nonDuplicates.contains(""+str.charAt((i)))){
                nonDuplicates+=str.charAt(i);}}
        for(int j=0;j<=nonDuplicates.length()-1;j++) {
            int count1 = 0;
            char ch = nonDuplicates.charAt(j);
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {
                    count1++;
                }
            }
            result += "" + ch + count1;
        }return result;}
    // merge two array and return third one
    public static int[] merge(int[] arr1,int[]arr2){
        int []arr3=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];}
        for(int k=0;k<arr2.length;k++){
            arr3[arr1.length+k] = arr2[k];
        }
        return arr3;
    }
    // max number from array
    public static int maximumNumberArray(int[] arr) {
        int maxNumber = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }}
        return maxNumber;
    }
    // min number from array
    public static int minimumNumberArray(int[] arr1) {
        int minNumber = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < minNumber) {
                minNumber = arr1[i];
            }
        }
        return minNumber;

    }
}
