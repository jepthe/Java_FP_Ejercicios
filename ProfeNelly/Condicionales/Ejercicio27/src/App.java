
/*27. Hacer un algoritmo que aplique el siguiente procedimiento de cifrado para un valor de cuatro cifras: 

a) Ingresar un valor de cuatro cifras
b) A cada cifra del valor debe sumarse 7
c) De cada suma resultante en el paso anterior obtener el residuo entero de su división entre 10 (por ejemplo 
   si la suma resulta 15, el residuo entero entre 10 sería 5)
d) Intercambiar los valores resultantes, el primero con el tercero y el segundo con el cuarto
e) Integrar los valores resultantes ya intercambiados, en una sola variable y mostrarla, ése será el valor cifrado.

Ejemplo, suponiendo que el valor ingresado fue 7392

        7           3            9            2
b)   14(7+7)     10(3+7)      16(9+7)      9(2+7)
c)      4           0            6            9
d)      6           9            4            0
e)                       6940

*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        
        System.out.print("Ingresar un valor de cuatro cifras: ");
        String numStr=leer.nextLine();

        
        if (numStr.length()==4) {//limita a cuatro cifras
            String auxConcat="";
            for (int i = 0; i < numStr.length(); i++) {                                
                /*OJO: no se puede pasar de char a int directamente porque nos daría su valor ASCII,
                  primero debe ser de char a string y luego de string a int*/
                //String numCharToStr=String.valueOf(numStr.charAt(i));
                //int entero=Integer.valueOf(numCharToStr);

               //es mas facil usando el metodo Character.getNumericValue(char) que es de char a int
                
                int aux=Character.getNumericValue(numStr.charAt(i));
              /*int sum=aux+7;
                System.out.println("sumando 7 por cifra: "+sum);   
                sum=sum%10;
                int res=sum;
                System.out.println("residuo: "+res);
                
                String concatenar=String.valueOf(res);
                auxConcat=auxConcat + concatenar;
                System.out.println("concatenar: "+auxConcat);*/    
                int operacion=(aux+7)%10;//
                String concatenar=String.valueOf(operacion);
                auxConcat=auxConcat + concatenar;       
            }
            String invertido="";
            for (int i = 0; i < auxConcat.length(); i++) {
                if (i==0) {
                    String n=String.valueOf(auxConcat.charAt(i+2));
                    invertido=invertido+n;
                } else if(i==1){
                    String n=String.valueOf(auxConcat.charAt(i+2));
                    invertido=invertido+n;
                } else if(i==2){
                    String n=String.valueOf(auxConcat.charAt(i-2));
                    invertido=invertido+n;
                } else{
                    String n=String.valueOf(auxConcat.charAt(i-2));
                    invertido=invertido+n;
                }
            }
            System.out.println("invertido: "+invertido);
            
        } else {
            System.out.println("No es un número de cuatro cifras");
        }
    }
}
