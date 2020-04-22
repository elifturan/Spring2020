package day18_NestedLoop;

public class Nested_Loop {
    public static void main(String[] args) {

        for (int i =0;i <5; i++) {//1,2,3,4,5
            for (int j = 1; j <= 5; j++) {//1,2,3,4,5
                System.out.print(j+" ");


            }
            System.out.println();
        }

        System.out.println("=======================================");
for (int i = 0; i<7 ; i++) {
    int rec = 1;

    while (rec <= 6) {
        System.out.print("*");
        rec++;
    }
    System.out.println();
}
        //System.out.println("Elif");
















    }
}
