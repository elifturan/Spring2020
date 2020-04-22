package day26_MethodOver_Loading;

public class MethodOverloading3 {
    public static void main(String[] args) {
        sum(10,5);
        sum(1.5,2.5);

        double num1 = sum(10,15.5);
        System.out.println(num1);
    }

    public static void sum(int a , int b){// in method overloading, return types doesn't matter
        System.out.println(a+b);
    }
    public static double sum(double a, double b){
       return a+b;
    }

}
