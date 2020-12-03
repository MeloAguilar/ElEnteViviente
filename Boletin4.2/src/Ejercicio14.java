import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		/* El siguiente programa permite jugar al juego de
		 * "piedra, papel o tijera” contra el ordenador. 
		 * El ganador será el primero que venza en tres jugadas. 
		 * El jugador podrá retirarse si lo desea, y perderá el juego.
		 */
		Scanner sc=new Scanner(System.in);
		int partidas=1,index=5, wins=1, winsMaquina=1;
		System.out.print("Indique su seleccion [1=Piedra, 2=Papel, 3=Tijera, 4=Retirarse]: ");
		while(wins<3 && partidas<index && winsMaquina<3) {
			int respuestaMaquina = (int) Math.floor(Math.random()*3)+1;
			int seleccionUsuario = sc.nextInt();
			if(seleccionUsuario != 4){
				System.out.println("El ordenador escogió...");
				switch(respuestaMaquina) {
				case 1:
					System.out.println("Piedra");
					switch ( seleccionUsuario )
					{
					case 1: System.out.println("Empate!");
					partidas++;
					break;
					case 2: System.out.println("Usted gana!");
					partidas++;
					wins++;
					break;
					case 3: System.out.println("La máquina gana!");
					partidas++;
					winsMaquina++;
					break;
					}
					break;
				case 2:
					System.out.println("papel");
					switch( seleccionUsuario ) {
					case 1:System.out.println("La máquina gana!");
					partidas++;
					winsMaquina++;
					break;
					case 2:System.out.println("Empate!");
					partidas++;
					break;
					case 3:System.out.println("Usted gana!");
					partidas++;
					wins++;
					break;
						}
					break;
				case 3:
					System.out.println("tijeras");
					switch(seleccionUsuario) {
					case 1:System.out.println("usted gana!");
					partidas++;
					wins++;
					break;
					case 2:System.out.println("La máquina gana!");
					partidas++;
					winsMaquina++;
					break;
					case 3:System.out.println("Empate!");
					partidas++;
					break;
					}
					break;
				}
			}else {
				System.out.println("El jugador se rindió, la máquina gana.");
				break;
			}
		}sc.close();
	}
}
