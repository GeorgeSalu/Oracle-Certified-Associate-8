import java.time.*;
import java.time.temporal.*;
import java.time.format.*;

class localDateTime4 {
    public static void main(String[] args){

        //alterando as datas
        LocalDate d = LocalDate.of(2015, 4, 1); //2014-04-01

        d = d.withDayOfMonth(15).withMonth(3); //chaining
        System.out.println(d); //2015-03-15

        LocalDate d = LocalDate.of(2013, 9, 7);
        System.out.println(d); // 2013-09-07
        d.withMonth(12);
        System.out.println(d); // 2013-09-07

        //
        LocalDate d = LocalDate.of(2013, 9, 7);
        d = d.plusDays(1).plusMonths(3).minusYears(2);
        System.out.println(d); // 2011-12-08

    }
}