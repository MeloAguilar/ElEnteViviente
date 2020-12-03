import java.util.Calendar;
import java.util.Scanner;

public class Ejericio15 {

	public static void main(String[] args) {
		/* Realizar un programa que mida la esperanza de vida
		seg�n las respuestas del usuario a 4 preguntas.*/

		//Declaramos las variables para las preguntas del test
		System.out.println("Bienvenido a tu calculadora de esperanza de vida favorita \n Sigue los paos que se muestran a continuanci�n: ");
		Scanner sc=new Scanner(System.in);
		int edad, respuestaDormir, vegano;
		int carneCruda, preguntaCarne, horasDeporte;
		int cigarros, preguntaFumar, preguntaDeporte;
		Calendar today = Calendar.getInstance();
		int añoCorriente = today.get(Calendar.YEAR);
		//Pedimos al usuario que introduzca su edad.
		System.out.println("Introduce aqu� tu edad: ");
		edad=sc.nextInt();
		if (edad>0 && edad<86) {
			edad = 86-edad;
			//Pedimos que diga las horas de sue�o.
			System.out.println("�Cuantas horas sueles dormir diariamente?");
			respuestaDormir=sc.nextInt();
			//Seg�n la edad se le quita a�os de edad.
			switch (respuestaDormir) {
			case 1: edad-=6;
			break;
			case 2: edad-=5;
			break;
			case 3: edad-=4;
			break;
			case 4: edad-=4;
			break;
			case 5: edad-=2;
			break;
			case 6: edad-=1;
			break;
			case 11: edad-=3;
			break;
			case 12: edad-=3;
			break;
			case 13: edad-=4;
			break;
			case 14: edad-=5;
			break;
			case 15: edad-=6;
			}

			System.out.println("�fumas?(escribe 1 para si o 2 para no)");
			preguntaFumar=sc.nextInt();
			switch (preguntaFumar) {
			case 1:
				System.out.println("�Cu�ntos cigarrillos al d�a?");
				cigarros=sc.nextInt();
				if(cigarros<=3) {
					edad-=1;
				}else
					if(cigarros>3&&cigarros<=7) {
						edad-=2;
					}else
						if(cigarros>7&&cigarros<=15) {
							edad-=3;
						}else
							if(cigarros>15) {
								edad-=5;	
							}
				break;
			case 2:
				edad-=0;
				break;
			}
			System.out.println("�Haces deporte normalmente?(1 para si o 2 para no)");
			preguntaDeporte=sc.nextInt();
			switch (preguntaDeporte) {
			case 1: 
				System.out.println("�Cu�ntas horas semanales?");
				horasDeporte=sc.nextInt();
				if(horasDeporte >=2 && horasDeporte <= 6) {
					edad+=2;
				}else
					if(horasDeporte > 6) {
						edad+=4;
					}
				break;
			case 2:
				edad-=6;
				break;
			}
			System.out.println("�Comes carne?(responde 1 para si y 2 para no)");
			preguntaCarne=sc.nextInt();
			switch(preguntaCarne) {
			case 1:
				System.out.println("�C�mo te gusta?(1 para casi cruda, 2 para al punto y 3 para muy hecha)");
				carneCruda=sc.nextInt();
				switch (carneCruda) {
				case 1: edad-=1;
				break;
				case 2: edad-=0;
				break;
				case 3: edad-=3;
				break;
				}
				break;
			case 2:
				System.out.println("�Eres vegano o vegetariano?1 para vegano,2 para vegetariano.");
				vegano=sc.nextInt();
				switch(vegano) {
				case 1: edad-=1;
				break;
				case 2: edad-=2;
				}
			}
			System.out.println(edad);
			edad = edad + añoCorriente;
			System.out.println("Tu esperanza de vida llega hasta el "+edad);
		}else
			if(edad<0||edad>86){
				System.out.println("ERROR 404!! Su edad se encuentra fuera de nuestros registros");
			}
		sc.close();
	}

}	


