package CopilotJava;
import java.time.*;


public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Netsai Chiyaka");

        int num = 2;

        float fun = 28.2f;

        boolean bool = true;

        byte b = 127;

        char c = 'd';

        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(Instant.now());
        System.out.println(LocalTime.now());
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        perfom( start,end);
        //Create a period class
        Period period = Period.between(start, end);
        Period quarter = Period.ofMonths(3);
        Period year = Period.ofYears(2);
        Period day = Period.ofDays(1);
        Period week = Period.ofWeeks(1);
        Period everyYearAndWeek = Period.of(1,0,7);
        System.out.println(everyYearAndWeek + "check");

    }
    private static void perfom (LocalDate start, LocalDate end) {
        LocalDate upto = start;
        while (upto.isBefore(end)) {
            upto = upto.plusDays(1);
            System.out.println(upto + "local");

        }
    }
}
