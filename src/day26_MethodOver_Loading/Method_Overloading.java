package day26_MethodOver_Loading;

public class Method_Overloading {
    public static void main(String[] args) {
        method(10);//original method

    }

    public static void method(int a) {
        System.out.println("Original method");



    }
    public static void method(double a){
        System.out.println("Overloaded method");
    }
}
