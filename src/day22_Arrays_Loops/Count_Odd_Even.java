package day22_Arrays_Loops;

public class Count_Odd_Even {
    public static void main(String[] args) {

    int [] arr = {1,2,3,4,5,6,7,8,9,10}  ;

    int countOdd = 0;
    int countEven =0;

    for(int each : arr) {


         /*   if (each % 2 != 0) {
                countOdd++;
            } else {
                countEven++;
            }

          */
        if(each %2 == 0){
            countEven++;
            continue;
        }
        countOdd++;
    }
        System.out.println("even numbers: "+countEven);
        System.out.println("Odd numbers: "+countOdd);





    }
}
