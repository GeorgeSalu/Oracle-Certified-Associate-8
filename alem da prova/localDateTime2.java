import java.time.*;
import java.time.temporal.*;
import java.time.format.*;

class localDateTime2 {
    public static void main(String[] args){


        //manipulando data
        LocalDateTime now = LocalDateTime.of(2014,12,15,13,0);
        System.out.println(now.getDayOfMonth()); // 15
        System.out.println(now.getDayOfYear());  // 349
        System.out.println(now.getHour());       // 13
        System.out.println(now.getMinute());     // 0
        System.out.println(now.getYear());       // 2014
        System.out.println(now.getDayOfWeek());  // MONDAY
        System.out.println(now.getMonthValue()); // 12
        System.out.println(now.getMonth());      // DECEMBER

        LocalDateTime now = LocalDateTime.of(2014,12,15,13,0);
        // 15
        System.out.println(now.get(ChronoField.DAY_OF_MONTH));  
        // 349 
        System.out.println(now.get(ChronoField.DAY_OF_YEAR));
        // 13    
        System.out.println(now.get(ChronoField.HOUR_OF_DAY));  
        // 0  
        System.out.println(now.get(ChronoField.MINUTE_OF_HOUR));
        // 2014
        System.out.println(now.get(ChronoField.YEAR));   
        // 1 (MONDAY)        
        System.out.println(now.get(ChronoField.DAY_OF_WEEK));    
        // 12
        System.out.println(now.get(ChronoField.MONTH_OF_YEAR));

    }
}