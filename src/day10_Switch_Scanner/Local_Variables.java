package day10_Switch_Scanner;

public class Local_Variables {
    public static void main(String[] args) {
        //Local Variable :variables that are declared within block. Cannot be used outside block
        //must be initialized before we ude them
        int a = 0;
        if(true){
            System.out.println(a);
            int b = 10;
            System.out.println(b);



        }
             switch (3){
                 case 1:
                     int c = 100;
                 case 2:
                    // System.out.println(c); it belongs case 1!







             }




        if (9> 10){
            int t = 100;
        } else if (11<10){
            int y = 200;
        }else if(12>10){
            int z= 300;
        }

       // System.out.println(t);



    }
}
