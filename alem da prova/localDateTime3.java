import java.time.*;
import java.time.temporal.*;
import java.time.format.*;

class localDateTime3 {
    public static void main(String[] args){

        //comparacao
        MonthDay day1 = MonthDay.of(1, 1); //01/jan
        MonthDay day2 = MonthDay.of(1, 2); //02/jan

        System.out.println(day1.isAfter(day2)); //false
        System.out.println(day1.isBefore(day2)); //true

        LocalDate aprilFools = LocalDate.of(2015, 4, 1);
        LocalDate foolsDay = LocalDate.of(2015, 4, 1);
        // são equals?
        System.out.println(aprilFools.isEqual(foolsDay)); //true
        // este objeto suporta dias?
        System.out.println(aprilFools.isSupported(
            ChronoField.DAY_OF_MONTH)); //true
        // este objeto suporta horas?
        System.out.println(aprilFools.isSupported(
            ChronoField.HOUR_OF_DAY)); //false
        // posso fazer operações com dias?
        System.out.println(aprilFools.isSupported(ChronoUnit.DAYS)); 
        //true
        // posso fazer operações com horas?
        System.out.println(aprilFools.isSupported(ChronoUnit.HOURS)); 
        //false

    }
}