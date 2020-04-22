package day16_ForLoop;

public class Ascending_DescendingOrders {
    public static void main(String[] args) {

        for (char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print(ch+" ");
        }
        System.out.println();
       for(char ch1 = 'Z'; ch1 >='A'; ch1--){
           System.out.print(ch1+" ");
       }

        System.out.println();
        for (char ch = 'a'; ch <= 'z'; ch++){
            System.out.print(ch+" ");
        }
        System.out.println();
for (char ch = 'z';ch >= 'a'; ch--){
    System.out.print(ch+" ");
}


    }
}
