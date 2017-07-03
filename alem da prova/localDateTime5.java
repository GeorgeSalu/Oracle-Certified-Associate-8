import java.time.*;
import java.time.temporal.*;
import java.time.format.*;

class localDateTime5 {
    public static void main(String[] args){

      // calculo de intervalos
      Instant now = Instant.now(); // agora
      Duration tenSeconds = Duration.ofSeconds(10); // 10 segundos
      Instant t = now.plus(tenSeconds); // agora mais 10 segundos

      Instant t1 = Instant.EPOCH; // 01/01/1970 00:00:00
      Instant t2 = Instant.now();
      long secondsSinceEpoch = Duration.between(t1, t2).getSeconds();

      //
        LocalDate birthday = LocalDate.of(1983, 7, 22);
        LocalDate base = LocalDate.of(2014, 12, 25);

        // 31 anos no total
        System.out.println(ChronoUnit.YEARS.between(birthday, base)); 
        // 377 meses no total
        System.out.println(ChronoUnit.MONTHS.between(birthday, base)); 
        // 11479 dias no total
        System.out.println(ChronoUnit.DAYS.between(birthday, base));

    }
}