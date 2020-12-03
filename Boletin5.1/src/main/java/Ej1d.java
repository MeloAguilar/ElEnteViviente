import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Ej1d {
    public static void main(String[] args){
        /*Subprograma Digito que determine si un
        carácter es un dígito entre 0 y 9.
         */
        Scanner sc=new Scanner(System.in);
        char caracter;
        caracter=sc.nextLine().charAt(0);
        if(Character.isDigit(caracter)){
            System.out.println("Es un número entre 0 y 9");
        }else{
            System.out.println("Esto no es un dígito entre 0 y 9");
        }sc.close();


    }
}
