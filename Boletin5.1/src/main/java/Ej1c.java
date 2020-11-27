import java.sql.SQLOutput;
import java.util.Scanner;

public class Ej1c {
    public static void main(String[] args) {
        /*Subprograma para calcular
         si un año es o no bisiesto.
         */
        Scanner sc = new Scanner(System.in);
        int año;
        System.out.println("Escribe el año aquí: ");
        año = sc.nextInt();
        if (año % 100 == 0 || año % 400 == 0) {
            if (año < 2020) {
                System.out.println("El año " + año + " fue bisiesto");
            } else if (año > 2020) {
                System.out.println("El año " + año + " será bisiesto");
            }
        } else {
            System.out.println("El año introducido no es bisiesto");
        }sc.close();
    }
}
