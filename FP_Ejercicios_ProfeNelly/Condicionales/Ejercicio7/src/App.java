/*7. Escribe un algoritmo que pida dos números y que muestre cuál es el menor 
y cuál el mayor o bien que escriba que son iguales.*/
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        int num1, num2;
        System.out.print("Primer número: ");
        num1=leer.nextInt();
        System.out.print("Segundo número: ");
        num2=leer.nextInt();

        if(num1<num2){
            System.out.println("El primer número es menor\nEl segundo es mayor");
        }else if(num1>num2){
            System.out.println("El primer número es mayor\nEl segundo es menor");
        }else{
            System.out.println("Son iguales");
        }
    }
}
