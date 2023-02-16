public class Ej2_CyR_PlayG {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su DNI");
    int dni = scanner.nextInt();
        System.out.println("Ingrese su sueldo");
    double sueldo = scanner.nextInt();

        if(sueldo <= 20000){
        System.out.println("A usted le corresponde un aumento de: 20%");
        sueldo = sueldo * 1.20;
        System.out.println("Su sueldo final sera: $" + sueldo);
    } else if(sueldo > 20000 && sueldo <= 45000){
        System.out.println("A usted le corresponde un aumento de: 10%");
        sueldo = sueldo * 1.10;
        System.out.println("Su sueldo final sera: $" + sueldo);
    }else{
        System.out.println("A usted le corresponde un aumento de: 5%");
        sueldo = sueldo * 1.05;
        System.out.println("Su sueldo final sera: $" + sueldo);
    }

}
}
