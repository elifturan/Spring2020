package day23_Methods;

public class Unique_Values {
    public static void main(String[] args) {
/*
warmup task:
	1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
 */
String[] arr = {"A","B","A","C","D"};

for(int j =0; j< arr.length;j++) {


   // for (String each : arr) {
        int count1 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(arr[j])) {
                count1++;
            }
        }
        if (count1 == 1) {
            System.out.println(arr[j]);
        }

    }






        System.out.println("==============================================");
        //solution2:
for(String each2: arr){
  //  System.out.println(each2);
    int count =0;
    for(String each : arr){
        if(each.equals(each2)){
            count++;

        }
    }
//  System.out.println(count);
    if(count==1) {// if the character is unique
        System.out.println(each2);
    }



}




/*int count =0;
for(String each : arr){
    if(each.equals("B")){
        count++;

    }
}
//  System.out.println(count);
        if(count==1) {// if the character is unique
            System.out.println("B");
        }

 */











    }
}
