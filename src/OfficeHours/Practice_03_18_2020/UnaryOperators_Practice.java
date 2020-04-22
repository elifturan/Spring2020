package OfficeHours.Practice_03_18_2020;

public class UnaryOperators_Practice {
    public static void main(String[] args) {

        // post ; fist passes value than incerease it by 1
 int a = 20;
        System.out.println(a++); //20
        System.out.println(a);//21

        int b = 30;
        int c = b--; // c=30 b=29;
        System.out.println(b); // 29
        System.out.println(c); // 30

       int d = 40;
       int e = d++;
        System.out.println(e); // 40
        System.out.println(d); //41
        System.out.println("===============================================");
        // pre : changes the value immediately
        int x= 200;
        System.out.println(x--);//not immediately
        System.out.println(x);
        System.out.println(--x); // immediately

        int z = 100 ;
            z= z ++ + --z - z-- + ++z;
        System.out.println(z);


        int u = 900; // 901 , 902 , 903
        int r = - ++u + ++u + -u++;
        //  r = -901 +  902 + -902;
        System.out.println(r);
        System.out.println(u);
















    }
}
