package day15_ForLoop;

public class ForLoop_Practice {
    public static void main(String[] args) {

      /*
      odd number between 1 ~ 100 in a single line sperated
      by a space 1 3 5 7 9 ......
       */
      String resultOdd = " ";
        for(int num = 1; num <= 100 ; num +=2){
           // System.out.print(num+" ");
            resultOdd += num +" ";
        }
        System.out.println(resultOdd);

String resultEven = " ";
        for(int num1 = 0; num1<=100 ; num1 +=2 ){
            //System.out.print(num1+" ");
            resultEven += num1+ " ";
        }
        System.out.println(resultEven);

    }
}
