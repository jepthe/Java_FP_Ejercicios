/*1. Hacer un algoritmo que eleve y muestre el resultado de elevar un número al cuadrado, 
al cubo o a la cuarta potencia(SEGÚN INDIQUE EL USUARIO) 
utilizando el operador de multiplicación.*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int base, potencia;

        Scanner leer=new Scanner(System.in);//creamos la clase leer para capturar los datos
        System.out.print("Ingresar base: ");
        base=leer.nextInt();

        System.out.print("Ingresar potencia: ");
        potencia=leer.nextInt();

        switch (potencia)
        {
            case 2: base=base*base;
            break;
            case 3: base=base*base*base;
            break;
            case 4: base=base*base*base*base;
            
            default: System.out.println("ERROR: potencia no incluida");           
        }

        System.out.println("Resultado: "+base);
    }
}
