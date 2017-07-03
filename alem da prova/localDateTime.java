import java.time.*;
import java.time.temporal.*;
import java.time.format.*;

class localDateTime {
    public static void main(String[] args){

        LocalTime currentTime = LocalTime.now(); // 09:05:03.244
        LocalDate today = LocalDate.now(); // 2014-12-10
        LocalDateTime now = LocalDateTime.now(); 
                                // 2014-12-10-09-05-03.244

        LocalTime time = LocalTime.now(ZoneId.of("America/Chicago")); 
        LocalDate date = LocalDate.now(ZoneId.of("America/Sao_Paulo"));
        LocalDateTime dateTime = 
        LocalDateTime.now(ZoneId.of("America/Los_Angeles"));

        LocalDate christmas2014 = LocalDate.of(2014, 12, 25);
        LocalDate christmas2015 = LocalDate.of(2015, Month.DECEMBER, 25);

        LocalDate christmas2014 = LocalDate.of(2014, 12, 25);
        LocalDateTime christmasAtNoon = 
        LocalDateTime.of(christmas2014, meioDia);

    }
}