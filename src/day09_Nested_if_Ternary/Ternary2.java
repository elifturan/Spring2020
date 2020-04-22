package day09_Nested_if_Ternary;

public class Ternary2 {
    public static void main(String[] args) {

        //ternary: ? means if, : else
        String result = "";
        if (9>10){
            result="9 is greater";
        } else{
            result="10 is greater";
        }
        System.out.println(result);
          String result2 = (9>10)? " 9 is greater" : "10 is greater";
        System.out.println(result2);

        System.out.println("============================");

        int age = 25 ;
        boolean eligibility = (age >= 21) ? true : false;
        System.out.println(eligibility);
       /* if ( age > = 21 ){
            eligibility= true;
        }else {
            eligibility=false;
        }

        */

        System.out.println("========================================");

        int ageOfPerson= 20;
        String eligibilToVote = "";

        if (ageOfPerson>=18){
            eligibilToVote="YES";
        } else {
            eligibilToVote="NO";
        }
         String eligibleToVote2= (age >=18 )? "YES": "NO";
        System.out.println(eligibilToVote);
        System.out.println(eligibleToVote2);









    }
}
