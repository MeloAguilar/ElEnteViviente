import java.util.Scanner;

public class Ej1h {
    public static void main(String[] args) {
        /*Subprograma para determinar
        cuántas cifras posee un número entero.
         */
        //Se declara la variable para el escaner
        Scanner sc = new Scanner(System.in);
        //Se declara la variable que extraerá la cadena del numero
        String num;
        //Se declara la variable que realizará el conteo de caracteres
        int i;
        //Se pide al usuario que introduzca el numero
        System.out.println("Escriba el número aquí: ");
        num = sc.next();
        //Se revisa la longitud del número
        for (i = 0; i < num.length(); i++) {
            //Se muestra la cantidad de caracteres en pantalla
        }
        System.out.println("El número " + num + " tiene " + i + " cifras");

    }
}
