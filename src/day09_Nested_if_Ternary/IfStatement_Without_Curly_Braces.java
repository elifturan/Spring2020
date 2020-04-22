package day09_Nested_if_Ternary;

public class IfStatement_Without_Curly_Braces {
    public static void main(String[] args) {
        int number = 100 ;
        if (number %2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd Number");

        if (true ) {//if the block containing more than one statement we must give the body(curly braces)
            System.out.println("Hello");
            System.out.println("Condition is true");
            System.out.println("Text executed");
        }








    }
}
