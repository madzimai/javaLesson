package JavaApi;
import java.time.*;
import java.time.format.*;

public class DateTest{

    public static void main(String[] args){
        //1
        //LocalDate greatDay = LocalDateTime.parse("2015-01-01");//do not compile it expect a string with time also
        LocalDate greatDay1 = LocalDate.parse("2015-01-01");//2
        //String greatDayStr = greatDay1.format(DateTimeFormatter.ISO_DATE_TIME); it expect a string time
        String greatDayStr = greatDay1.format(DateTimeFormatter.ISO_DATE);

        System.out.println(greatDayStr);//4
    }
}