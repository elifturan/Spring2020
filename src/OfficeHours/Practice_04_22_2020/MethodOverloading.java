package OfficeHours.Practice_04_22_2020;

public class MethodOverloading {
    public static void method1(){
        System.out.println("Hello World");
    }
    public static int method1(int a){
        System.out.println("Hello Cybertek");
        return 10;
    }
    public static void method1(int a , int b){
        System.out.println("Hello Batch 18");
    }

    public static void main(String[] args) {
        method1();
        method1(1);
        method1(1,2);
        System.out.println("============================");
        int num = method1(20);// Hello Cybertek , and then returns 10;
        System.out.println(num);

    }
}
