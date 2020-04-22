package day06_Shorthnd_LogicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {

        /* LOGICAL OPERATORS: can apply to boolean expression
        !: Logical opposite operators true or false
        it returns boolean expression
        */
        boolean result1 = true;
        System.out.println(!result1); //false

        boolean result2 = 10 +15 > 15 ;
        System.out.println(result2); //true
        boolean result22 = !(10 + 15 > 15); //false
        System.out.println(result22);
       // Relational operators : >,< ,<=,=>, == , !=

        boolean result3 = !true == !false;
        System.out.println(result3);

        // && : and logic


        boolean R1 = "Corona Virus" != "End of the world" && "Toilet paper" == "Cure";
                     //          true                     && false       ==>false

        boolean R2 = 10 > 15 && 15 < 13 ;
                 //    false && false ==> false

        System.out.println(R1);
        System.out.println(R2);
        System.out.println("===============================================");
        boolean R3 = 'a' == 'b' -1 && 'b' + 1 == 'c';
                 //   97 == 98- 1  && 98+1     == 99
        System.out.println(R3);

      /*       || or Logic:
           true || false ==> True
           false || true ==> true
           true || true ==> true
           false || false ==>false
           THE ONLY TIME OR LOGIC RETURNS FALSE IS WHEN BOTH CONDITIONS ARE FALSE , OTHERWISE ==>TRUE
      */

      boolean R4 = true != false || false == !true;
                //      true     ||       true
        System.out.println(R4);


        System.out.println("================================================");

        boolean R5 = true != false && !false == !true;
                    //     true   &&    false
        System.out.println(R5);
          boolean R6 = !!!false;
                 //   it returns true
             //        !! true = ! false = true
        System.out.println(R6);































    }


}
