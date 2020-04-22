package day05_Unary_ShorthandOperators;

public class LeapYear {
    // every 4 years

    // year 2020 ==> short
    //LeapYear = true/false

    public static void main(String[] args) {

        short year = 2020 ;
        // (divisible by 4 ) LeapYear ; year % 4 == 0
        // if returns true it means LeapYear, if it returns false ==> not LeapYear

        boolean leapYear = year % 4 == 0;
        // if the year can be devided by 4 without any reminder , then it's leap year


       // System.out.println( year + " is leap year: "+leapYear);
          String result = year + " is leap year: "+leapYear;

        System.out.println(result);



























    }


}
