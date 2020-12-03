import java.util.Scanner;

public class CifradoCesar {

	public static void main(String[] args) {
		/*En este programa se convertirá una frase legible
		 * en un codigo descifrable mediante un número aleatorio
		 * el cual será el número de posiciones que se ha desplazado*/
		
		//Escogemos el abecedario en mayuscula y minuscula
		//Creamos dos Strings para la frase introducida y la encriptada
		String min="abcdefghijklmnopqrstuvwxyz ";
		String may="ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
		String frase, fraseEncript = "";
		Scanner sc=new Scanner(System.in);
		//Pedimos al usuario que introduzca la frase a encriptar
		System.out.println("Introduce una frase aqui: ");
		frase=sc.nextLine();
		System.out.println("Introduce la clave de desplazamiento: ");
		//Le damos un valor aleatorio al desplazamiento.
		int desplazamiento = (int) Math.floor(Math.random()*(9));
			System.out.println(desplazamiento);
			//Recorremos la frase y el String de minusculas comparando letras
		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < min.length(); j++) {
				//Le damos un nuevo caracter a cada letra minuscula utilizando la variable desplazamiento.
				if (frase.charAt(i) == min.charAt(j)) {
					if(j + desplazamiento >= min.length()) {
						fraseEncript += min.charAt((j+desplazamiento) % min.length());
					}
					//Hacemos lo mismo con las mayusculas
					else {
						fraseEncript += min.charAt(j + desplazamiento);
					}
				}else
					if(frase.charAt(i) == may.charAt(j)) {
						if(j + desplazamiento >= may.length()) {
							fraseEncript += may.charAt((j + desplazamiento)% may.length());
						}
						else {
							fraseEncript += may.charAt(j + desplazamiento);
						}
					}
			}
			//Por último mostramos la frase encriptada en pantalla.
		}System.out.println(fraseEncript);
		System.out.println(frase);
		sc.close();
	}

}