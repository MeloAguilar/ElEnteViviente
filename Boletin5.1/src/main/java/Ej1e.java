import java.util.Scanner;

public class Ej1e {
    public static void main(String[] args){
       /*Subprograma para
       calcular si un número es o no perfecto.
        */
        Scanner sc=new Scanner(System.in);
        int num, suma=0;
        num=sc.nextInt();
        for (int i=1; i<num ;i++){
            if (num%i==0) {
                suma += i;
            }
        }
        if (suma==num){
            System.out.println(num+" es un número perfecto");
        }else {
            System.out.println(num+" no es perfecto");
        }
    }
}
