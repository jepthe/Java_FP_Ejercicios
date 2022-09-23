/*22. Diseñe una pequeña calculadora que al digitar un caracter realice una operación 
específica: si el caracter es ‘+’ operación es la suma, si es ‘-‘ se restará, 
si es ‘*’ se multiplicará y si es ‘/’ se dividirá. Si el usuario ha escrito un código 
inválido, mostrar un mensaje de error. Los operandos se considerarán según el orden en 
que se introdujeron los números y pueden ser números con punto decimal. Considerar como 
error la división por cero.*/
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);

        System.out.print("Caracter: ");
        String caracter=leer.nextLine();
        System.out.print("Primer número: ");
        int num1=leer.nextInt();
        System.out.print("Segundo número: ");
        int num2=leer.nextInt();

       switch (caracter) {
           case "+":
               System.out.println("Resultado: "+(num1+num2));
               break;
            case "-":
                System.out.println("Resultado: "+(num1-num2));
                break;
            case "*":
                System.out.println("Resultado: "+(num1*num2));
                break;
            case "/":
                if (num2!=0) {
                    System.out.println("Resultado: "+(num1/num2));
                }else{
                    System.out.println("Error al dividir entre 0");
                }               
                break;
           default:
                System.out.println("Error de caracter");
               break;
       }
    }
}
