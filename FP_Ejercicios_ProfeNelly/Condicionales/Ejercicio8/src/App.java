/*8. Escribe un algoritmo que muestre el resultado de elevar un número al cuadrado 
(si es par) o al cubo (si es impar)*/
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        int num, aux;
        System.out.print("Ingresar número: ");
        num=leer.nextInt();
        
        if(num%2==0){
            aux=num*num;
            System.out.println("Es par y se elevó al cuadrado. Resultado: "+aux);
        }else{
            aux=num*num*num;
            System.out.println("Es impar y se elevó al cubo. Resultado: "+aux);
        }
    }
}
