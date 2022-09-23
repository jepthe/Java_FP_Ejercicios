//formar 2 sílabas combinando consonates con vocales
public class App {
    public static void main(String[] args) throws Exception {
        String consonantes="bcdfghjklmnñpqrstvwxyz";
        String vocales="aeiou";
        int cont=0;
        
        for (int i = 0; i < consonantes.length(); i++) {
            
            for (int j = 0; j < vocales.length(); j++) {
                //ubicando los caracteres de cada str con .charAt(int) luego para convertir los char a str con String.valueOf(char) y concatenarlos
                String silaba1=String.valueOf(consonantes.charAt(i))+String.valueOf(vocales.charAt(j));//formando silaba1
                System.out.println(" ");
                for (int k = 0; k < consonantes.length(); k++) {                  
                    for (int k2 = 0; k2 < vocales.length(); k2++) {                  
                        String silaba2=String.valueOf(consonantes.charAt(k))+String.valueOf(vocales.charAt(k2));//formando silaba2
                        cont=cont+1;
                        System.out.print(" "+cont+"-"+(silaba1+silaba2));
                    }
                }
            }
        }
    }
}
//NOTA: al maximizar la ventana del terminal pareciera ser que faltan algunas palabras, pero no.
//tambien si lo imprimimos de forma vertical, la terminal no es suficiente para mostrar todos