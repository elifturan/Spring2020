package day27_DayTime;

import com.sun.xml.internal.ws.assembler.jaxws.AddressingTubeFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date_Formatting {
    public static void main(String[] args) {

// MMM is writes name of month =====/ MM writes digit number of month
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));

//create a date called Birthday: month/Days/year
        DateTimeFormatter brth=DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        LocalDate birthday =LocalDate.of(1990,04,05);
        System.out.println("My husband birthday is: "+birthday.format(brth));
    }







}
