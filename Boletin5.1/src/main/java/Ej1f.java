import java.util.Scanner;

public class Ej1f {
    public static void main(String[] args){
       /*Subprograma que tenga de entrada un carácter y
        devuelva un valor Cierto si dicho carácter es una
        letra del alfabeto español y Falso si no lo es.
        */
        Scanner sc=new Scanner(System.in);
        char caracter;
        boolean letra=false;
        System.out.println("Escribe aqui el caracter a identificar");
        caracter=sc.next().charAt(0);
        if (!Character.isLetter(caracter)){
            letra=false;
            System.out.println("no es una letra");
        }else{
            letra=true;
            System.out.println("Es una letra");
        }

    }
}
