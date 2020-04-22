package day05_Unary_ShorthandOperators;

public class PostPre {
    public static void main(String[] args) {

        // pre: changes the value of the variable immediately

        int a = 100;
        System.out.println(++a); // a = 101
        System.out.println(a);// 101

        int b = 100;
        System.out.println(--b);//99
        System.out.println(b); // 99

        // POST: first passes the current value, then eventually changes the variable value

        int A = 100;
        System.out.println(A++); // at line 19 , A' values is still 100
        System.out.println(A); // 101
        int B = 100;
        System.out.println(B--);// 100
        System.out.println(B);// 99

        // post & Pre examples:
        int z = 10;
        int X = ++z;
        System.out.println(X); // x is increased by1
        System.out.println(z); // z = 11

        int s = 10;
        int f = s++;
        System.out.println(f); //10 after the value of s will be increased by 1
        System.out.println(s); // 11

        double t1 = 3.5;
        double t2 = t1--;//3.5 after line 41 t1 will be increased by 1

        System.out.println(t2);//3.5
        System.out.println(t1);// 2.5

        int num = 35;
        System.out.println(num++);//35
        System.out.println(num); // after num++ it will be 36
        System.out.println(num--);// 36
        System.out.println(num);// after num -- the value of num will be 35













    }


}
