import java.util.Scanner;

public class ElEnteViviente {
    public static void main(String[] args) {
        System.out.println("Estás en clase y te llega un Whatsapp de tu mejor amigo: es un audio donde \n" +
                " se escuchan gritos . Segundos después, te envía su ubicación en tiempo real. En el mapa \n" +
                " consigues ver que se encuentra en una casa a las afueras del pueblo, que parece abandonada. \n" +
                "Preocupado, llamas a la policía sin suerte pues, al no haber pasado 72 horas desde su desaparición, \n" +
                "te dicen que intentes ponerte en contacto con él o vayas a verle a casa antes de lanzar la alarma. \n" +
                "Llamas a sus padres pero no contestan al teléfono así que decides ir a aquella casa que aparecía \n" +
                "en su ubicación. Puede que esté en problemas \n" +
                "\n" +
                "Abres la puerta y entras. Esta se cierra tras de ti con un portazo\n ");
        System.out.println("-¿Qué haría Josh aquí?");
        String eleccionEntrada;
        boolean pistola = false, linterna = false, llavePequeña = false,
                llaveEscalera = false, pastillaCordura = false, llavesCoche = false, salvarAmigo = false, escapar = false;
        int habitacion = 0;
        Scanner sc = new Scanner(System.in);
        int pilasLinterna = 10, cordura = 100;
        //Comenzaremos el juego con una pequeña introduccion
        System.out.println("INICIO DEL JUEGO");
        System.out.println("Entras en la casa forzando la puerta y esta se cierra de un portazo tras de tí. \n" +
                "No hay manera de abrirla de nuevo para salir y solo tienes tres opciones: \n" +
                "Ir al salón, ir a la puerta que da a la segunda plana, o entrar en el garaje");
        //Mientras se cumplan las condiciones volveremos a la entrada automaticamente
        while (pilasLinterna > 0 && cordura > 0) {

            System.out.println("¿Dónde quieres ir? \n" +
                    "[salon]  [garaje]  [escaleras]\n" +
                    "Inventario [cosas]");
            eleccionEntrada = sc.nextLine();
            eleccionEntrada.toCharArray();
            //Aquí encontraremos el inventario
            if (eleccionEntrada.equals("cosas")) {
                System.out.println("pilas: " + pilasLinterna);
                System.out.println("cordura: " + cordura);
                if (linterna == true) {
                    System.out.println("linterna");
                    if (llavesCoche == true) {
                        System.out.println("llave coche");
                        if (llaveEscalera == true) {
                            System.out.println("llave escalera");
                            if (llavePequeña == true) {
                                System.out.println("llave pequeña");
                                if (pistola == true) {
                                    System.out.println("pistola");
                                    if (pastillaCordura == true) {
                                        char usarAdrenalina;
                                        System.out.println("adrenalina");
                                        System.out.println("¿usar?");
                                        usarAdrenalina = sc.nextLine().charAt(0);
                                        switch (usarAdrenalina) {
                                            case 's':
                                                if (cordura < 80) {
                                                    pilasLinterna--;
                                                    cordura = 100;
                                                    System.out.println("Recuperaste la cordura al máximo");
                                                    pastillaCordura = false;
                                                } else {
                                                    System.out.println("En realidad no creo que lo necesite ahora");
                                                }
                                                break;
                                            case 'n':
                                                System.out.println("Sí, en verdad debería dejarlo para cuando lo necesite");
                                                break;
                                        }//Fin_SwitchAdrenalina
                                    }//Fin_ifAdrenalina
                                }//Fin_ifPistola
                            }//Fin_ifLlavePequeña
                        }//Fin_ifLlaveEscalera
                    }//Fin_ifLlavesCoche
                }//Fin_ifLinterna
            }//Fin_Inventario
            else {
                //Las escaleras estarán cerradas hasta que encontremos la llave Escaleras(coche)
                switch (eleccionEntrada) {
                    case "escaleras":
                        if (!llaveEscalera) {
                            System.out.println("La puerta esta cerrada \n " +
                                    "vuelves a la entrada \n" +
                                    "[salon]  [garaje]  [escaleras]  [cosas]");
                            pilasLinterna--;
                            //Cuando consigamos la llave Escalera podremos subir a la segunda planta
                        } else if (llaveEscalera) {

                            //Elegiremos entre las cuatro habitaciones y volveremos atrás cuando terminemos los acertijos de cada una
                            //Cuando sepamos donde está Josh podremos decidir como salir de la casa
                            System.out.println("Se abre la puerta y subes a la segunda planta");
                            System.out.println("Hay cuatro habitaciones, la primera de la derecha esta totalmente a oscuras\n" +
                                    "la segunda tiene una luz tenue, al final del descansillo, justo en frente, tienes \n" +
                                    "otra habitación con la luz apagada y a tu izquierda hay una puerta sellada \n" +
                                    "con un tablón de madera ");
                            while (!escapar) {
                                String descansillo;
                                System.out.println("Habitaciones[derecha1]  [derecha2]  [delante]  [izquierda] \n" +
                                        "Inventario [cosas]");
                                descansillo = sc.nextLine();
                                descansillo.toCharArray();
                                if (descansillo.equals("cosas")) {
                                    System.out.println("pilas: " + pilasLinterna);
                                    System.out.println("cordura: " + cordura);
                                    if (linterna == true) {
                                        System.out.println("linterna");
                                    }
                                    if (llavesCoche == true) {
                                        System.out.println("llave coche");
                                    }
                                    if (llaveEscalera == true) {
                                        System.out.println("llave escalera");
                                    }
                                    if (llavePequeña == true) {
                                        System.out.println("llave pequeña");
                                    }
                                    if (pistola == true) {
                                        System.out.println("pistola");
                                    }
                                    if (pastillaCordura == true) {
                                        char usarAdrenalina;
                                        System.out.println("adrenalina");
                                        System.out.println("¿usar?");
                                        usarAdrenalina = sc.nextLine().charAt(0);
                                        switch (usarAdrenalina) {
                                            case 's':
                                                if (cordura < 80) {
                                                    pilasLinterna--;
                                                    cordura = 100;
                                                    System.out.println("Recuperaste la cordura al máximo");
                                                    pastillaCordura = false;
                                                } else {
                                                    System.out.println("En realidad no creo que lo necesite ahora");
                                                }
                                                break;
                                            case 'n':
                                                System.out.println("Sí, en verdad debería dejarlo para cuando lo necesite");
                                                break;
                                        }//Fin_Switch_ChutarseAdrenalina
                                    }//Fin_ifChutarseAdrenalina
                                }//SEGUNDA PLANTA
                                switch (descansillo) {

                                    case "derecha1":
                                        char hab1;
                                        System.out.println("Al entrar en la habitación ves una jeringa de adrenalina \n" +
                                                " que resplandece dentro de un armario roto \n" +
                                                "¿Decides entrar o prefieres pasar de la jeringa de adrenalina?");
                                        System.out.println("entrar[s]  no entrar[n]");
                                        hab1 = sc.next().charAt(0);
                                        switch (hab1) {
                                            case 's':
                                                pilasLinterna--;
                                                pastillaCordura = true;
                                                if (linterna) {
                                                    System.out.println("Conseguiste una jeringa de adrenalina");
                                                } else {
                                                    cordura -= 50;
                                                    System.out.println("El Ente te atraviesa y caes de espaldas al suelo \n" +
                                                            "Pierdes 50 de cordura \n" +
                                                            "Recuerda, los entes temen la luz.");
                                                }
                                                break;
                                            case 'n':
                                                pilasLinterna--;
                                                System.out.println("Es verdad... mejor no jugarsela...");
                                                break;
                                            default:
                                                throw new IllegalStateException("Unexpected value: " + hab1);
                                        }
                                        break;
                                    case "derecha2":
                                        System.out.println("Parece que esta es la única habitación iluminada... \n" +
                                                "Parece que hay un libro... \n" +
                                                "Pesa demasiado para no tener rebordes de metal...\n" +
                                                "Parece que el libro esta cerrado con un candado con código");
                                        System.out.println("mmm... Tiene tres ruedas numeradas del 1 al 9...");
                                        int numeroLibro = 793, intentoLibro;
                                        System.out.println("Comienzas a girar las ruedas de el candado: ");
                                        intentoLibro = sc.nextInt();
                                        if (intentoLibro == numeroLibro) {
                                            System.out.println("Abres el libro y dentro encuentras una llave pequeña \n" +
                                                    "con una cadena liada a una pistola ensangrentada...\n" +
                                                    "...Aunque la sangre esta muy seca..." +
                                                    "....¿Para qué servirá la llave?... \n" +
                                                    "Coges la llave y vuelves al descansillo");
                                            pilasLinterna--;
                                            llavePequeña = true;
                                            pistola = true;
                                        } else {
                                            System.out.println("El libro no se abre... Probaré con otro código");
                                            pilasLinterna--;
                                        }
                                        break;
                                    case "delante":


                                }
                            }
                        }

                        break;
                    //GARAJE
                /*Tendremos que entrar al garaje para encontrar las llaves del coche en la taquilla y la llave de la
                   segunda planta, cuando lo consigamos volveremos a la entrada
                 */
                    case "garaje":
                        String eleccionGaraje1, eleccionGaraje2;

                        while (!llaveEscalera && pilasLinterna > 0 && cordura > 0) {
                            System.out.println("Entras y ves el coche y unas taquillas que están bastante alejadas \n" +
                                    "de la puerta, totalmente sumidas en la oscuridad \n" +
                                    ",¿Quieres acercarte a las taquillas o prefieres investigar el coche?\n" +
                                    "[coche] [taquillas]");
                            eleccionGaraje1 = sc.nextLine();
                            eleccionGaraje1.toCharArray();
                            switch (eleccionGaraje1) {
                                case "coche":
                                    if (!llavesCoche) {
                                        System.out.println("El coche está cerrado con llave \n" +
                                                "Parece que hay un numero escrito con baho en la ventanilla [3]");
                                    } else if (llavesCoche) {
                                        System.out.println("Coges las llaves de la escalera");
                                        llaveEscalera = true;
                                    }
                                    break;
                                //Si no llevas la linterna lo tendrás jodido, pues hasta cogiendo la derecha te pegará
                                case "taquillas":
                                    System.out.println("Hay escrito un mensaje: \n" +
                                            "Aquí reside el siervo del diablo ¿Qué taquilla decides abrir, izquierda o derecha?\n " +
                                            "[izq]  [der]");
                                    eleccionGaraje2 = sc.nextLine();
                                    eleccionGaraje2.toCharArray();
                                    //Para las decisiones según si el usuario lleva la linterna o no al garaje
                                    switch (eleccionGaraje2) {
                                        case "izq":
                                            if (!linterna) {
                                                System.out.println("Has muerto... Recuerda que los entes temen la luz");
                                                cordura -= 100;
                                                pilasLinterna--;
                                            } else if (linterna) {
                                                System.out.println("El ente sale disparado y te atraviesa...\n" +
                                                        " pierdes 25 puntos de cordura");
                                                cordura -= 25;
                                                pilasLinterna--;
                                                System.out.println(cordura);
                                            }
                                            break;
                                        case "der":
                                            if (!linterna) {
                                                System.out.println("El ente sale disparado y te atraviesa...\n" +
                                                        "Has perdido 90 puntos de cordura...\n" +
                                                        " Recuerda que los entes temen la luz\n" +
                                                        "Te recompones y coges la llave del coche de dentro de la taquilla");
                                                cordura -= 90;
                                                llavesCoche = true;
                                                System.out.println(cordura);
                                                pilasLinterna--;
                                            } else if (linterna) {
                                                System.out.println("Has encontrado las llaves del coche dentro de la taquilla \n" +
                                                        "mmmm... Parece que hay un numero escrito en la puerta [9]");
                                                llavesCoche = true;
                                                pilasLinterna--;
                                            }
                                            break;

                                    }
                                    break;

                            }
                            System.out.println("Pulsa Enter");
                        }
                        break;
                    //La primera sala que se debe visitar si se quiere tener oportunidad ante el ente
                    //Un pequeño acertijo mediante numeros escritos en los cuadros
                    //Si se acierta el acertijo se abre una caja fuerte
                    case "salon":
                        pilasLinterna--;
                        System.out.println("Entras al salón y ves tres cuadros, te acercas y ves tres cuadros, en uno pone \n" +
                                "(1995), en el del centro (+17590), en el tercero (-10000)");
                        System.out.println("Hay una caja fuerte tras el cuadro central\n" +
                                "Parece que es un código numérico.");
                        int numeroSecreto = 9585, contraseña;
                        contraseña = sc.nextInt();
                        //Si aciertas el número secreto te darán la linterna, algo bastante preciado en este juego
                        //La linterna e el método de este juego para contabilizar las acciones
                        //Sin la linterna el jugador no puede sobrevivir mas de 3 acciones
                        while (contraseña != numeroSecreto) {
                            System.out.println("Intentalo de nuevo");
                            contraseña = sc.nextInt();
                        }
                        System.out.println("Se abrió la caja fuerte y dentro hay un objeto \n" +
                                "Coges la linterna");
                        System.out.println("Hay  algo escrito en el fondo... Parece un numero [7]");
                        linterna = true;
                        pilasLinterna--;
                        break;

                }
                continue;
            }
        }//fin_While de inicio
    }//Fin_Main
}//Fin_PublicClass





