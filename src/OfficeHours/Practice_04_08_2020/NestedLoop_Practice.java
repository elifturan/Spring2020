package OfficeHours.Practice_04_08_2020;

public class NestedLoop_Practice {
    public static void main(String[] args) {


        int k = 5;
        while (k < 10) {

            for (int i = 10; i <= 50; i += 10) {
                System.out.print(i + " ");
            }
            System.out.println();

            k++;
        }
        System.out.println("========================================");


        for (int s = 1; s <= 8; s++) {
            for (int r = 0; r <= 5; r++) {
                System.out.print("* ");


            }
            System.out.println();


        }
        System.out.println("=============================");
for(int o= 0 ;o<8; o++) {
    for (int e = 0; e <= o; e++) {
        System.out.print("* ");
    }
    System.out.println();

}
        System.out.println("* * * * * * * * *");
for(int m = 8; m>0 ;m--){
    for(int y =0; y<m ; y++){
        System.out.print("* ");
    }
    System.out.println();
}






    }
}
