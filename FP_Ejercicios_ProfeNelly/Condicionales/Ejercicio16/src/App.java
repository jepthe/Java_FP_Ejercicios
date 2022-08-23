
/*16. Hacer un algoritmo para escribir un programa que devuelva el nombre del día de la 
semana siguiendo un orden de correspondencia (1, 2, 3...7) para (domingo, lunes, martes, 
miércoles... sábado) respectivamente.*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.print("Escribe el número que corresponde al día de la semana: ");
        int num = leer.nextInt();
        switch (num) {
            case 1:
                System.out.println("El día " + num + " es Domingo");
                break;
            case 2:
                System.out.println("El día " + num + " es Lunes");
                break;
            case 3:
                System.out.println("El día " + num + " es Martes");
                break;
            case 4:
                System.out.println("El día " + num + " es Miercoles");
                break;
            case 5:
                System.out.println("El día " + num + " es Jueves");
                break;
            case 6:
                System.out.println("El día " + num + " es Viernes");
                break;
            case 7:
                System.out.println("El día " + num + " es Sabado");
                break;

            default:
                break;
        }
    }
}
