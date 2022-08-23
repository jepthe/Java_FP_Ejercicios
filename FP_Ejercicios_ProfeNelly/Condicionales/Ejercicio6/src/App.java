import java.util.Scanner;

/*6. Escribe un algoritmo que pida dos números enteros y que calcule y muestre el 
cociente de su división, escribiendo si la división es exacta o no.*/
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        int dividendo, divisor, cociente, aux;

        System.out.print("Dividendo: ");
        dividendo=leer.nextInt();
        System.out.print("Divisor: ");
        divisor=leer.nextInt();

        aux=dividendo%divisor;
        cociente=dividendo/divisor;
        if(aux==0){
            System.out.println("El cociente es: "+cociente+". Es exacto");
        }else{
            System.out.println("El cociente es: "+cociente+". No es exacto");
        }  
    }
}
