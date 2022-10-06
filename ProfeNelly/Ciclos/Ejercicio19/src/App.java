/*19. (Hasta ver tema de cadenas y caracteres en java). Hacer un programa con lo siguiente: un menú con el nombre 
de figuras de donde se pueda elegir la que se desea ver en ese momento. El usuario indicará en un inicio el 
caracter con el que desea ver la figura. Dentro del menú debe haber una opción para cambiar el caracter
cuando se deseé. Después de imprimir una figura, volver al menú. El programa continua hasta que se elija la 
opción terminar del menú. Utiliza ‘\n’ para imprimir el caracter (*) en renglones sucesivos.
1) Romboide
2) Piramide
3) Piramide (volteada hacia abajo)
4) Piramide (volteada hacia la izquiersa) 
5) Piramide (volteada hacia la derecha)
6) Piramides encimadas
7) Punta de flecha
*/
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        int n=0;
        String c="";
        do {
            System.out.println("\n\n\n");
            System.out.print("MENU:\n1) Romboide\n2) Piramide\n3) Piramide (volteada hacia abajo)\n4) Piramide (volteada hacia la izquierda)\n5) Piramide (volteada hacia la derecha)\n6) Piramides encimadas\n7) Punta de flecha\n\nElige una opcion: ");
            n=leer.nextInt();
            if (n!=0) {//para no volver a preguntar si elige cero
                System.out.print("Elegir el caracter: ");
                c=leer.next();
            }
            int mitad=0, altura=0;
            String auxStr="";
            switch (n) {
                case 1:
                    System.out.println("figura 1");
                    System.out.println("caracter "+c);
                    break;
                case 2:
                    mitad=5;//centro de la figura, sirve para los espacios
                    altura=5;//numero de saltos
                    auxStr="";
                    for (int i = 0; i < altura; i++) {//salto de linea
                        for (int j = 0; j < mitad; j++) {//imprime espacios
                            System.out.print("   ");                           
                        }
                        if (i==0) {
                            System.out.println(" "+c);
                            auxStr=auxStr+" "+c;
                            mitad=mitad-1;//reduce espacios
                        }else{
                        auxStr=auxStr+"  "+c+"  "+c;
                        System.out.println(auxStr);
                        mitad=mitad-1;//reduce espacios
                        }
                    }
                    break;
                case 0:
                    System.out.println("Terminado");
                    break;

                default:
                System.out.println("Eleccion incorrecta");
                    break;
            }
        } while (n!=0);
        
    }
}
