import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		/* Construye un programa que lea dos números enteros 
		 * positivos diferentes y nos de una lista de todos 
		 * los números primos que hay entre ellos.
		 */
		Scanner sc=new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Escribe aqui el primer número");
		System.out.println("Escribe aqui el segundo número");
		num1=sc.nextInt();
		num2=sc.nextInt();
		for(int i=num1;i < num2; i++) {
		
			boolean	noprimo = false;
			
			for(int j  = 2;(j<i)&&(!noprimo); j++) {
				
				if(i%j==0) {
					noprimo=true;
				}
			}if (!noprimo) { 
				System.out.println(i+" es primo");
		sc.close();
		}
	}
	}
}
