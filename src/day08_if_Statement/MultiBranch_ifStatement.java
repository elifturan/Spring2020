package day08_if_Statement;

public class MultiBranch_ifStatement {
    public static void main(String[] args) {
        /* Multi branch if statement (else if) : if there are more than two possibilities, or option
            if(Condition1){
                    statement1;  // gets executed if condition1 is true
            } else if(condition2){
                    sattement2; // gets executed if condition1 is false and condition2 is true
            } else {  // other wise
                    statement3;  // gtes executed if all condition1 & 2 are failed
            }
    ONLY ONE OF THE BLOCK GETS EXECUTED
*/
       int a = 100;
       boolean zero = a == 0;
       boolean negative = a < 0;
       boolean positive = a> 0 ;

       if (zero){
           System.out.println("zero");
       }
       else if (negative){
           System.out.println("Negative");
       } else{
           System.out.println("Positive");
       }





    }
}
