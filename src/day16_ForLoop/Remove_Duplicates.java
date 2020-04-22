package day16_ForLoop;

public class Remove_Duplicates {
    public static void main(String[] args) {

        String str="CCDD";

        String result="";//" CD "Expected result  in this variable

     //   for (int i = 0 ; i <=3;i++){==1way
for(int i = 0 ; i<= str.length()-1; i++){//2.way
            if (result.contains(""+str.charAt(i))){//if the string result does not contains str.charAt(i),then we concate it to thw result , if it does we will not concate it to the result.
                      continue;
}
         /*   if(!result.contains(""+str.charAt(i))){
                result += str.charAt(i);
            }

          */
result+= str.charAt(i);
        }

        System.out.println(result);




    }
}
