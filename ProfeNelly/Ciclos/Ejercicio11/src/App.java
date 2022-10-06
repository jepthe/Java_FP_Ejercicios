/*11.  Hacer un algoritmo que imprima la siguiente sucesión de números:
0,1,1,2,3,5,8,13,21,34,55,89,144,233,377...  
 Observe  que  la  sucesión  comienza con los números 0 y 1, y a partir de éstos, 
 los siguientes números se forman con la suma de los dos anteriores. 
 El usuario debe ingresar la cantidad de valores que quiere ver, por ejemplo 
 si el usuario indica que quiere ver 5 números, solo se imprimiría la 
 sucesión 0,1,1,2,3*/
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        int a=0, b=1, c=0;
        System.out.print("Indicar cantidad de numeros visibles: ");
        int n=leer.nextInt();//numero de iteraciones

        for (int i = 0; i < n-1; i++) {
            if (a==0 && b==1 && c==0) {//condiciona primera iteracion para que sea 0
                System.out.print("0");
            }
            a=b;
            b=c;
            c=a+b;
            System.out.print(", "+c);         
        }
    }
}
