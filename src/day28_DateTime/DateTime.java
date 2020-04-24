package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        //2020-03-20 11:25:30

       LocalDateTime dt1= LocalDateTime.of(2020,03,20,11,25,30);
        System.out.println(dt1);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mm/dd/yyyy hh:mm:ss");
        System.out.println(dt1.format(dtf));


    }
}
