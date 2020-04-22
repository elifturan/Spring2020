package day16_ForLoop;

public class ContinuePractice {
    public static void main(String[] args) {

        // skip print D, J, H, Y

        for(char i = 'A'; i<='Z'; i++){
            if(i=='D'||i=='J'||i=='H'||i=='Y'){
               continue;




            }
            System.out.print(i+" ");
        }
        System.out.println();

   for(int a = 1; a <= 100 ; a++){
       if(a %3==0 || a %5==0){
           continue;
       }
       System.out.print(a+" ");
   }







    }
}
