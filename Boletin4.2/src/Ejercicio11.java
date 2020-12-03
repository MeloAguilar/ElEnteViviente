import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		/* Modifica el programa anterior para
		 *  que nos permita elegir el carácter 
		 *  con el que se rellena el triángulo.*/
		Scanner sc=new Scanner(System.in);
		int i=0,j=0,num;
		String signo;
		System.out.println("Escribe aqui el numero de veces");
		System.out.println("Escribe el caracter");
		num=sc.nextInt();
		signo=sc.next();

		for(i=1;i<=num;i++)
		{
			// Mostramos los asteriscos en cada fila
			for(j=0;j<i;j++)
			{
				System.out.print(signo);
			}
			System.out.println();

		}
	}
}
