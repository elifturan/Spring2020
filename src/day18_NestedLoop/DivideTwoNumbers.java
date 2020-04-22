package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {

     /*
     1. write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators
      */

        int a= 20;
        int b= 0;
        int count =0;// count the execution of the loop

        if(b==0){
            System.out.println("divisor cannot be zero");
            System.exit(0);
        }
        while (a>= b ){
            a -= b;
            count++;
        }
       if (a == 0) {
           System.out.println("The result is: " + count);
       }else {
           System.out.println("The result is "+count+"with a remainder of "+a);
       }
       }
}
