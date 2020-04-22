package day03_VariablesContinue;

public class VariablesContinue {
    public static void main(String[] args) {



        /*   >: greater
             >=:greater or equal
             < : less
             <= : less or equal
             = : equal
             != : not equal

         */

        boolean result1 = true;
        boolean result2 = false;

        boolean result3 = 10 > 9; //

        System.out.println(result3);

        System.out.println( true == false );

        System.out.println("Muhtar" == "Good Guy"); // totally false

        System.out.println("Muhtar" != "Good Guy"); //true

        boolean r1 = true != true ; //false

        System.out.println( r1 ); //false

        boolean r2 = "Batch 17" == "Batch 18"; //false

        System.out.println( r2 );

        System.out.println("=================================================");

        char ch1 = 'A';
        System.out.println( ch1 );
        char ch2 = 45000;
        System.out.println(ch2);

        char ch3 = 25000;
        System.out.println(ch3);

        char ch4 = 100;
        System.out.println(ch4);

         char ch5 = 'D'; //68

        System.out.println(ch5);

        int num1 = 'D'; //number,
        System.out.println(num1);

        char a1 = 'z';
        System.out.println(a1);

        // byte b1 = a1; // char is larger than byte

        byte b1 = 'z';
        System.out.println(b1);

        //short s1 = a1; // char is larger than short

        int i1 = a1; // int is larger than char
        System.out.println(i1);

    }



}
