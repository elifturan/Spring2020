package day04_JavaRecap;

public class Variable_Practice {
    public static void main(String[] args) {
        // DateType variablaName
        /*
        1.    Must be started with letters
2.    Must be Unique
3.    Cannot be Java Reserved Words
4.    Cannot contains special character other than these two: $ and _

        */

        byte num1 = 127;
        short num2 = num1; // double> float>long> int>short> byte
        // byte num3 = num2; not accept!

        int num4 = num2; // int is prefered by complier


        long num5 = 999999999L;

        float num6 = 100f;

        System.out.println(num6);

        float num7 = 0.5f;
        System.out.println(num7);

        double num8 = 0.5;
        double num9 = 9999999L;

        double num10 = 100.5;

        System.out.println(num10);

        char ch1 = '$'; // everysingle character has a corresponding number

        System.out.println(ch1); // $

        char ch2 = 4500;   // 0 ~ 65565
        System.out.println(ch2);

        int a1 = '8';
        System.out.println(a1); //56

        int a2= 'z';
        System.out.println(a2);

        double d1 = 'z' + '8'; // z8, 178, 178.0
        System.out.println(d1);

        char ch3 = 178;
        System.out.println(ch3);

        char ch4 = 'z' + '8';
        System.out.println(ch4);


        boolean bool1 = true ;
        boolean bool2 = false ;

        System.out.println(9 > 10); // false

        System.out.println( 9 >= 9 ); // true

        System.out.println(9!= 10); //true

        System.out.println('a'== 'b'); //false

        System.out.println('a'== 'b' -1); // true

        //System.out.println( 'a' == "a");// doesn't match because of that character -->""

        System.out.println('a'== 'b'-1);
                    //     97 == 98 - 1
                    //      97 ==97  ---->True

        System.out.println( "Muhtar" == "Good Guy"); //false
          //                Bad Guy == Good Guy ---> false

        System.out.println("muhtar" != "Good Guy"); //true

        System.out.println("Muhtar"== "muhtar"); // false
        // because upper case and lower case are not equal

       // System.out.println("Cybertek"= 10000); not using!

        boolean r1 = !true ; // false
        System.out.println(r1);//false
        System.out.println(!r1); // true

        System.out.println("==================================================");

        System.out.println(!true== false); // true
        System.out.println(!true != !false); // true






















    }





}
