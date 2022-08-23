/*15. Una empresa clasifica a sus empleados en dos grupos de empleados, los del grupo ‘A’ son 
aquellos de base y desea darles un aumento de sueldo siguiendo el siguiente criterio: 
si la plaza del empleado es de 40 horas, su sueldo será incrementado en $500. 
Adicionalmente si el empleado es mujer o es mayor de 65 años y tiene en la empresa más de 30 años, 
su sueldo se incrementará en $800.00. Para los empleados del grupo ‘B’ (los empleados interinos) 
si son mayores de 18 años y tienen más de 85 puntos en una prueba presentada entonces serán 
contratados en la modalidad de base. Escribe un algoritmo para determinar el sueldo final 
en el caso de los empleados del grupo ‘A’ y si será o no contratado en el caso de los del grupo ‘B’.*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        int sueldo;
        String sex="";
        System.out.println("Ingresar datos de un empleado del grupo A: ");
        System.out.print("Sexo (letra mayúscula): ");
        sex=leer.nextLine();//si paso un poco abajo esta lectura, no da opción de leerla (¿?)
        System.out.print("Horas : ");
        int hrs=leer.nextInt();       
        System.out.print("Edad: ");
        int edadA=leer.nextInt();
        System.out.print("Antigüedad: ");
        int Antig=leer.nextInt();
        

        System.out.println("Ingresar datos de un empleado del grupo B: ");
        System.out.print("Edad: ");
        int edadB=leer.nextInt();
        System.out.print("Calificación de la prueba: ");
        int calif=leer.nextInt();

        if (hrs==40) {
            sueldo=500;
            if (sex.equalsIgnoreCase("M") || edadA>65 && Antig>30) {
                sueldo=sueldo+800;
                System.out.println("Sueldo del trabajador A: $"+sueldo);
            } else {
                System.out.println("Sueldo del trabajador A: $"+sueldo);
            }
        } else {
            System.out.println("El trabajador A no tiene incremento");
        }

        if (edadB>18 && calif>85) {
            System.out.println("\nSerá contratado el trabajador A");
        } else {
            System.out.println("No será contratado el trabajador B");
        }

    }
}
