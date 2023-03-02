import java.time.LocalDate;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        LocalDate localdate1 = LocalDate.of(2022, 12, 31);
        System.out.println(localDate);
        //System.out.println(LocalDate.of(2022,12,31));

        if ( localDate.isBefore(localdate1)) {
            System.out.println("Es anterior");
        } else {
            System.out.println("No es anterior");
        }
    }
}