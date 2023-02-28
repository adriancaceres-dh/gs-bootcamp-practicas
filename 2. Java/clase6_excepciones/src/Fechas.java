import java.time.LocalDate;

public class Fechas {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = localDate.of(2022,12,01);
        if(localDate.isBefore(localDate1)){
            System.out.println("Es anterior.");
        }else{
            System.out.println("No es anterior.");
        }

    }

}
