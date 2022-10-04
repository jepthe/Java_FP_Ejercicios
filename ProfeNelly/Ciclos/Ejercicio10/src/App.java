/*10.  Hacer un algoritmo que calcule e imprima el factorial de N. N debe ser ingresado por el usuario y siempre será 
un valor mínimo de 0. El factorial de un número resulta de multiplicar ese número por los valores inferiores a él, 
hasta  llegar  a  1.  Por  ejemplo  el  factorial  de  7  es  el  resultado  de  7x6x5x4x3x2x1.  Por  definición  matemática  el 
factorial de 0 es 1.*/
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingresar N numero: ");
        int n=leer.nextInt();
        int aux=n;
        for (int i = n; i > 0; i--) {
            if ((i-1)==0) {
                System.out.println("i-1: "+(i-1));
                break;
            } else {
                aux=aux*(i-1);
            }              
        }
        if (n==0) {
            System.out.println("Por  definición  matemática  el factorial de 0 es 1");
        } else {
            System.out.println("Factorial de N es: "+aux+"");
        }
    }
}
