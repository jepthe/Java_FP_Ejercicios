/*5. Escribe un algoritmo que pida el año actual y un año cualquiera y que escriba 
cuántos años han pasado desde ese  año o cuántos años faltan para llegar a ese año.*/
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        int añoActual, añoCualquiera, faltan=0, pasado=0;

        System.out.print("Año actual: ");
        añoActual=leer.nextInt();
        System.out.print("Año cualquiera: ");
        añoCualquiera=leer.nextInt();
        
        if(añoActual<añoCualquiera){
            faltan=añoCualquiera-añoActual;
            System.out.println("Faltan "+faltan+" años para llegar a "+añoCualquiera);
        }else{
            pasado=añoActual-añoCualquiera;
            System.out.println("Han pasado "+pasado+" años desde el año "+añoCualquiera);
        }
    }
}
