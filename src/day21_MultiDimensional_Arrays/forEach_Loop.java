package day21_MultiDimensional_Arrays;

public class forEach_Loop {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        for(int eachElement : nums){
            System.out.println(eachElement);
        }

String [] students = {"Fate","Ozi","UuL"};
        for( String names : students){
            System.out.println(names);
        }

int [] arr1 ={1,2,3,4,5,6,7,8,9,10};
for (int each :arr1){
    if(each > 5 ){ // if(each<5){
        //continue;
        System.out.println(each);
    }
   // System.out.println(each);
}

        System.out.println("==========================================");
String sentence = "I like Java";// "Java like I"
 String [] words =   sentence.split(" ");

for (String each : words){
    System.out.println(each);
}
        System.out.println("==========================");
for (int i = words.length-1 ; i>=0;i--){
    System.out.print(words[i]+" ");
}


    }
}
