import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);
        LocalDate localDate1 = LocalDate.of(2022,12,31);
        System.out.println(localDate1);

        // en un rago, desde - hasta
        if( localDate.isBefore(localDate1) ) {
            System.out.println("Es anterior");
        } else {
            System.out.println("No es anterior");
        }

    }
}