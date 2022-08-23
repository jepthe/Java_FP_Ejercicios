/*9. Escribe un algoritmo que dados dos números, muestre si el primer número ingresado 
es múltiplo del segundo.*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        int num1, num2, aux=1;
        System.out.print("Primer numero: ");
        num1=leer.nextInt();
        System.out.print("Segundo numero: ");
        num2=leer.nextInt();

        if(num1>=num2){//asegura que posiblemente esté dentro del rango del segundo numero
            while(num2*aux != num1){//busca si es multiplo               
                if(num2*aux>num1){//si se pasa, cancelamos el ciclo
                    System.out.println("No es multiplo");
                    break;
                } 
                aux=aux+1;              
            }
            if(num2*aux == num1){
                System.out.println("Es multiplo");
            }
            
        }else{
            System.out.println("no puede ser multiplo porque es menor el primer numero");
        }

    }
}
