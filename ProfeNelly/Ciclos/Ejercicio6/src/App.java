/*6. Forzar al usuario a ingresar dos valores mayores que cero, usando ciclos. Mostrar el mínimo común divisor (que 
no sea 1) y el máximo común divisor de los dos números dados por el usuario. Por ejemplo, si consideramos los 
números 18 y 6, el mínimo común divisor de ellos es 2 y el máximo común divisor es 6. Si consideramos el 7 y el 
21, el mínimo común divisor de ellos es 7 y el máximo común divisor es también 7. Si consideramos el 13 y el 7, 
no existe un mínimo común divisor de ellos, ni un máximo común divisor*/

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        int valor1, valor2;
        
        do {
        System.out.println("Ingresar dos valores mayores que cero");
        System.out.print("Primer valor: ");
        valor1=leer.nextInt();
        System.out.print("Segundo valor: ");
        valor2=leer.nextInt();           
        } while (valor1<=0 && valor2<=0);//forzamos que los valores sean mayores que cero

        int mod1, mod2, multi;
        String strDivisores="";
        //condicionamos a que los dos valores vayan a la par de manera que si uno revasa el divisor(i+2) ya no haga más diviciones
        for (int i = 0; i < valor1 && i<valor2; i++) {
            //System.out.println(valor1+"  : "+valor2);
            //System.out.println("i: "+(i+2));
             mod1=valor1%(i+2);//sacamos el modulo(residuo)
             mod2=valor2%(i+2);          
             //System.out.println("aux1: "+aux1);
             //System.out.println("aux2: "+aux2);

             /*si los residuos son 0 (la div es exacta) se podrá hacer la div para cambiar los valores,
               si no, avanza la i para probar con la siguiente iteración*/
             if (mod1==0 && mod2==0) {       
                 valor1=valor1/(i+2);//cambiamos los valores (se van haciendo más chicos)
                 valor2=valor2/(i+2);
                 //System.out.println("v1: "+valor1);
                 //System.out.println("v2: "+valor2);
                 strDivisores=strDivisores+(i+2);//concatenamos los divisores
                 i=i-1;//intenta dividir nuevamente con el mismo número en la siguiente iteración
             }
        }

        if (strDivisores.equals("")) {//si no hubo ningún divisor
            System.out.println("No existe un mínimo ni un máximo común divisor");
        } else {
            //es obvio que la primera concatenación sería el valor minimo porque i empieza a partir de 2
            System.out.println("Mínimo común divisor: "+strDivisores.charAt(0));
            //indicamos el último lugar de la str y con el length depende de cuantos divisores se concatenaron (tomará el último)
            //System.out.println("min: "+Integer.valueOf(String.valueOf(strDivisores.charAt(0))));
            //System.out.println("max: "+Integer.valueOf(String.valueOf(strDivisores.charAt(strDivisores.length()-1))));
            
            //multiplicamos el min con el max para sacar el máximo común divisor//cada valor lo pasamos de char a str y despues a int
            multi=Integer.valueOf(Integer.valueOf(String.valueOf(strDivisores.charAt(0)))*Integer.valueOf(String.valueOf(strDivisores.charAt(strDivisores.length()-1))));
            System.out.println("Máximo común divisor: "+multi);
        }       
    }
}
