/*4. Hacer un algoritmo que sea capaz de calcular y mostrar el área de un triángulo y un 
círculo, de acuerdo a los datos de entrada proporcionados por el usuario. 
El algoritmo debe iniciar preguntando al usuario con qué figura trabajará y a
continuación preguntar los datos para realizar el cálculo y mostrar los resultados. 
Debe validarse y mostrar mensaje de error en el caso de que los datos proporcionados 
sean negativos.*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        double base=0, altura=0, radio=0, figura;    
        
        System.out.print("\n 1. Triángulo\n 2. Círculo\n Seleccionar figura: ");
        figura=leer.nextInt();

        if(figura==1){
            System.out.print("Ingresar base: ");
            base=leer.nextInt();
            System.out.print("Ingresar altura: ");
            altura=leer.nextInt();
            System.out.println("Área del triángulo: "+(base*altura)/2);
        }else if(figura==2){
            System.out.print("Ingresar el radio: ");
            radio=leer.nextInt();
            System.out.println("Área del círculo: "+3.1415*(radio*radio));
        }else{
            System.out.println("Error de selección");         
        }
    }
}
