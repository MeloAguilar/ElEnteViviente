import java.util.Scanner;

public class Ej1a {
    public static void main (String[] args){
        /*Subprograma que teniendo como parámetros un
        carácter y un número, imprima
        una línea con tantas veces el carácter
        como indique el número.
         */
        Scanner sc=new Scanner(System.in);
        char caracter;
        int num;
        caracter=sc.next().charAt(0);
        num=sc.nextInt();
        for (int conteo=0;conteo<num;conteo++) {
            for(int i=0;i<conteo;i++){
                System.out.print(caracter);
            }
        }sc.close();

    }
}
