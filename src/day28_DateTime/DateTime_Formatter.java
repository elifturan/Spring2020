package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatter {
    public static void main(String[] args) {
        LocalDateTime datetime1 = LocalDateTime.of(2016,4,10,17,10,00);
        System.out.println(datetime1);
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE MMMM/dd/yyyy hh:mm:ss a");
        System.out.println(datetime1.format(dtf));


    }

}
