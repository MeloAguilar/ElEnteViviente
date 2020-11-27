import java.util.Scanner;

public class Ej1i {
    public static void main(String[] args){
        /*Subprograma para pasar una medida en
        hectáreas y áreas a metros cuadrados.
         */
        Scanner sc=new Scanner(System.in);
        float hectarea, metroCuadrado;
        int eleccion;
        System.out.println("Escribe 1 para pasar de hectareas a metros cuadrados");
        System.out.println("Escribe 2 para pasar de metros cuadrados a hectareas");
        eleccion=sc.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("Escribe aquí la cantidad de hectareas");
                hectarea = sc.nextFloat();
                metroCuadrado = hectarea * 10000;
                System.out.println(hectarea + " hectareas son " + metroCuadrado);
                break;

            case 2:
                System.out.println("Escribe aquí la cantidad de metros cuadrados");
                metroCuadrado = sc.nextFloat();
                hectarea = metroCuadrado/10000;
                System.out.println(metroCuadrado+" metros cuadrados son "+hectarea+" hectareas");
                break;
        }sc.close();
    }
}
