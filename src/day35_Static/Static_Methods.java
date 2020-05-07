package day35_Static;

public class Static_Methods {

    int a =100;
    static  int b =200;

    public static void main(String[] args) {

        // System.out.println(a); static only accepts static //
        Static_Methods obj = new Static_Methods();
        System.out.println(obj.a);//by creating object you can call instance variable
        System.out.println(b);
        System.out.println(Static_Methods.b);
        System.out.println(obj.b);//static prefers to be called through class name

    }
    public void method(){//object
        System.out.println(a);
        System.out.println(b);// it accepts static
    }
}
