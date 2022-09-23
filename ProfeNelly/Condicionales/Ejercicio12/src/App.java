/*12. Una compañía dedicada al alquiler de automóviles cobra $800 hasta un máximo de 300 km 
de distancia recorrida. Para más de 300 km y hasta 1000 km, cobra $800 más un monto 
adicional de $15 por cada kilómetro en exceso sobre 300. Para más de 1000 km cobra $800 
más un monto adicional de $13.50 por cada kilómetro en exceso sobre 300. Escribe un 
algoritmo que determine el monto a pagar por el alquiler.*/
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        int km;

        System.out.print("Ingresar km recorridos: ");
        km=leer.nextInt();

        if(km-300 >= 1){//para saber si se excedio en km
            if(km>300 && km<=1000){//entre 300 y 1000 km
                System.out.println("Monto total: $"+(((km-300)*15)+800)+" a $15 por km excedido");
            }else{// mas de 1000 km
                System.out.println("Monto total: $"+(((km-300)*13.50)+800)+" a $13.50 por km excedido");
            }
        }else{
            System.out.println("Monto total: $800. No hay excedentes");
        }

    }
}
