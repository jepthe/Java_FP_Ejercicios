/*1. Hacer un algoritmo que imprima N términos de una suma que comienza con un número inicial indicados por el 
usuario. Si el número inicial es el 20 y N vale 3, entonces debe imprimirse la suma: 20+21+22= 63. La suma debe 
imprimirse completa, tanto términos como resultado de la suma, tal como se mostró anteriormente.*/

import  java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        System.out.print("Número inicial: ");
        int numInicial=leer.nextInt();
        System.out.print("N términos: ");
        int n=leer.nextInt();
        int auxNum=0;
        String auxConcat="";
        for (int i = 0; i < n; i++) { 
            auxNum=auxNum+numInicial;//suma                   
            if (i != n-1) {               
                auxConcat=auxConcat+String.valueOf(numInicial)+"+";//concatena los términos                  
            }else{
                auxConcat=auxConcat+String.valueOf(numInicial)+"=";//concatena el último término
            }
            numInicial=numInicial+1;//aumento de uno en uno
        }
        System.out.println(auxConcat+auxNum);//concatena un str con un int
    }
}
