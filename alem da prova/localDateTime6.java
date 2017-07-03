import java.time.*;
import java.time.temporal.*;
import java.time.format.*;

class localDateTime6 {
    public static void main(String[] args){

        //formatando
        LocalDate birthday = LocalDate.of(1983, 7, 22);
        DateTimeFormatter formatter = 
            DateTimeFormatter.ofPattern("yyyy MM dd");
        System.out.println(formatter.format(birthday)); // 1983 07 22

        //
        LocalDate birthday = LocalDate.of(1983, 7, 22);
        DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("yyyy MM dd");
        System.out.println(birthday.format(formatter)); // 1983 07 22

        //
        DateTimeFormatter formatter = 
            DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d = LocalDate.parse("23/04/1986",formatter);
        System.out.println(formatter.format(d)); // 23/04/1986

        //
        DateTimeFormatter formatter = 
            DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d = 
            LocalDate.parse("23/15/1986",formatter); 
            // throws DateTimeParseException
        System.out.println(formatter.format(d)); // 23/04/1986

    }
}