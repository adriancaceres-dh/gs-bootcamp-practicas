import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);
        System.out.println(LocalDate.of(2023,11,10));
    }


}