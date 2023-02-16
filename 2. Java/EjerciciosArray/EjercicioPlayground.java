public class EjercicioPlayground {
    public static void main(String[] args) {


        String[]ciudades={"Londres","Madrid","Nueva Jork","Buenos Aires","Asuncion","Sao Pablo","Lima","Santiago de Chile","Lisboa","Tokio"};
        int[][]temperaturas={{-2,-3,-8,4,6,5,0,-7,-1,-10},{33,32,27,37,42,43,39,26,31,35}};

        int mayor = temperaturas[1][0];
        int menor = temperaturas[0][0];
        int posicionMayor=0;
        int posicionMenor=0;

        for (int i=0;i<temperaturas.length;i++){


            for (int j=0;j<temperaturas[i].length;j++){
                if(temperaturas[i][j]>mayor){
                    mayor=temperaturas[i][j];
                    posicionMayor=j;
                }
                if (temperaturas[i][j]<menor) {
                    menor=temperaturas[i][j];
                    posicionMenor=j;
                }
            }

            }
        System.out.println("La temperatura mayor es de "+mayor+" de la ciudad de "+ciudades[posicionMayor]);
        System.out.println("La temperatura menor es de "+menor+" de la ciudad de "+ciudades[posicionMenor]);
        }
    }

