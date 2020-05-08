package day36_StaticBlock;

public class StaticBlock {


    public static void main(String[] args) {
        System.out.println("Main method executed");
    method1();

    }
    public static void method1(){
        System.out.println("Custom method executed");
    }


    static {// only execute 1 time and also always 1st place it runs no matter you write very bottom
        System.out.println("static block executed");
    }
}
