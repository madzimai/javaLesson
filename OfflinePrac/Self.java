package OfflinePrac;
import java.time.*;

public class Self implements Off{
    public void off(String kkk) {
    }
    public void eat(){
        System.out.println("date");
    }
    public static void main(String[] args) {
        Off off = new Self();
        off.off("kkk");

        LocalDate date = LocalDate.parse("2020-01-02");
        System.out.println(date);

        LocalDateTime dT = LocalDateTime.parse("2020-01-02T21:20");
        System.out.println(dT);

        LocalTime time = LocalTime.parse("12:30");
        System.out.println(time);

    }
}
