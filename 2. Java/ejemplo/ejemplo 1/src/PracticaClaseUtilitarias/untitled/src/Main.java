import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.of(2023,06,19);

        // en un rango, desde - hasta
        if (localDate.isBefore(localDate1)){
            System.out.println("Es anterior");
        } else {
            System.out.println("No es anterior");
        }
    }
}