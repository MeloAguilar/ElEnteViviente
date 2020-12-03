import java.util.Scanner;

public class Ej1b {
    public static void main(String[] args) {
        /*Subprograma para pasar una cadena
        de mayúsculas a minúsculas.*/
        Scanner sc = new Scanner(System.in);
        String mayus;
        mayus = sc.nextLine();
        System.out.println(mayus.toUpperCase());
        sc.close();
    }
}
