package day27_DayTime;

import java.time.LocalDate;

public class DateTime {
    public static void main(String[] args) {

        LocalDate date1 =LocalDate.of(2020,4,23);
        System.out.println(date1);
        LocalDate birthday =LocalDate.of(1994,5,24);
        System.out.println(birthday);

       //isAfter(date2)
                boolean result1= date1.isAfter(birthday);
        System.out.println(result1);//true
        //isBefore(date2)
        boolean result2 = date1.isBefore(birthday);
        System.out.println(result2);
        //isEqual(date2)
    boolean result3 = date1.isEqual(birthday);
        System.out.println(result3);
        //isLeapyear(date3)
    boolean result4 = date1.isLeapYear();
        System.out.println(result4);
        System.out.println("================================");
        LocalDate now = LocalDate.now();
        System.out.println("Today is : "+now);

        String str = now.toString();
        System.out.println(str.replace("-"," "));

  // month/day/year






        System.out.println("===========================");


LocalDate birthday1 = LocalDate.of(1990,04,25);
   int month = birthday1.getMonthValue();
  int days = birthday1.getDayOfMonth();
  int year =birthday1.getYear();
        System.out.println(month+" "+days+" "+year+" Happy Birthday");


    }


}
