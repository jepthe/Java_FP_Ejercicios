/*11. Escribe un algoritmo que lea un número de 3 cifras (validar que lo sea, en caso contrario 
mostrar mensaje de error y terminar el algoritmo) y determine si es o no palíndromo. 
Un número es palíndromo si es igual al revés y como se dio originalmente. 
Por ejemplo: 565 es palíndromo, 449 no lo es.*/
import java.util.Scanner;       

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        
        System.out.print("Ingresar numero: ");
        //int num=leer.nextInt();
        //String numStr=Integer.toString(num);
        String numStr=leer.nextLine();//el numero se guarda en str, ejemplo el 000
        String charToStr, palindromo="";
        char caracter;
        
        if (numStr.length()==3) { //no revasa las 3 cifras         
            for (int i = numStr.length(); i > 0; i--) {//numStr=3 
                caracter=numStr.charAt(i-1);// -1 para que inicie del 2 al 0 (3 posiciones) 
                charToStr=String.valueOf(caracter);//convertimos el char en str
                palindromo=palindromo+charToStr;//añadimos los charToStr al str               
            }
            if (numStr.equalsIgnoreCase(palindromo)) {
                System.out.println(palindromo+" Es palíndromo");
            } else {
                System.out.println(palindromo+" No es palíndromo");
            }
        } else {
            System.out.println("Error. No es un numero de 3 sifras");
        }
    }
}
