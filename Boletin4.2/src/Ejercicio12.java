import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
		/*  Modifica el programa anterior para
		poder elegir entre pintar una tri�ngulo, 
		un cuadrado o un rect�ngulo. En el tercer caso, adem�s
		del n�mero de columnas habr� que leer el n�mero de filas.*/
        Scanner sc = new Scanner(System.in);
        int i = 0, j = 0, num, altura=0, base=0, conteo, eleccion;
        char input;
        System.out.println("Que forma desea(1 triangulo, 2 cuadrado, 3 rectangulo)");
        eleccion = sc.nextInt();
        System.out.println("caracter de la figura");
        switch (eleccion) {

            for (i = 1; i <= conteo; i++) {
                /* Mostramos los asteriscos en cada fila
                conteo = 0;
                System.out.println("altura del triangulo");
                altura = sc.nextInt();
                for (conteo = 0; conteo < i; conteo++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            case 1: base++;
            case 2: altura++;


        }
    }
}