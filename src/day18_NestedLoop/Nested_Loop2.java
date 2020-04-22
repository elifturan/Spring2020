package day18_NestedLoop;

public class Nested_Loop2 {
    public static void main(String[] args) {
        /*
              *
              * *
              * * *
              * * * *
              * * * * *
         */

        for(int j = 1; j<=9;j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("====================================");


for (int k = 9; k >=0; k--){
    for(int l =1 ; l <=k;l++){
        System.out.print("* ");
    }
    System.out.println();
}
        System.out.println("=================================");

for (char zh= 'a'; zh<= 'z';zh++) {
    for (char ch = 'a'; ch <= zh ; ch++) {

        System.out.print(ch + " ");
    }

    System.out.println();

}


        for(int m = 1; m<=9;m++) {
            for (int n = 1; n <= m; n++) {
                System.out.print("\uD83E\uDD2A ");
            }
            System.out.println();
        }





    }
}
