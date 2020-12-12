import java.util.Scanner;

public class ScapeRoom {
    public static void main(String[] args) {
        String eleccionEntrada;
        boolean pistola = false, linterna = false, llavePequeña = false, llaveFinal = false, palanca = false, fotoLavabo = false,
                llaveEscalera = false, pastillaCordura = false, llavesCoche = false, finDelJuego = false;
        int habitacion = 0;
        Scanner sc = new Scanner(System.in);
        int pilasLinterna = 10, cordura = 100;
        //En este juego responderas por teclado con las opciones expuestas en los corchetes.
        //Hay varios requisitos. Para poder llegar a la planta de arriba tendrás que encontrar 3 objetos.
        //La linterna, las llaves del coche y la llave de la segunda planta.
        //Para terminar el juego deberás encontrar como abrir la puertade la izquierda.
        //La llave pequeña y la palanca.
        //No hay un único final. Cuando abras la puerta final existen 6 finales malos y uno no tan malo.
        System.out.println("Estás en clase y te llega un Whatsapp de tu mejor amigo: es un audio donde \n" +
                " se escuchan gritos. Segundos después, te envía su ubicación en tiempo real. En el mapa \n" +
                " consigues ver que se encuentra en una casa a las afueras del pueblo, que parece abandonada. \n" +
                "Preocupado, llamas a la policía sin suerte pues, al no haber pasado 72 horas desde su desaparición, \n" +
                "te dicen que intentes ponerte en contacto con él o vayas a verle a casa antes de lanzar la alarma. \n" +
                "Llamas a sus padres pero no contestan al teléfono así que decides ir a aquella casa que aparecía \n" +
                "en su ubicación. Puede que esté en problemas \n" +
                "\n" +
                "Abres la puerta y entras. Esta se cierra tras de ti con un portazo\n" +
                "......\n" +
                "...");
        System.out.println("-¿Qué haría Josh aquí?");
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        //Comenzaremos el juego con una pequeña introduccion
        System.out.println("INICIO DEL JUEGO\n" +
                "*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        System.out.println("Instrucciones");
        System.out.println("-Tu vitalidad va guiada por la cordura.");
        System.out.println("-Comienzas con 100 puntos de cordura.");
        System.out.println("-Para decidir el camino escribe en pantalla cualquiera de las opciones entre corchetes.");
        System.out.println("-La linterna es un item MUY importante.");
        System.out.println("-La linterna funciona a pilas, comenzarás con 10 que se irán gastando mediante avances por la casa.");
        System.out.println("-Podrás encontrar pilas para la linterna por la casa.");
        System.out.println("-Hay al menos 10 finales diferentes.");
        System.out.println("-Elige con lógica tus opciones si no quieres morir antes de tiempo.");
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        String inicio;
        System.out.println("¿Quieres comenzar?");
        System.out.println("[si]  [no]");
        inicio = sc.nextLine();
        if (inicio.equals("si") || inicio.equals("no")) {
            switch (inicio) {
                case "no":
                    System.out.println("Esperamos que vuelvas pronto!!");
                    System.out.println("Created by Carmelo Aguilar & Pedro Cornejo");
                    break;
                case "si":
                    System.out.println("La bicicleta resbala en el asfalto debido a la lluvia, que no podría haber empezado en un momento peor. \n" +
                            "Siguiendo las indicaciones que te da tu teléfono, giras a la izquierda y te sales de la carretera, pasando por un camino de tierra para llegar a una humilde casa de dos plantas y lo que parece ser un garaje. \n" +
                            "Está rodeada de árboles, lo que, junto al viento y la lluvia, crean la ilusión de que aquella casa cobrase vida.\n" +
                            "\n" +
                            "El jardín descuidado y las vallas llenas de óxido le dan un aspecto aún más desaliñado. Sin embargo, recuerdas por qué estás allí, te animas de valor y entras, arrepintiéndote prácticamente al instante.\n");
                    System.out.println("La casa no está mucho mejor por dentro de lo que está por fuera. Intentas respirar hondo, pero el olor a humedad hace que prefieras mantener tus respiraciones cortas. \n" +
                            "Justo enfrente, tienes las escaleras que acaban en una puerta, a la izquierda tienes una doble puerta cerrada que parece dirigir al salón y, a la derecha, \n" +
                            "una puerta algo más pequeña que seguramente irá al garaje, según la disposición que has visto desde fuera.");

                    while (pilasLinterna > 0 && cordura > 0) {

                            System.out.println("¿Dónde quieres ir? \n" +
                                    "[salon]  [garaje]  [escaleras]\n" +
                                    "Inventario [cosas]");
                            eleccionEntrada = sc.nextLine();
                            //Aquí encontraremos el inventario
                            if (eleccionEntrada.equals("cosas")) {
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
                                    System.out.println("[si]  [no]");
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
                                    }
                                }
                            } else if (eleccionEntrada.equals("salon") || eleccionEntrada.equals("garaje") || eleccionEntrada.equals("escaleras")) {
                                switch (eleccionEntrada) {
                                    case "salon":
                                        String eleccionesSalon;
                                        System.out.println("Abres ambas puertas y crees poder " +
                                                "ver el polvo revolotear por el aire,\n " +
                                                "además de nuevamente ese olor a humedad y a " +
                                                "cerrado insoportable. Intentas aclarar la vista, \n" +
                                                "ya que está muy oscuro. Puedes distinguir unos cuadros en la " +
                                                "pared del fondo, en el centro de la sala.\n " +
                                                "En otra pared puedes ver un corcho con distintos papeles colgados.\n " +
                                                "Por otro lado, Hay varios documentos esparcidos por " +
                                                "la mesa y el sofá, están todos arrugados.");
                                        pilasLinterna--;
                                        boolean token = false;
                                        while (!token) {
                                            System.out.println("¿A qué quieres acercarte?");
                                            System.out.println("[cuadros]  [mesa]  [dibujos] [salir]");

                                            eleccionesSalon = sc.nextLine();
                                            if (eleccionesSalon.equals("cuadros") || eleccionesSalon.equals("mesa") || eleccionesSalon.equals("dibujos")) {

                                                switch (eleccionesSalon) {
                                                    case "cuadros":
                                                        System.out.println("Al acercarte, puedes ver que son unas fotos de cinco niños. " +
                                                                "Están llenos de polvo, tanto que casi no se pueden visualizar bien los rostros infantiles.\n " +
                                                                "Además, el cuadro del centro parece a punto de caerse. \n" +
                                                                "En un intento de acercar tu mano el cuadro cae al suelo sin darte tiempo para reaccionar, \n" +
                                                                "por lo que el marco se rompe. Delante de ti se descubre una caja fuerte \n" +
                                                                "con un código de cinco dígitos, tal vez haya algo que pueda servirte. \n" +
                                                                "De todas formas, te agachas para recoger el cuadro.");
                                                        System.out.println("(tú) Ahora puedo ver mejor la foto...\n" +
                                                                "¿Por qué me suena este chico?...");
                                                        System.out.println("¿Debería sonarme?");
                                                        System.out.println("Detrás de la foto puedes ver una fecha escrita: 1995");
                                                        System.out.println("¿Quieres probar o prefieres seguir buscando?");
                                                        System.out.println("[probar]  [pasar]");
                                                        String cajaFuerte;
                                                        cajaFuerte = sc.nextLine();
                                                        if (cajaFuerte.equals("probar")) {
                                                            System.out.println("Hay una caja fuerte tras el cuadro central\n" +
                                                                    "Parece que es un código numérico.");
                                                            System.out.println("(tú)Probaré con...");
                                                            String numeroSecreto = "9585", contraseña;
                                                            contraseña = sc.nextLine();
                                                            if (contraseña.equals(numeroSecreto)) {
                                                                System.out.println("Pones el código en la caja fuerte y " +
                                                                        "se escucha un chasquido que indica que está abierta, \n" +
                                                                        "Abres despacio la puerta para asegurarte de que no " +
                                                                        "se levante más polvo del que ya hay en la habitación\n" +
                                                                        "Metes la mano y sacas una linterna, suspirando agradecido. Ves un bulto al fondo\n" +
                                                                        "Intentas alcanzarlo y cuando lo sacas puedes ver que es una especie de muñeca hecha con ramas. " +
                                                                        "...como si fuera para algún tipo de ritual...");
                                                                System.out.println("La puerta de la caja fuerte tiene el número 7 grabado en su interior");
                                                                System.out.println("Inexplicable... La muñeca se resbala de tus manos y cae al suelo\n" +
                                                                        "a la vez que escuchas un estruendoso golpe que parece venir de arriba.");
                                                                System.out.println("(Tú)Ni siquiera sé si debería subir, pero algo me llama a hacerlo");
                                                                linterna = true;
                                                                pilasLinterna--;
                                                                token = true;
                                                            } else {
                                                                System.out.println("Parece que no se abre, seguiré buscando por aquí");
                                                                pilasLinterna--;
                                                            }


                                                        } else if (cajaFuerte.equals("pasar")) {
                                                            System.out.println("seguiré buscando");
                                                            pilasLinterna--;

                                                        } else {
                                                            System.out.println("no creo que valga con eso");
                                                        }
                                                        break;
                                                    case "mesa":
                                                        System.out.println("Das unos pasos y te agachas junto a la mesa, " +
                                                                "estirando los papeles para intentar leer algo");
                                                        System.out.println("(tú)- son fotocopias de un anuncio de venta de la casa… \n" +
                                                                "pero en todas aparecen tachones y frases como “Bienvenido al infierno”. \n" +
                                                                "Un escalofrío te recorre mientras lo lees y te levantas con rapidez. \n" +
                                                                "Antes de alejarte, ves un post-it pegado a la mesa, en el que pone “+17590”");
                                                        pilasLinterna--;
                                                        break;
                                                    case "dibujos":
                                                        System.out.println("Te acercas a los dibujos que hay colgados en el corcho. \n" +
                                                                "Puedes ver animales y arcoíris dibujados de forma infantil, \n" +
                                                                "sin embargo, hay un dibujo que te llama la atención: \n" +
                                                                "Uno de un niño que va de la mano de un borrón negro con ojos, \n" +
                                                                "además se puede ver escrito J + A. En el borde del corcho \n" +
                                                                "se encuentra algo grabado: -10000");
                                                        pilasLinterna--;
                                                        break;
                                                }
                                            } else if (eleccionesSalon.equals("salir")) {
                                                pilasLinterna--;
                                                break;
                                            }

                                        }

                                        break;
                                    case "garaje":
                                        if (llavesCoche && llaveEscalera) {
                                            System.out.println("Hace demasiado frío aquí... mejor será seguir buscando.");
                                        }
                                        String eleccionGaraje1, eleccionGaraje2;
                                        System.out.println("Entras y ves el coche y unas taquillas que están bastante alejadas \n" +
                                                "de la puerta, totalmente sumidas en la oscuridad \n" +
                                                ",¿Quieres acercarte a las taquillas o prefieres investigar el coche?");
                                        boolean tokenGaraje = false;
                                        while (!tokenGaraje && cordura>0 && pilasLinterna>0) {
                                        System.out.println("[coche] [taquillas] [salir]");
                                        pilasLinterna--;
                                        eleccionGaraje1 = sc.nextLine();

                                            while (eleccionGaraje1.equals("coche") || eleccionGaraje1.equals("taquillas")) {
                                                switch (eleccionGaraje1) {
                                                    case "coche":
                                                        if (!llavesCoche) {
                                                            System.out.println("Te asomas a la ventanilla del coche e intentas ver el interior. \n" +
                                                                    "Los asientos están destrozados y parece que una colonia de bichos han conquistado el coche como nuevo hábitat.");
                                                        } else if (llavesCoche) {
                                                            tokenGaraje=false;
                                                            String libreta;
                                                            System.out.println("Pruebas a introducirla en la cerradura y, aunque el coche no reacciona de ninguna forma, la puerta se abre.\n " +
                                                                    "Al tirar de ella para asomarte en su interior, escuchas como algunos bichos se esconden entre los recovecos del coche. \n" +
                                                                    "Te armas de valor y coges la libreta del asiento del copiloto, esperando que no haya nada raro dentro. \n" +
                                                                    "Justo antes de incorporarte, ves unas llaves en el suelo del coche, las cuales coges con velocidad.");
                                                            System.out.println("¿Quieres abrir la libreta?");
                                                            System.out.println("[si]  [no]");
                                                            libreta = sc.nextLine();
                                                            switch (libreta) {
                                                                case "si":
                                                                    System.out.println("Abres la libreta con cuidado, pues parece que se va a deshacer en cualquier momento. \n " +
                                                                            "En la portada se puede leer “J. Howarthson”. Al pasar lentamente las páginas, ves que en todas aparece una fecha diferente,\n " +
                                                                            "lo que te hace entender que puede ser una especie de diario. Te diriges a la última página \n" +
                                                                            "y ves que la fecha corresponde a hace poco más de un año. En ella puedes leer:\n" +
                                                                            "\n" +
                                                                            "“Otra noche más en la que no me siento seguro en esta casa. \n" +
                                                                            "Mis hijos han dejado de venir a verme porque temen que a sus hijos les pase algo.\n" +
                                                                            "¿Qué va a pasarles si están con sus abuelos? No permitiría que nada les hiciera daño.\n " +
                                                                            "Sin embargo… Linda cada vez está más perdida… ha perdido aquella sonrisa de la que me enamoré\n " +
                                                                            "y también parece que está perdiendo las ganas de vivir. \n" +
                                                                            "El pequeño Josh es el único que no sale llorando cada vez que viene.\n " +
                                                                            "Más bien, parece que disfruta mucho de estar aquí, pero no entiendo por qué.\n" +
                                                                            "Estoy perdiendo a toda mi familia por culpa de esta casa, debo venderla como sea”.");
                                                                    break;
                                                                case "no":
                                                                    System.out.println("(tú)No tengo tiempo para leer esto...");
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case "taquillas":

                                                        System.out.println("Te acercas a las taquillas con cuidado de no resbalar con el aceite\n" +
                                                                "ha derramado el coche por todo el suelo. \n" +
                                                                "Cuando estás lo suficientemente cerca como para poder para poder leer,\n" +
                                                                "descubres que está escrito en la taquilla izquierda LUCIFER y en la derecha LUCIEL.\n" +
                                                                "\n" +
                                                                "¿Cuál prefieres abrir?\n" +
                                                                "[izq]  [der]");
                                                        eleccionGaraje2 = sc.nextLine();
                                                        if(eleccionGaraje2.equals("izq") || eleccionGaraje2.equals("der")){
                                                            switch (eleccionGaraje2){
                                                                case "izq":
                                                                    if (!linterna) {
                                                                        System.out.println("Al tocar la taquilla sientes como el frío recorre tu cuerpo,\n " +
                                                                                "y un olor a azufre sale del interior. Respirar hondo y coges con \n" +
                                                                                "firmeza la puerta para abrirla pero una fuerza desconocida comienza a \n" +
                                                                                "tirar de tu mano hacia adentro de la misma y tú, \n" +
                                                                                "desesperado, intentas alejarte cuanto antes de la taquilla. \n" +
                                                                                "Te acabas cayendo al suelo cuando la puerta se abre de par en par.\n " +
                                                                                "Jurarías haber visto un rostro en la oscuridad de la taquilla, \n" +
                                                                                "pero intentas pensar que tu imaginación te está jugando una mala pasada");
                                                                        cordura -= 100;
                                                                        pilasLinterna--;
                                                                    } else if (linterna) {
                                                                        System.out.println("Sintiéndote seguro de tu elección abres la " +
                                                                                "taquilla y el fuerte olor que desprende te hace toser. \n" +
                                                                                "No te apetece demasiado meter la mano ahí dentro, \n" +
                                                                                "pero puedes divisar algo en el interior de la misma. \n" +
                                                                                "Al meter la mano, sacas las llaves de un coche algo \n" +
                                                                                "oxidadas que llevan un llavero colgado con distintos nombres:\n " +
                                                                                "Molly, Robbie, Anna, Lilly y… ¿Josh?");
                                                                        System.out.println("Hay muchos Josh en este mundo pero, con todo lo que está pasando,\n" +
                                                                                "seguro que se refiere al Josh que yo conozco.\n" +
                                                                                "Sin embargo...¿Quiénes son el resto de personas?\n" +
                                                                                "Josh no tiene hermanos... Esto es muy extraño...");
                                                                        cordura -= 25;
                                                                        pilasLinterna--;
                                                                        System.out.println("cordura-->"+cordura);
                                                                    }
                                                                    break;
                                                                case "der":
                                                                    if (!linterna) {
                                                                        System.out.println("Sintiéndote seguro de tu elección abres la taquilla \n" +
                                                                                "y el fuerte olor que desprende te hace toser. \n" +
                                                                                "No te apetece demasiado meter la mano ahí dentro, \n" +
                                                                                "pero puedes divisar algo en el interior de la misma. \n" +
                                                                                "Al meter la mano, sacas las llaves de un coche algo oxidadas \n" +
                                                                                "que llevan un llavero colgado con distintos nombres: \n" +
                                                                                "Molly, Robbie, Anna, Lilly y… ¿Josh? ");
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

                                                        }

                                                        break;
                                                }

                                                break;
                                            }if (eleccionGaraje1.equals("salir")){
                                                tokenGaraje = true;
                                            }
                                        }


                                        break;
                                    case "escaleras":


                                        break;
                                }
                            }
                        }if (pilasLinterna <= 0 ){
                    System.out.println("te quedaste sin pilas en la linterna...");
                    System.out.println("FIN");
                    finDelJuego = true;
                }else if( cordura <= 0) {
                    System.out.println("Tu cordura está a cero");
                    System.out.println("FIN");
                    finDelJuego = true;
                }
                    break;//break del si inicial
            }


        }
    }


}
