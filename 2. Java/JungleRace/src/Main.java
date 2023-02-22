import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        import java.util.*;

        public class JungleRace {
            public static void main(String[] args) {
                Map<Integer, Map<String, String>> smallCircuit = new TreeMap<>();
                Map<Integer,Map<String, String>>  mediumCircuit = new TreeMap<>();
                Map<Integer,Map<String, String>>  advancedCircuit = new TreeMap<>();
                Map<String, String> person = new HashMap<>();
                Scanner input = new Scanner(System.in);
                int action, age, actionCat, catNum, respuesta;
                String value;

                do {
                    String optionText = "Seleccione el numero de la accion a realizar \n\n" +
                            "1 - Inscribir participante \n" +
                            "2 - Mostrar Inscritos \n" +
                            "3 - Desinscribir participante \n";

                    String categoriesText = "Seleccione el numero de categoria de la Carrera de la Selva \n" +
                            "1 - Circuito chico \n" +
                            "2 - Circuito medio \n" +
                            "3 - Circuito Avanzado";


                    System.out.println(optionText);
                    action = input.nextInt();
                    System.out.println("-" + action + "-");
                    System.out.println(((Object) action).getClass().getSimpleName());

                    if (!(action == 1 || action == 2 || action == 3))
                        System.out.println("Seleccione un numero de accion correcto");

                    System.out.println(categoriesText);
                    actionCat = input.nextInt();
                    System.out.println("-" + action + "-");

                    if (!(actionCat == 1 || actionCat == 2 || actionCat == 3))
                        System.out.println("Seleccione un numero de categoria correcto");

                    switch (action) {
                        case 1:
                            System.out.println("Ingresa informacion de inscripcion");
                            input.nextLine();

                            person.clear();
                            System.out.println("Dni");
                            value = input.nextLine();
                            person.put("dni", value);

                            System.out.println("Nombre");
                            value = input.nextLine();
                            person.put("name", value);

                            System.out.println("Apellido");
                            value = input.nextLine();
                            person.put("lastName", value);

                            System.out.println("Edad");
                            value = input.nextLine();
                            age = Integer.parseInt(value);
                            person.put("age", value);

                            System.out.println("Celular");
                            value = input.nextLine();
                            person.put("cellPhone", value);

                            System.out.println("Numero emergencia");
                            value = input.nextLine();
                            person.put("emergencyNumber", value);

                            System.out.println("Grupo sanguineo");
                            value = input.nextLine();
                            person.put("bloodGroup", value);

                            System.out.println(person);
                            System.out.println(smallCircuit);

                            for (Map val : smallCircuit.values()) {
                                System.out.println("person" + person.get("dni"));
                                System.out.println("val" + val.get("dni"));
                                if (person.get("dni") == val.get("dni")) {
                                    System.out.println("Participante previamente inscrito");
                                }
                            }

                            switch (actionCat) {
                                case 1:
                                    smallCircuit.put(smallCircuit.size() + 1, person);
                                    System.out.println(smallCircuit);
                                    if (age < 18) {
                                        System.out.println("El monto a abonar es 1300");
                                    } else {
                                        System.out.println("El monto a abonar es 1500");
                                    }
                                    break;

                                case 2:
                                    mediumCircuit.put(mediumCircuit.size() + 1, person);
                                    if (age < 18) {
                                        System.out.println("El monto a abonar es 2000");
                                    } else {
                                        System.out.println("El monto a abonar es 2300");
                                    }
                                    break;

                                case 3:
                                    if (age < 18) {
                                        System.out.println("El deportista es menor de 18 a;os por lo que no cumple con el minimo de edad");
                                    } else {
                                        advancedCircuit.put(advancedCircuit.size() + 1, person);
                                        System.out.println("El monto a abonar es 2800");
                                    }
                                    break;
                            }
                            break;

                        case 2:
                            switch (actionCat) {
                                case 1:
                                    System.out.println(smallCircuit);
                                    break;
                                case 2:
                                    System.out.println(mediumCircuit);
                                case 3:
                                    System.out.println(mediumCircuit);
                            }
                            break;

                        case 3:
                            System.out.println("Ingrese numero de inscripcion de participante a eliminar");
                            input.nextLine();
                            catNum = input.nextInt();
                            System.out.println(catNum);
                            switch (actionCat) {
                                case 1:
                                    smallCircuit.remove(catNum);
                                    System.out.println("Se Elimino participante " + actionCat);
                                    break;
                                case 2:
                                    mediumCircuit.remove(catNum);
                                    System.out.println("Se Elimino participante " + actionCat);
                                    break;
                                case 3:
                                    advancedCircuit.remove(catNum);
                                    System.out.println("Se Elimino participante " + actionCat);
                                    break;
                            }
                            break;
                    }
                    System.out.println("Desea continuar operando? \n" +
                            "1 - Si \n" +
                            "2 - No \n" );
                    respuesta = input.nextInt();
                } while (respuesta != 2);
            }

        }
    }
}