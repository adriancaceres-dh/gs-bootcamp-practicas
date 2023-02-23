import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.of(2022, 12, 31);
        System.out.println(localDate);
        System.out.println(localDate.of(2022, 12, 31));

          
}}