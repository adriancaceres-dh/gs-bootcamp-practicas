import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Main {
    public static void main(String[] args) {
    LocalDate localDate= LocalDate.now();

        System.out.println(localDate);
        LocalDate localDate1 = localDate.of(2022,12,31);
        System.out.println(localDate.of(2022,12,31));

        if (localDate1.isBefore(localDate)){
            System.out.println("Es posterior");
        }else {
            System.out.println("Es anterior");
        }
    }
}