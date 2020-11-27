import java.util.Scanner;

public class SiguientePrimo {
    public static void main(String[] args){
        /*Subprograma llamado SiguientePrimo
        que reciba un número primo mayor que 1
        y devuelva el número primo inmediatamente superior.*/
        Scanner sc = new Scanner(System.in);
        int siguientePrimo, contador =2;
        boolean esPrimo = false;
        int n =sc.nextInt();
        siguientePrimo = sc.nextInt(); 

        while (siguientePrimo > 1){
            for (int i =2; i < n; i++){
                if (n % i == 0){
                    esPrimo = true;
                    break;
                }
            }
        }if (esPrimo){
            System.out.println("%i "+n);
        }
    }
}
