/*2. Hacer un algoritmo que solicite un valor numérico y 
arroje el mensaje de si el valor fue positivo, negativo o cero.*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leer=new Scanner(System.in);
        int n;

        System.out.println("Ingresar número: ");
        n=leer.nextInt();

        if(n<0){
            System.out.println("Es negativo");
        }else if(n>0){
            System.out.println("Es positivo");
        }else{
            System.out.println("Es cero");
        }
    }
}
