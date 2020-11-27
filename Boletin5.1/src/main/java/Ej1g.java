import java.util.Scanner;

public class Ej1g {
    public static void main(String[] args) {
        /*Subprograma para comprobar si dos números son amigos.
        Dos números son amigos si la suma de los divisores
        del primero, excepto él mismo, es igual al
        segundo número y viceversa.
        */
        Scanner sc = new Scanner(System.in);
        int num1, num2, suma1 = 0, suma2 = 0;
        System.out.println("Introduce dos números para averiguar si son amigos: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        //Primero realizamos el conteo de divisores del primer número
        for (int i = 1; i < num1; i++) {
            //Si el número del contador es divisible entre el numero 1 se almacena
            if (num1 % i == 0) {
                //Se almacena el número y se le van sumando los siguientes
                suma1 += i;
            }
        }
        //Hacemos lo mismo con el segundo número
        for (int j = 1; j < num2; j++) {
            if (num2 % j == 0) {
                suma2 += j;
            }
        }
        //Si el sumatorio del primero número es igual al segundo número
        System.out.println("suma1=" + suma1 + " suma2=" + suma2);
        if (suma1 == num2 && suma2 == num1) {
            System.out.println("Los números son amijos");
        } else {
            System.out.println("Estos números no se llevan bien");
        }
    }
}
