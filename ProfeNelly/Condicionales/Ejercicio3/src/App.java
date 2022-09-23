/*3. Un alumno puede ser acreedor a un descuento en su próxima inscripción de acuerdo al 
siguiente criterio: Se dará un descuento de 1.5% por cada año de edad que rebase la 
mayoría de edad sobre el monto de la inscripción. Por ejemplo, alguien con 20 años 
recibirá un descuento de 3% sobre el monto de la inscripción, alguien con 21 años 
recibirá un descuento de 4.5%. Este descuento aplicará solamente para la inscripción 
de los semestres 2 al 9. Hacer un algoritmo para mostrar lo que finalmente deberá pagar 
el alumno en su próxima inscripción.*/
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner leer=new Scanner(System.in);

        double descuento=1.5, aux;
        int edad, semestre, añosdemas;

        System.out.print("Edad: ");
        edad=leer.nextInt();
        System.out.print("Semestre: ");
        semestre=leer.nextInt();

        if(edad>18){
            añosdemas=edad-18;
            aux=descuento;
            while(añosdemas>0){
                descuento=descuento+aux;
                añosdemas=añosdemas-1;
            }
            if(semestre>1 && semestre<10){
                System.out.println("Es acreedor al descuento de "+descuento+"%");
            }
        }else{
            System.out.println("No rebasa la mayoría de edad");
        }
    }
}
