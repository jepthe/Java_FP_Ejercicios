/*14. Escribe un algoritmo que permita calcular e imprimir el promedio de 
Nathalia Juárez. Las calificaciones se ingresan con letra, donde ‘A’ vale 4 puntos, 
’B’ vale 3, ‘C’ vale 2. Así que si obtuvo una ‘A’ en un curso de tres créditos, su 
calificación sería 4*3=12, mientras que si obtuvo una ‘C’ en un curso de cuatro 
créditos sería 2*4=8. Nathalia cursó las siguientes materias: 
Física, Álgebra y Programación.*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Scanner leer=new Scanner(System.in);
        String calFis="", calAlg="", calProg="", nomFis="Fisica", nomAlg="Algebra", nomProg="Programacion";
        int credFis=0, credAlg=0, credProg=0, auxF=0, auxA=0, auxP=0, califGeneral;

        System.out.println("A=4         B=3         C=2");
        System.out.println("Ingresar calificaciónes y créditos (letra, numero)\n");
              
        System.out.print("--Física--");
        calFis=materia(calFis); 
        
        credFis=creditos(credFis);
        
        System.out.print("\n--Álgebra--");
        calAlg=materia(calAlg);
        credAlg=creditos(credAlg);
        
        System.out.print("\n--Programación--");
        calProg=materia(calProg);
        credProg=creditos(credProg);
        
        auxF=operacion(calFis, credFis, nomFis);
        auxA=operacion(calAlg, credAlg, nomAlg);
        auxA=operacion(calProg, credProg, nomProg);
        califGeneral= (auxF+auxA+auxP)/3;

        System.out.println("\nCalificación General: "+califGeneral);
                            
    }

    private static int operacion(String califMateria, int credMateria, String nomMateria) {
        int A=4, B=3, C=2, operacion;

        if (califMateria.equalsIgnoreCase("A")) {//comparamos el str fisica con el valor de A convirtidolo en str
            System.out.println("\nCalificación de la materia de "+nomMateria+": "+A*credMateria);
            operacion=A*credMateria;
        } else if (califMateria.equalsIgnoreCase("B")) {
            System.out.println("Calificación de la materia de "+nomMateria+": "+B*credMateria);
            operacion=B*credMateria;
        } else if (califMateria.equalsIgnoreCase("C")){
            System.out.println("Calificación de la materia de "+nomMateria+": "+C*credMateria);
            operacion=C*credMateria;
        } else{
            operacion=0;
            System.out.println("Error en letra de la materia de "+nomMateria);
        }
 
        return operacion;
    }

    public static String materia(String materia) {
        Scanner leer=new Scanner(System.in);
        System.out.print("\nCalificación: ");
        materia=leer.nextLine();
        return materia;
    }
    public static Integer creditos(int creditos) {
        Scanner leer=new Scanner(System.in);
        System.out.print("Créditos: ");
        creditos=leer.nextInt();
        return creditos;
    }

}
