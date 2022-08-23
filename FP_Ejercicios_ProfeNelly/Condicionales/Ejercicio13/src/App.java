/*13. Los empleados de una empresa deben pagar cierto porcentaje de impuesto sobre su 
salario de acuerdo a sus percepciones. Para el cálculo del impuesto se considera lo siguiente:
    Salario                 Impuesto
Hasta $2,000        0%
$2,001 a $5,000     2% sobre la cantidad que excede $2,000
Más de $5,000       $500 más 5% sobre la cantidad que excede $5,000

Escribir un algoritmo que imprima el salario antes de impuestos, el importe ($) 
que se debe pagar por impuestos y el salario neto (después de restar impuestos).*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        int salario;

        System.out.print("Ingresar salario: ");
        salario=leer.nextInt();

        System.out.println("Salario antes de impuesto: $"+salario);

        if(salario-2000 >= 1){//para saber cuanto se se excede 
            if(salario>2000 && salario<=5000){//entre 2000 y 5000 
                System.out.println("Impuesto: $"+((salario-2000)*0.02));
                System.out.println("Salario Neto: "+(salario-(salario-2000)*0.02));
            }else{// mas de 5000 
                System.out.println("Impuesto: $"+(500+((salario-2000)*0.05)));
                System.out.println("Salario Neto: "+(salario-(500+((salario-2000)*0.05))));
            }
        }else{
            System.out.println("Impuesto: $0");
            System.out.println("Salario Neto: $"+salario);
        }
    }
}
