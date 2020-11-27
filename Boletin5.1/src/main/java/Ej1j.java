import java.util.Scanner;

public class Ej1j {
    public static void main(String[] args) {
        /*Subprograma para calcular
        si un número es o no primo.
         */
        int num;
        boolean primo = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número aquí: ");
        num = sc.nextInt();
            for (int i = 2; i < num; i++) {
                if(num % i == 0) {
                    primo = false;
                    break;
                }
        }if (primo) {
            System.out.println("El número introducido es primo");
        } else
            System.out.println("El número no es primo");

    }
}
