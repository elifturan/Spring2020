package day06_Shorthnd_LogicalOperators;

public class warmUp {
    public static void main(String[] args) {

        double numberOfGalons = 5;
        double galonsToLiters = numberOfGalons * 3.785;
        String result = numberOfGalons + " gallons is equal to: " + galonsToLiters + " liters";
        System.out.println(result);


        System.out.println("===============================================");
        double numberOfLiters = 1;
        double litersToGallons = numberOfLiters / 3.785;
        String result2 = numberOfLiters + " liters equal to: " + litersToGallons + " gallons";
        System.out.println(result2);
        System.out.println("================================================");

        int a = 200; // 199
        int b = -a++ + - --a * a-- % 2;
        //b=    -200 + - 200 * 200 % 2
        //b = -200 + -40000 % 2
        // b = -200 + 0
        // b = -200
        System.out.println(b);
        System.out.println(a);


        System.out.println("=================================");

        int x = 300;
        int y = 400 ;
        int z =   x + y - x * y +x / y ;
        //  z = 300 + 400 -300*400 +300/400
        // z=  300+400 -120000 + 300/400    300/400 ==> 0.75
        // z = 300+400 - 120000
        // z = 700 - 120000 =-119300
        System.out.println(z);

    }


}
