package day07_if_Statement;

public class MinNumber {
    public static void main(String[] args) {
   /* write a java program that accepts three numbers and return the minimum number
   (assume that none of them are equal)
    */


        double a = 100;
        double b = 200;
        double c = 400.5;

        boolean aMin = a < b && a < c; // if a is less than both b&c, than a is the min
        boolean bMin = b <a && b < c ;    //""
        boolean cMin = c < a && c < b ; // ""


        if (aMin){
            System.out.println(a+ " is the minimum number");
        }

        if(bMin){

            System.out.println(b+ " is the minimum number");
        }
        if (cMin){
            System.out.println(c + " is the minimum number");
        }









    }
}
