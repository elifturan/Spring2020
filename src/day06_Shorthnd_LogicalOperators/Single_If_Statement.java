package day06_Shorthnd_LogicalOperators;

public class Single_If_Statement {
    public static void main(String[] args) {

        boolean coldWather = true;
        if (coldWather){
            //true
            System.out.println("Wear your hat");
            System.out.println("Wear your jacket");
        }

        boolean coronaDetected = true;
        if (coronaDetected){
            System.out.println("Buy more toilet papers");
            System.out.println("Buy more water");
            System.out.println("Stay at home");
            System.out.println("Do more java coding");
        }

        System.out.println("============================================");

        int a = 201;
        boolean evenNumber = a % 2==0; // if a number can be divided without remainder
        //boolean oddNumber = a % 2 !=0; // if the number cannot be divided by 2 evenly


        if (evenNumber){
            System.out.println(a + " is even Number");
        }

       if (!evenNumber){ // if the number is not even number , then it must be odd

           System.out.println(a+ " is odd number");
       }










    }
}
