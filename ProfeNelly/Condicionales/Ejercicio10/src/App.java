/*10. Escribe un algoritmo que calcule y muestre el monto total a pagar por el servicio de agua en 
una vivienda, dado el número de litros gastados, siendo el sistema de cobro de la siguiente manera: 
- la cuota fija mensual es de $60, que incluye los primeros 50 litros 
  (Se paga la cuota fija aun cuando no haya gasto de agua)
- cada litro entre 51 y 200 litros se cobra a $0.5 (
- cada litro a partir de 201 litros se cobra a $0.8 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        int litros;

        System.out.print("Ingresar litros gastados: ");
        litros=leer.nextInt();

        if(litros-50 >= 1){//para saber cuantos litros de más
            if(litros>50 && litros<=200){
                System.out.println("Monto total: $"+(((litros-50)*0.5)+60)+" Se cobró el litro excedente a $0.5");
            }else{
                System.out.println("Monto total: $"+(((litros-50)*0.8)+60)+" Se cobró el litro excedente a $0.8");
            }
        }else{
            System.out.println("Monto total: $60. No hay excedentes");
        }
    }
}
