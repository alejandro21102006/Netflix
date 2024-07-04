import java.util.Scanner;
public class netflix {
    private String nombre,apellidos,nombreUsuario,correo,correo_in,contraseña,contraseña_in;
    private int opcion;

    private String[] nombresdeinciarsecion = new String[10];
    private String[] aplellidodeinciarsecion = new String[10];
    private String[] nombreUsuariodeinciarsecion = new String[10];
    private String[] correodeinciarsecion = new String[10];
    private String[] contraseñasdeinciarsecion = new String[10];
    private int Registrarsedeinciarsecion = 0;
    private int Iniciarsesión = 0;



    private String[] nombresPerfiles = new String[10];
    private String[] contraseñasPerfiles = new String[10];
    private int[] tiposCuentas = new int[10];
    private int contadorPerfiles = 0;

    public int fDatosClientea() {
        Scanner datos = new Scanner(System.in);
        int contador=0;

        System.out.println("⣶⡄⠀⣶⠀⢰⣶⣶⡆⠠⣶⣶⣶⡆⢰⣶⣶⣦⠀⣶⠀⠀⠀⣶⡆:⣶⠀⣰⡖\n" +
                "⣿⣷⡀⣿⠀⣸⣇⣀⡀⠀⠀⣿⠀⠀⢸⣇⣀⡀⠀⣿⠀⠀⠀⣿⡇⠀⠹⣷⡿⠁\n" +
                "⣿⡿⣷⣿⠀⣿⡟⠛⠁⠀⠀⣿⠀⠀⢸⡏⠉⠁⠀⣿⠀⠀⠀⣿⡇⠀⢠⣿⣇⠀\n" +
                "⣿⡇⢻⣿⠀⣿⣷⣶⡆⠀⠀⠿⠀⠀⠸⠇⠀⠀⠀⣿⣶⣶⠀⣿⡇⢀⣿⠋⢿⡆\n");
        System.out.println("------NETFLIX-------");
        System.out.println("----ELIJA UNA OPCIÓN----");
        System.out.println("1. Registrarse");
        System.out.println("2. Iniciar sesión");
        System.out.print("Selecciona una opción: ");
        int opcion = datos.nextInt();
        datos.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("_" +
                        "⣶⡄⠀⣶⠀⢰⣶⣶⡆⠠⣶⣶⣶⡆⢰⣶⣶⣦⠀⣶⠀⠀⠀⣶⡆⠐⣶⠀⣰⡖\n" +
                        "⣿⣷⡀⣿⠀⣸⣇⣀⡀⠀⠀⣿⠀⠀⢸⣇⣀⡀⠀⣿⠀⠀⠀⣿⡇⠀⠹⣷⡿⠁\n" +
                        "⣿⡿⣷⣿⠀⣿⡟⠛⠁⠀⠀⣿⠀⠀⢸⡏⠉⠁⠀⣿⠀⠀⠀⣿⡇⠀⢠⣿⣇⠀\n" +
                        "⣿⡇⢻⣿⠀⣿⣷⣶⡆⠀⠀⠿⠀⠀⠸⠇⠀⠀⠀⣿⣶⣶⠀⣿⡇⢀⣿⠋⢿⡆\n" +
                        "⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉");
                System.out.println("--¿DESEA REGISTRARSE?--(SI / NO)");
                String registrase = datos.nextLine();

                if (registrase.equalsIgnoreCase("SI")){
                    System.out.println("_INGRESE SU NOMBRE_");
                    nombre = datos.nextLine();
                    nombresdeinciarsecion[Registrarsedeinciarsecion]= nombre;
                    System.out.println("-INGRESE APELLIDOS-");
                    apellidos = datos.nextLine();
                    aplellidodeinciarsecion[Registrarsedeinciarsecion]=apellidos;
                    System.out.println("--Ingrese su nombre de usuario--");
                    nombreUsuario = datos.nextLine();
                    nombreUsuariodeinciarsecion[Registrarsedeinciarsecion]=nombreUsuario;
                    System.out.println("--INGRESE SU CORREO ELECTRÓNICO--");
                    correo = datos.nextLine();
                    correodeinciarsecion[Registrarsedeinciarsecion]=correo;
                    System.out.println("--CREA TU CONTRASEÑA(la contraseña debe tener de 8 dígitos a más)--");
                    contraseña = datos.nextLine();
                    contraseñasdeinciarsecion[Registrarsedeinciarsecion]=contraseña;

                    if (contraseña.length()>=8){
                        System.out.println("--¿DESEA INICIAR SESIÓN?___(SI/NO)");
                        String IniciarSesión = datos.nextLine();
                        if (IniciarSesión.equalsIgnoreCase("SI")){
                            System.out.println("--INICIAR SESIÓN--");
                            System.out.println("--INGRESE SU CORREO ELECTRÓNICO--");
                            correo_in= datos.nextLine();
                            if (correo_in.equals(correo)){
                                System.out.println("ingresa la contraseña que creó");
                                contraseña_in = datos.nextLine();
                                while (!contraseña.equals(contraseña_in)){
                                    contador++;
                                    System.out.println("--INTENTA DE NUEVO--");
                                    contraseña_in=datos.nextLine();
                                }
                                System.out.println("--LA CONTRASEÑA ES CORRECTA--");
                                System.out.println("--LAS VESES QUE FALLO ES--:"+contador);
                                System.out.println("");
                                System.out.println("BIENVENIDO(●'◡'●)(●'◡'●)");
                                System.out.println("");
                            }else {
                                System.out.println("inteta de buevo:");
                                this.fDatosClientea();
                            }
                        }
                        else if (IniciarSesión.equalsIgnoreCase("NO")) {
                            this.fDatosClientea();
                        }else {
                            System.out.println("(intenta de nuevo)");
                            System.out.println("--inicio de nuevo--");
                            this.fDatosClientea();
                        }
                    } else {
                        System.out.println("la contraseña debe ser de 8 dígitos (intenta de nuevo)");
                        System.out.println("--inicio de nuevo--");
                        this.fDatosClientea();
                    }
                }
                else if (registrase.equalsIgnoreCase("NO")) {
                    System.out.println("GRACIAS");
                    this.fDatosClientea();
                } else {
                    System.out.println("la opción no existe, intenta de nuevo");
                    this.fDatosClientea();
                }


                break;
            case 2:
                System.out.println("⣶⡄⠀⣶⠀⢰⣶⣶⡆⠠⣶⣶⣶⡆⢰⣶⣶⣦⠀⣶⠀⠀⠀⣶⡆⠐⣶⠀⣰⡖\n" +
                        "⣿⣷⡀⣿⠀⣸⣇⣀⡀⠀⠀⣿⠀⠀⢸⣇⣀⡀⠀⣿⠀⠀⠀⣿⡇⠀⠹⣷⡿⠁\n" +
                        "⣿⡿⣷⣿⠀⣿⡟⠛⠁⠀⠀⣿⠀⠀⢸⡏⠉⠁⠀⣿⠀⠀⠀⣿⡇⠀⢠⣿⣇⠀\n" +
                        "⣿⡇⢻⣿⠀⣿⣷⣶⡆⠀⠀⠿⠀⠀⠸⠇⠀⠀⠀⣿⣶⣶⠀⣿⡇⢀⣿⠋⢿⡆\n" +
                        "⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉");
                System.out.println("--Iniciar Sesión--");
                System.out.println("Ingrese su correo electrónico:");
                correo_in= datos.nextLine();
                correodeinciarsecion[Iniciarsesión]=correo;
                System.out.println("Ingrese su contraseña:");
                contraseñasdeinciarsecion[Iniciarsesión]=contraseña;
                contraseña_in = datos.nextLine();
                System.out.println("");
                System.out.println("BIENVENIDO(●'◡'●)(●'◡'●)");
                System.out.println("");
                break;

            default:
                System.out.println("Opción inválida.");
                this.fDatosClientea();

        }
        if (opcion < 2) {
            double precio;
            do {
                precio = this.planesdenetflix();
                if (precio == -1) {
                    System.out.println("Volviendo al menú principal...");
                    return this.fDatosClientea();
                }
            } while (precio == -1);

            this.Pago();
            this.mperfiles();
            this.catalogoDePelicula();
        }
        else {
            System.out.println("intenta de nuevo:");
        }
        return opcion;
    }

    public double planesdenetflix() {
        Scanner plqn = new Scanner(System.in);
        String[] planes = {"Plan Básico", "Plan Estándar", "Plan Premium"};
        double[] precios = {24.90, 34.90, 44.90};
        double precioSeleccionado = 0;
        boolean seleccionFinal = false;

        while (!seleccionFinal) {
            System.out.println("⣶⡄⠀⣶⠀⢰⣶⣶⡆⠠⣶⣶⣶⡆⢰⣶⣶⣦⠀⣶⠀⠀⠀⣶⡆⠐⣶⠀⣰⡖\n" +
                    "⣿⣷⡀⣿⠀⣸⣇⣀⡀⠀⠀⣿⠀⠀⢸⣇⣀⡀⠀⣿⠀⠀⠀⣿⡇⠀⠹⣷⡿⠁\n" +
                    "⣿⡿⣷⣿⠀⣿⡟⠛⠁⠀⠀⣿⠀⠀⢸⡏⠉⠁⠀⣿⠀⠀⠀⣿⡇⠀⢠⣿⣇⠀\n" +
                    "⣿⡇⢻⣿⠀⣿⣷⣶⡆⠀⠀⠿⠀⠀⠸⠇⠀⠀⠀⣿⣶⣶⠀⣿⡇⢀⣿⠋⢿⡆\n" +
                    "⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉");
            System.out.println("¿Qué plan desea comprar?");
            for (int i = 0; i < planes.length; i++) {
                System.out.println((i + 1) + ". " + planes[i] + " es de " + precios[i]);
            }
            System.out.println("Seleccione una opción (1-3) o 0 para volver atrás:");
            int opcion = plqn.nextInt();
            plqn.nextLine();

            if (opcion >= 1 && opcion <= 3) {
                precioSeleccionado = precios[opcion - 1];
                System.out.println("Ha seleccionado el " + planes[opcion - 1] + ".");
                System.out.println("El total a pagar es: $" + precioSeleccionado);
                System.out.println("¿Desea confirmar esta selección? (SI/NO)");
                String confirmacion = plqn.nextLine();
                if (confirmacion.equalsIgnoreCase("Si")) {
                    seleccionFinal = true;
                }
            } else if (opcion == 0) {
                System.out.println("Volviendo al menú anterior...");
                return -1;
            } else {
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }

        return precioSeleccionado;
    }

    public String Pago() {
        Scanner xd = new Scanner(System.in);
        System.out.println("El metodo de pago es por tarjeta de debito o credito");
        System.out.println("A continuacion ingrese los datos solicitados para completar el pago de su membresia");
        String[] datosTarjeta = new String[6];
        String[] nombresCamposrequeridos = {"nombre del propietario", "apellido del propietario", "numero de DNI", "numero de la tarjeta", "fecha de caducidad (mm/yyyy)", "CVV"};

        for (int i = 0; i < datosTarjeta.length; i++) {
            System.out.println("Ingrese " + nombresCamposrequeridos[i]);

            if (i == 2) {
                do {
                    datosTarjeta[i] = xd.nextLine();
                    if (datosTarjeta[i].length() != 8) {
                        System.out.println("Por favor, ingrese un número de DNI válido de 8 dígitos.");
                    }
                } while (datosTarjeta[i].length() != 8);
            } else if (i == 3) {
                do {
                    datosTarjeta[i] = xd.nextLine();
                    if (datosTarjeta[i].length() != 16) {
                        System.out.println("Por favor, ingrese un número de tarjeta válido de 16 dígitos.");
                    }
                } while (datosTarjeta[i].length() != 16);
            } else if (i == 4) {
                do {
                    datosTarjeta[i] = xd.nextLine();
                    if (datosTarjeta[i].length() != 5) {
                        System.out.println("Por favor, ingrese un fecha de caducidad (MM/AA)");
                    }
                } while (datosTarjeta[i].length() != 5);
            } else if (i == 5) {
                do {
                    datosTarjeta[i] = xd.nextLine();
                    if (datosTarjeta[i].length() != 3) {
                        System.out.println("Por favor, ingrese un CVV válido de 3 dígitos.");
                    }
                } while (datosTarjeta[i].length() != 3);
            } else {
                datosTarjeta[i] = xd.nextLine();
            }
        }

        System.out.println("...procesando..");
        System.out.println("...procesando...");
        System.out.println("...procesando....");
        System.out.println("...procesando....");
        System.out.println("...procesando.....");
        System.out.println("...procesando..");
        System.out.println("Su pago fue procesado correctamente!");
        System.out.println("Ya puede disfrutar del amplio catalogo de Netflix");
        return null;
    }


    public void mperfiles() {
        Scanner gab = new Scanner(System.in);
        while (true) {
            System.out.println("⣶⡄⠀⣶⠀⢰⣶⣶⡆⠠⣶⣶⣶⡆⢰⣶⣶⣦⠀⣶⠀⠀⠀⣶⡆⠐⣶⠀⣰⡖");
            System.out.println("⣿⣷⡀⣿⠀⣸⣇⣀⡀⠀⠀⣿⠀⠀⢸⣇⣀⡀⠀⣿⠀⠀⠀⣿⡇⠀⠹⣷⡿⠁");
            System.out.println("⣿⡿⣷⣿⠀⣿⡟⠛⠁⠀⠀⣿⠀⠀⢸⡏⠉⠁⠀⣿⠀⠀⠀⣿⡇⠀⢠⣿⣇⠀");
            System.out.println("⣿⡇⢻⣿⠀⣿⣷⣶⡆⠀⠀⠿⠀⠀⠸⠇⠀⠀⠀⣿⣶⣶⠀⣿⡇⢀⣿⠋⢿⡆");
            System.out.println("⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉");
            System.out.println("-----ELIJA UNA OPCIÓN-----");
            System.out.println("1. Crear perfil");
            System.out.println("2. Seleccionar perfil");
            System.out.println("3. Cambiar contraseña de perfil");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = gab.nextInt();
            gab.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("-------Cree su perfil------");
                    System.out.println("Ingrese el nombre del perfil:");
                    String nombre = gab.nextLine();
                    nombresPerfiles[contadorPerfiles] = nombre;
                    System.out.print("¿Desea crear una contraseña? (SI / NO): ");
                    String opcionContraseña = gab.nextLine();
                    if (opcionContraseña.equalsIgnoreCase("SI")) {
                        System.out.println("Ingrese su contraseña:");
                        String pcontraseña = gab.nextLine();
                        contraseñasPerfiles[contadorPerfiles] = pcontraseña;
                    } else {
                        contraseñasPerfiles[contadorPerfiles] = "";
                    }

                    System.out.println("+-----------------------------------------------------------------------------+\\n\" +\n" +
                            "\"|                       Seleccione el tipo de cuenta:                         |\\n\" +\n" +
                            "\"|-----------------------------------------------------------------------------|\\n\" +\n" +
                            "\"| 1. PRINCIPAL                                                                 |\\n\" +\n" +
                            "\"|    Este es el perfil principal de la cuenta de Netflix, utilizado por el    |\\n\" +\n" +
                            "\"|    propietario principal o la persona que maneja la suscripción. Tiene      |\\n\" +\n" +
                            "\"|    acceso completo a todas las funciones de la cuenta, incluyendo la        |\\n\" +\n" +
                            "\"|    capacidad de crear y administrar perfiles adicionales, configurar        |\\n\" +\n" +
                            "\"|    preferencias de contenido, administrar el historial de visualización     |\\n\" +\n" +
                            "\"|    y establecer controles parentales.                                       |\\n\" +\n" +
                            "\"|-----------------------------------------------------------------------------|\\n\" +\n" +
                            "\"| 2. Normal                                                                   |\\n\" +\n" +
                            "\"|    Este es un perfil individual en la cuenta de Netflix, utilizado por uno  |\\n\" +\n" +
                            "\"|    de los usuarios registrados en la suscripción. Este perfil tiene acceso  |\\n\" +\n" +
                            "\"|    completo al catálogo de contenido de Netflix y puede ver, buscar y       |\\n\" +\n" +
                            "\"|    calificar películas y programas de televisión. Aunque no tiene acceso a  |\\n\" +\n" +
                            "\"|    las funciones de administración de la cuenta.                            |\\n\" +\n" +
                            "\"|-----------------------------------------------------------------------------|\\n\" +\n" +
                            "\"| 3. Infantil                                                                 |\\n\" +\n" +
                            "\"|    Este perfil está diseñado específicamente para niños y está configurado  |\\n\" +\n" +
                            "\"|    con contenido apropiado para su edad en Netflix. Este perfil tiene       |\\n\" +\n" +
                            "\"|    acceso a una amplia selección de películas y programas de televisión     |\\n\" +\n" +
                            "\"|    para niños, que incluyen dibujos animados, series animadas, películas    |\\n\" +\n" +
                            "\"|    familiares y programas educativos.                                       |\\n\" +\n" +
                            "\"|                                                                             |\\n\" +\n" +
                            "\"| Seleccione una opción:                                                      |\\n\" +\n" +
                            "\"+----------------------------------------------------------------------------+");
                    int tipoCuenta = gab.nextInt();
                    tiposCuentas[contadorPerfiles] = tipoCuenta;
                    contadorPerfiles++;
                    System.out.println("Perfil creado con éxito.");
                    break;
                case 2:
                    if (contadorPerfiles == 0) {
                        System.out.println("No hay perfiles creados. Cree un perfil primero.");
                        break;
                    }
                    System.out.println("⣶⡄⠀⣶⠀⢰⣶⣶⡆⠠⣶⣶⣶⡆⢰⣶⣶⣦⠀⣶⠀⠀⠀⣶⡆⠐⣶⠀⣰⡖");
                    System.out.println("⣿⣷⡀⣿⠀⣸⣇⣀⡀⠀⠀⣿⠀⠀⢸⣇⣀⡀⠀⣿⠀⠀⠀⣿⡇⠀⠹⣷⡿⠁");
                    System.out.println("⣿⡿⣷⣿⠀⣿⡟⠛⠁⠀⠀⣿⠀⠀⢸⡏⠉⠁⠀⣿⠀⠀⠀⣿⡇⠀⢠⣿⣇⠀");
                    System.out.println("⣿⡇⢻⣿⠀⣿⣷⣶⡆⠀⠀⠿⠀⠀⠸⠇⠀⠀⠀⣿⣶⣶⠀⣿⡇⢀⣿⠋⢿⡆");
                    System.out.println("⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉");
                    System.out.println("Iniciar Sesión");
                    System.out.println("Perfiles disponibles:");
                    for (int i = 0; i < contadorPerfiles; i++) {
                        System.out.println((i + 1) + ". " + nombresPerfiles[i]);
                    }
                    System.out.println("Seleccione el número de perfil:");
                    int numeroPerfil = gab.nextInt();
                    gab.nextLine();
                    if (numeroPerfil > 0 && numeroPerfil <= contadorPerfiles) {
                        System.out.println("Ingrese su contraseña:");
                        String contraseña_in = gab.nextLine();
                        if (contraseña_in.equals(contraseñasPerfiles[numeroPerfil - 1])) {
                            switch (tiposCuentas[numeroPerfil - 1]) {
                                case 1:
                                    System.out.println("Ha iniciado sesión en la cuenta principal.");
                                    break;
                                case 2:
                                    System.out.println("Ha iniciado sesión en la cuenta normal.");
                                    break;
                                case 3:
                                    System.out.println("Ha iniciado sesión en la cuenta infantil.");
                                    break;
                                default:
                                    System.out.println("Ha iniciado sesión en la cuenta sin tipo definido.");
                                    break;
                            }
                            return;
                        } else {
                            System.out.println("Nombre de perfil o contraseña incorrectos. Intente nuevamente.");
                        }
                    } else {
                        System.out.println("Número de perfil incorrecto.");
                    }
                    break;
                case 3:
                    if (contadorPerfiles == 0) {
                        System.out.println("No hay perfiles creados. Cree un perfil primero.");
                        return;
                    }
                    System.out.println("Cambiar contraseña de perfil:");
                    System.out.println("Perfiles disponibles:");
                    for (int i = 0; i < contadorPerfiles; i++) {
                        System.out.println((i + 1) + ". " + nombresPerfiles[i]);
                    }
                    System.out.print("Seleccione el número de perfil para cambiar la contraseña: ");
                    numeroPerfil = gab.nextInt();
                    gab.nextLine();

                    if (numeroPerfil > 0 && numeroPerfil <= contadorPerfiles) {
                        System.out.print("Ingrese la contraseña actual del perfil:");
                        String contraseñaActual = gab.nextLine();

                        if (contraseñaActual.equals(contraseñasPerfiles[numeroPerfil - 1])) {
                            System.out.print("Ingrese la nueva contraseña:");
                            String nuevaContraseña = gab.nextLine();
                            contraseñasPerfiles[numeroPerfil - 1] = nuevaContraseña;
                            System.out.println("Contraseña cambiada exitosamente para el perfil: " + nombresPerfiles[numeroPerfil - 1]);
                        } else {
                            System.out.println("La contraseña actual no coincide. Intenta nuevamente.");
                        }
                    } else {
                        System.out.println("Número de perfil incorrecto.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }




    public String catalogoDePelicula() {
        Scanner sc = new Scanner(System.in);
        System.out.println("⣶⡄⠀⣶⠀⢰⣶⣶⡆⠠⣶⣶⣶⡆⢰⣶⣶⣦⠀⣶⠀⠀⠀⣶⡆⠐⣶⠀⣰⡖\n" +
                "⣿⣷⡀⣿⠀⣸⣇⣀⡀⠀⠀⣿⠀⠀⢸⣇⣀⡀⠀⣿⠀⠀⠀⣿⡇⠀⠹⣷⡿⠁\n" +
                "⣿⡿⣷⣿⠀⣿⡟⠛⠁⠀⠀⣿⠀⠀⢸⡏⠉⠁⠀⣿⠀⠀⠀⣿⡇⠀⢠⣿⣇⠀\n" +
                "⣿⡇⢻⣿⠀⣿⣷⣶⡆⠀⠀⠿⠀⠀⠸⠇⠀⠀⠀⣿⣶⣶⠀⣿⡇⢀⣿⠋⢿⡆\n" +
                "⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉");
        System.out.println("-----¿Elija una categoria?-----");
        System.out.println("1. Anime");
        System.out.println("2. Terror");
        System.out.println("3. Comedia");
        System.out.println("4. Acción");
        System.out.println("5. Drama");
        System.out.println("6. Fantasía");
        System.out.println("7. Romance");
        System.out.println("8. Aventura");
        System.out.println("9. Suspense");
        System.out.println("10. Ciencia ficción");
        int opcionCategoria = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        switch (opcionCategoria) {
            case 1:
                System.out.println("⣶⡄⠀⣶⠀⢰⣶⣶⡆⠠⣶⣶⣶⡆⢰⣶⣶⣦⠀⣶⠀⠀⠀⣶⡆⠐⣶⠀⣰⡖\n" +
                        "⣿⣷⡀⣿⠀⣸⣇⣀⡀⠀⠀⣿⠀⠀⢸⣇⣀⡀⠀⣿⠀⠀⠀⣿⡇⠀⠹⣷⡿⠁\n" +
                        "⣿⡿⣷⣿⠀⣿⡟⠛⠁⠀⠀⣿⠀⠀⢸⡏⠉⠁⠀⣿⠀⠀⠀⣿⡇⠀⢠⣿⣇⠀\n" +
                        "⣿⡇⢻⣿⠀⣿⣷⣶⡆⠀⠀⠿⠀⠀⠸⠇⠀⠀⠀⣿⣶⣶⠀⣿⡇⢀⣿⠋⢿⡆\n" +
                        "⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉");
                System.out.println("Ha elegido una película de anime:");
                System.out.println("1 One Piece");
                System.out.println("2 Shingeki no Kyojin");
                System.out.println("3 Kimetsu no Yaiba");
                System.out.println("4 Death Note");
                System.out.println("5 Fullmetal Alchemist");
                System.out.println("6 My Hero Academia");
                System.out.println("7 Naruto");
                System.out.println("8 Sword Art Online");
                System.out.println("9 Cowboy Bebop");
                System.out.println("10 Neon Genesis Evangelion");
                int descripcion = sc.nextInt();
                sc.nextLine();
                switch (descripcion){
                    case 1:
                        System.out.println("One Piece");
                        System.out.println("año:1997");
                        System.out.println("director:Eiichiro Oda");
                        System.out.println("descripcion:Esta larga serie sigue las aventuras de Monkey D.    Luffy      y " +
                                "su tripulación pirata mientras buscan el legendario tesoro conocido como \"One Piece\" y " +
                                "navegan por mares peligrosos. ");
                        this.catalogoDePelicula();
                        break;

                    case 2:
                        System.out.println("Shingeki no Kyojin");
                        System.out.println("año:2009");
                        System.out.println("director:Hajime Isayama");
                        System.out.println("Shingeki no Kyojin presenta un mundo sombrío      donde    la  humanidad " +
                                "se enfrenta a la extinción debido a la aparición de gigantes humanoides  devoradores" +
                                " de humanos conocidos como \"Titanes\". La trama    sigue a Eren    Yeager,  Mikasa " +
                                "Ackerman y Armin Arlert, quienes, tras presenciar la devastación causada    por los " +
                                "Titanes en su infancia, se unen al Cuerpo de Exploración para luchar contra ellos y " +
                                "descubrir los secretos detrás de su origen.");
                        this.catalogoDePelicula();
                        break;
                    case 3:
                        System.out.println("Kimetsu no Yaiba");
                        System.out.println("año:2016");
                        System.out.println("director:Koyoharu Gotouge");
                        System.out.println("\"Kimetsu no Yaiba\" sigue a Tanjiro    Kamado, un       joven  que se " +
                                "convierte en un cazador de demonios después de que su      familia es brutalmente " +
                                "asesinada por un demonio, y su hermana Nezuko es convertida en        uno. Con la " +
                                "determinación de vengar a su familia y    encontrar una cura para Nezuko, Tanjiro " +
                                "se une a la organización de cazadores de demonios y se embarca en una emocionante " +
                                "búsqueda llena de acción y sacrificio.");
                        this.catalogoDePelicula();
                        break;
                    case 4:
                        System.out.println("Death Note");
                        System.out.println("año:2006");
                        System.out.println("director:Adam Wingard");
                        System.out.println("Un estudiante de secundaria encuentra un cuaderno que puede matar a cualquier " +
                                "persona cuyo nombre esté escrito en él, desencadenando una serie de eventos mientras  él " +
                                "y un detective genio se enfrentan en un juego mortal de ingenio.");
                        this.catalogoDePelicula();
                        break;
                    case 5:
                        System.out.println("Fullmetal Alchemist");
                        System.out.println("año:2009");
                        System.out.println("director:Anonimo");
                        System.out.println("Dos hermanos buscan la piedra filosofal para restaurar sus cuerpos después de " +
                                "un fallido experimento de alquimia. En el camino, descubren conspiraciones profundas que " +
                                "amenazan su mundo.");
                        this.catalogoDePelicula();
                        break;
                    case 6:
                        System.out.println("My Hero Academia");
                        System.out.println("año:2016");
                        System.out.println("director:Kenji Nagasaki");
                        System.out.println("En un mundo donde casi todos tienen superpoderes, un chico sin poderes " +
                                "hereda la habilidad del héroe más grande y se une a una academia para entrenar y " +
                                "convertirse en un héroe.");
                        this.catalogoDePelicula();
                        break;
                    case 7:
                        System.out.println("Naruto");
                        System.out.println("año:2002");
                        System.out.println("director:Masashi Kishimoto");
                        System.out.println("Naruto Uzumaki, un joven ninja con el sueño de ser reconocido como el " +
                                "mejor ninja de su aldea, lucha contra numerosos desafíos y enemigos mientras " +
                                "aprende el significado del verdadero heroísmo y amistad.");
                        this.catalogoDePelicula();
                        break;
                    case 8:
                        System.out.println("Sword Art Online");
                        System.out.println("año:2012");
                        System.out.println("director:Tomohiko Ito");
                        System.out.println("Jugadores atrapados en un juego de realidad virtual deben completar todos " +
                                "los niveles para salir vivos. La serie explora las complejas relaciones entre los " +
                                "jugadores y las implicaciones de la realidad virtual en la vida real.");
                        this.catalogoDePelicula();
                        break;
                    case 9:
                        System.out.println("Cowboy Bebop");
                        System.out.println("año:1998");
                        System.out.println("director:Shinichirō Watanabe");
                        System.out.println("En un futuro donde la humanidad coloniza el sistema solar, un grupo ecléctico " +
                                "de cazarrecompensas viaja a través del espacio en la nave Bebop, enfrentándose a su " +
                                "pasado y persiguiendo criminales peligrosos.");
                        this.catalogoDePelicula();
                        break;
                    case 10:
                        System.out.println("Neon Genesis Evangelion");
                        System.out.println("año:1995");
                        System.out.println("director:Hideaki Anno");
                        System.out.println("En un mundo post-apocalíptico donde enormes criaturas conocidas como Ángeles " +
                                "amenazan a la humanidad, adolescentes pilotean mechas gigantes para defender a la Tierra " +
                                "mientras lidian con sus propios traumas y emociones.");
                        this.catalogoDePelicula();
                        break;


                    default:
                        System.out.println("recuerda escoger uno");
                        this.catalogoDePelicula();
                }

                break;
            case 2:
                System.out.println("Ha elegido una película de terror:");
                System.out.println("1 El conjuro");
                System.out.println("2 Annabelle");
                System.out.println("3 La monja");
                System.out.println("4 Psycho");
                System.out.println("5 The Exorcist");
                System.out.println("6 Halloween");
                System.out.println("7 The Shining");
                System.out.println("8 A Nightmare on Elm Street");
                System.out.println("9 The Silence of the Lambs");
                System.out.println("10 Get Out");
                int descripcion1 = sc.nextInt();
                sc.nextLine();
                switch (descripcion1){
                    case 1:
                        System.out.println("El conjuro");
                        System.out.println("año:2013");
                        System.out.println("director: James Wan");
                        System.out.println("The Conjuring es un escalofriante thriller sobrenatural que " +
                                "sigue a la familia Perron mientras se mudan a una casa en Rhode Island " +
                                "en la década de 1970, solo para encontrarse acechados  por   entidades " +
                                "malévolas. Desesperados, llaman a los investigadores   paranormales Ed " +
                                "y Lorraine Warren para ayudarlos.");
                        this.catalogoDePelicula();
                        break;
                    case 2:
                        System.out.println("Annabelle");
                        System.out.println("año:2014");
                        System.out.println("director: John R. Leonetti");
                        System.out.println("Annabelle es un inquietante thriller de         terror que sigue la " +
                                "historia de una pareja joven, Mia y     John, quienes comienzan a experimentar " +
                                "fenómenos aterradores después de que John le regala a Mia una muñeca Annabelle " +
                                "para su colección. Pronto descubren que la muñeca está poseída por una entidad " +
                                "maligna que desata el caos en sus vidas y amenaza su seguridad. ");
                        this.catalogoDePelicula();
                        break;
                    case 3:
                        System.out.println("La monja");
                        System.out.println("año:2018");
                        System.out.println("director:Corin Hardy");
                        System.out.println("La Monja es un escalofriante thriller de terror que sigue la " +
                                "historia de un sacerdote y una   joven novicia enviados por el Vaticano " +
                                "para investigar un convento en Rumania, donde una monja      se suicidó " +
                                "misteriosamente. Pronto descubren que el       convento   está habitado " +
                                "por una presencia demoníaca malévola que se      manifiesta en forma de " +
                                "una monja siniestra.");
                        this.catalogoDePelicula();
                        break;
                    case 4:
                        System.out.println("Psycho");
                        System.out.println("año:1960");
                        System.out.println("director:Alfred Hitchcock");
                        System.out.println("Un clásico del terror psicológico que sigue la historia   de " +
                                "Norman Bates y su perturbadora relación con su madre en un motel aislado.");
                        this.catalogoDePelicula();
                        break;
                    case 5:
                        System.out.println("The Exorcist");
                        System.out.println("año:1973");
                        System.out.println("director:William Friedkin");
                        System.out.println("Basada en la novela de William Peter Blatty, esta película   es " +
                                "conocida por su intensidad y la historia de posesión demoníaca de una niña " +
                                "de 12 años.");
                        this.catalogoDePelicula();
                        break;
                    case 6:
                        System.out.println("Halloween");
                        System.out.println("año:1978");
                        System.out.println("director:John Carpenter");
                        System.out.println(" La película que inició la franquicia de Michael Myers, un asesino " +
                                "enmascarado que persigue a los residentes de Haddonfield en la noche de Halloween.");
                        this.catalogoDePelicula();
                        break;
                    case 7:
                        System.out.println("The Shining");
                        System.out.println("año:1980");
                        System.out.println("director:Stanley Kubrick");
                        System.out.println("Adaptación de la novela de Stephen King, esta película sigue la historia " +
                                "deun hombre que gradualmente se vuelve loco mientras trabaja como cuidador de un " +
                                "hotel aislado en invierno.");
                        this.catalogoDePelicula();
                        break;
                    case 8:
                        System.out.println("A Nightmare on Elm Street");
                        System.out.println("año:1984");
                        System.out.println("director:Wes Craven");
                        System.out.println("Introduce a Freddy Krueger, un asesino de niños que atormenta a " +
                                "adolescentes en sus sueños, causándoles la muerte en la vida real.");
                        this.catalogoDePelicula();
                        break;
                    case 9:
                        System.out.println("The Silence of the Lambs");
                        System.out.println("año:1991");
                        System.out.println("director:Jonathan Demme");
                        System.out.println("Aunque más un thriller psicológico, esta película es conocida por su " +
                                "atmósfera tensa y la relación entre la joven agente del FBI Clarice Starling y el " +
                                "brillante pero perturbador Hannibal Lecter.");
                        this.catalogoDePelicula();
                        break;
                    case 10:
                        System.out.println("Get Out");
                        System.out.println("año:2017");
                        System.out.println("director: Jordan Peele");
                        System.out.println("Una mezcla de horror y sátira social, la película sigue a un joven " +
                                "afroamericano que visita a la familia de su novia blanca, solo para descubrir un " +
                                "oscuro secreto.");
                        this.catalogoDePelicula();

                        break;
                    default:
                        System.out.println("recuerda escoger uno");
                        this.catalogoDePelicula();
                }

                break;
            case 3:
                System.out.println("Ha elegido una película de comedia:");
                System.out.println("1 La máscara");
                System.out.println("2 Asu Mare");
                System.out.println("3 Todo poderoso");
                System.out.println("4 Superbad");
                System.out.println("5 The Grand Budapest Hotel ");
                System.out.println("6 The Hangover");
                System.out.println("7 Anchorman: The Legend of Ron Burgundy");
                System.out.println("8 Bridesmaids");
                System.out.println("9 Hot Fuzz");
                System.out.println("10 Zombieland");
                int descripcion2 = sc.nextInt();
                sc.nextLine();
                switch (descripcion2){
                    case 1:
                        System.out.println("La máscara");
                        System.out.println("año:1994");
                        System.out.println("director:Chuck Russell");
                        System.out.println("La Máscara es una comedia de acción que sigue a  Stanley " +
                                "Ipkiss, un hombre tímido y desafortunado que encuentra una  máscara " +
                                "antigua que le otorga habilidades sobrenaturales y lo transforma en " +
                                "un personaje extrovertido y cómico.");
                        this.catalogoDePelicula();
                        break;
                    case 2:
                        System.out.println("Asu Mare");
                        System.out.println("año:2013");
                        System.out.println("director:Ricardo Maldonado");
                        System.out.println("Asu Mare es una comedia que sigue la vida de Cachín, un joven " +
                                "peruano que vive en San Isidro, Lima. La película relata sus  divertidas " +
                                "experiencias y desafíos mientras crece en un entorno familiar humilde. ");
                        this.catalogoDePelicula();
                        break;
                    case 3:
                        System.out.println("Todo poderoso");
                        System.out.println("año:2003");
                        System.out.println("director:Tom Shadyac");
                        System.out.println("Todo Poderoso es una comedia que sigue a Bruce Nolan,      un " +
                                "reportero de televisión frustrado que, después de un día particularmente " +
                                "malo, se queja con Dios por su vida. ");
                        this.catalogoDePelicula();
                        break;
                    case 4:
                        System.out.println("Superbad");
                        System.out.println("año:2007");
                        System.out.println("director:Greg Mottola");
                        System.out.println("Dos amigos adolescentes intentan conseguir alcohol para una fiesta, " +
                                "enfrentándose a situaciones cómicas y absurdas en el camino.");
                        this.catalogoDePelicula();
                        break;
                    case 5:
                        System.out.println("The Grand Budapest Hotel");
                        System.out.println("año:2014");
                        System.out.println("Wes Anderson");
                        System.out.println("Una comedia visualmente extravagante que sigue las desventuras de " +
                                "un conserje y su aprendiz en un famoso hotel europeo entre las guerras mundiales.\n");
                        this.catalogoDePelicula();
                        break;
                    case 6:
                        System.out.println("The Hangover");
                        System.out.println("año:2009");
                        System.out.println(" Todd Phillips");
                        System.out.println("Después de una descontrolada noche en Las Vegas, tres amigos despiertan " +
                                "sin recordar nada y con un montón de problemas por resolver antes de la boda de uno " +
                                "de ellos.");
                        this.catalogoDePelicula();
                        break;
                    case 7:
                        System.out.println("Anchorman: The Legend of Ron Burgundy ");
                        System.out.println("año:2004");
                        System.out.println("director: Adam McKay");
                        System.out.println("Una parodia sobre el mundo del periodismo televisivo en los años 70, " +
                                "protagonizada por un presentador machista y egocéntrico.");
                        this.catalogoDePelicula();
                        break;
                    case 8:
                        System.out.println("Anchorman: Bridesmaids");
                        System.out.println("año:2011");
                        System.out.println("director: Paul Feig");
                        System.out.println("Una dama de honor se enfrenta a desafíos cómicos mientras intenta organizar " +
                                "la boda de su mejor amiga, lidiando con un grupo de otras damas de honor muy diversas.");
                        this.catalogoDePelicula();
                        break;
                    case 9:
                        System.out.println("Superbad");
                        System.out.println("año:2007");
                        System.out.println("director:Greg Mottola");
                        System.out.println(" Dos amigos de la escuela secundaria intentan conseguir alcohol para una " +
                                "fiesta y enfrentan una serie de desventuras en el camino.");
                        this.catalogoDePelicula();
                        break;
                    case 10:
                        System.out.println("Hot Fuzz");
                        System.out.println("año:2007");
                        System.out.println("director:Edgar Wright");
                        System.out.println("Un policía metódico es transferido a un tranquilo pueblo inglés, pero " +
                                "descubre que las cosas no son tan pacíficas como parecen en esta comedia de acción.");
                        this.catalogoDePelicula();
                        break;
                    default:
                        System.out.println("recuerda escoger uno");
                        this.catalogoDePelicula();
                }

                break;
            case 4:
                System.out.println("Ha elegido una película de acción:");
                System.out.println("1 Inception");
                System.out.println("2 Jurassic Park");
                System.out.println("3 Gladiator");
                System.out.println("4 Mad Max: Fury Road");
                System.out.println("5 The Dark Knight");
                System.out.println("6 Die Hard");
                System.out.println("7 Inception");
                System.out.println("8 The Matrix");
                System.out.println("9 John Wick");
                System.out.println("10 The Bourne Identity");
                int descripcion3 = sc.nextInt();
                sc.nextLine();
                switch (descripcion3){
                    case 1:
                        System.out.println("incepcion");
                        System.out.println("año:2010");
                        System.out.println("director:Christopher Nolan");
                        System.out.println("Inception es un thriller de ciencia ficción que    sigue a " +
                                "Dom Cobb, un experto en el arte de extraer secretos del subconsciente " +
                                "de las personas a través de los sueños. ");
                        this.catalogoDePelicula();
                        break;
                    case 2:
                        System.out.println("Jurassic Park");
                        System.out.println("año:1993");
                        System.out.println("director:Steven Spielberg");
                        System.out.println("Jurassic Park cuenta la historia del Dr. John Hammond,    quien " +
                                "crea un parque temático de dinosaurios en una isla remota.     Invita a un " +
                                "grupo de personas a visitar el parque para evaluar su    viabilidad,  pero " +
                                "todo se complica cuando una serie de fallos técnicos y un sabotaje liberan " +
                                "a los peligrosos dinosaurios. ");
                        this.catalogoDePelicula();
                        break;
                    case 3:
                        System.out.println("Gladiator");
                        System.out.println("año:2000");
                        System.out.println("director:Ridley Scott ");
                        System.out.println(" Protagonizada por Russell Crowe, esta película   sigue " +
                                "a un general romano que es traicionado por el hijo del emperador y " +
                                "se convierte en un gladiador en busca de venganza.");
                        System.out.println("GRACIAS");
                        this.catalogoDePelicula();
                        break;
                    case 4:
                        System.out.println("Mad Max: Fury Road ");
                        System.out.println("año:2015");
                        System.out.println("director: George Miller");
                        System.out.println("En un mundo post-apocalíptico, Max se une a Furiosa para escapar de un " +
                                "tirano y su ejército en una épica persecución a través del desierto.");
                        this.catalogoDePelicula();
                        break;
                    case 5:
                        System.out.println("The Dark Knight");
                        System.out.println("año:2008");
                        System.out.println("director:Christopher Nolan");
                        System.out.println("Batman se enfrenta al Joker, un criminal psicótico que desata el caos en " +
                                "Gotham City, en esta oscura y emocionante película de superhéroes.");
                        this.catalogoDePelicula();
                        break;
                    case 6:
                        System.out.println("Die Hard");
                        System.out.println("año:1988");
                        System.out.println("director:John McTiernan");
                        System.out.println("Un policía de Nueva York se convierte en la única esperanza cuando un " +
                                "grupo de terroristas toma un rascacielos durante una fiesta navideña.");
                        this.catalogoDePelicula();
                        break;
                    case 7:
                        System.out.println("Inception");
                        System.out.println("año:2010");
                        System.out.println("director:Christopher Nolan");
                        System.out.println("Un ladrón de sueños debe realizar un último trabajo para redimirse, " +
                                "sumergiéndose en un mundo de realidades alteradas y peligrosas intrigas.");
                        this.catalogoDePelicula();
                        break;
                    case 8:
                        System.out.println("The Matrix");
                        System.out.println("año:1999");
                        System.out.println("director:Lana Wachowski, Lilly Wachowski");
                        System.out.println(" Un programador descubre la verdad sobre la realidad simulada en la que " +
                                "vive y se une a una rebelión para liberar a la humanidad.");
                        this.catalogoDePelicula();
                        break;
                    case 9:
                        System.out.println("John Wick");
                        System.out.println("año:2014");
                        System.out.println("director:Chad Stahelski");
                        System.out.println("Un ex asesino a sueldo se embarca en una sangrienta misión de venganza " +
                                "después de que le roban lo único que le queda tras la muerte de su esposa.");
                        this.catalogoDePelicula();
                        break;
                    case 10:
                        System.out.println("The Bourne Identity ");
                        System.out.println("año:2002");
                        System.out.println("director:Doug Liman");
                        System.out.println("Un amnésico descubre que es un agente entrenado de élite y debe luchar " +
                                "contra sus perseguidores mientras intenta desentrañar su pasado.");
                        this.catalogoDePelicula();
                        break;
                    default:
                        System.out.println("recuerda escoger uno");
                        this.catalogoDePelicula();
                }

                break;
            case 5:
                System.out.println("Ha elegido una película de Drama:");
                System.out.println("1 The Shawshank Redemption");
                System.out.println("2 Schindler's List ");
                System.out.println("3 Forrest Gump");
                System.out.println("4 The Godfather");
                System.out.println("5 Life is Beautiful (La vita è bella)");
                System.out.println("6 The Green Mile");
                System.out.println("7 A Beautiful Mind");
                System.out.println("8 Good Will Hunting");
                System.out.println("9 The Pianist");
                System.out.println("10 Dallas Buyers Club");

                int descripcion4 = sc.nextInt();
                sc.nextLine();
                switch (descripcion4){
                    case 1:
                        System.out.println("The Shawshank Redemption ");
                        System.out.println("año:1994");
                        System.out.println("director:Frank Darabont");
                        System.out.println("Un banquero es condenado injustamente por el asesinato de su esposa y " +
                                "pasa décadas en la prisión de Shawshank, donde desarrolla una amistad única con un " +
                                "compañero interno mientras planea su escape.");
                        this.catalogoDePelicula();
                        break;
                    case 2:
                        System.out.println("Schindler's List");
                        System.out.println("año:1993");
                        System.out.println("director:Steven Spielberg");
                        System.out.println("Basada en hechos reales, la película sigue a Oskar Schindler, un " +
                                "empresario alemán que salva a más de mil judíos durante el Holocausto al " +
                                "emplearlos en sus fábricas.");
                        this.catalogoDePelicula();
                        break;
                    case 3:
                        System.out.println("Forrest Gump");
                        System.out.println("año:1994");
                        System.out.println("director: Robert Zemeckis");
                        System.out.println("Forrest Gump, un hombre con una capacidad mental limitada pero " +
                                "un corazón puro, vive una vida extraordinaria, influyendo sin saberlo en " +
                                "varios eventos históricos clave del siglo XX en Estados Unidos.");
                        this.catalogoDePelicula();
                        break;
                    case 4:
                        System.out.println("The Godfather ");
                        System.out.println("año:1972");
                        System.out.println("director:Francis Ford Coppola");
                        System.out.println("Una saga épica sobre la familia criminal Corleone, centrada en " +
                                "el ascenso al poder de Don Vito Corleone y los conflictos que enfrenta con " +
                                "otras familias criminales.");
                        this.catalogoDePelicula();
                        break;
                    case 5:
                        System.out.println("Life is Beautiful (La vita è bella)");
                        System.out.println("año:1997");
                        System.out.println("director:Roberto Benigni");
                        System.out.println("En la Italia fascista, un padre judío utiliza su " +
                                "ingenio y humor para proteger a su hijo pequeño en un campo de concentración" +
                                " nazi, haciéndole creer que están participando en un juego.");
                        this.catalogoDePelicula();
                        break;
                    case 6:
                        System.out.println("The Green Mile ");
                        System.out.println("año:1999");
                        System.out.println("director:John McTiernan");
                        System.out.println("Basada en una novela de Stephen King, la película narra la historia " +
                                "de un guardia de prisiones que presencia eventos milagrosos y sobrenaturales " +
                                "con un preso condenado a muerte.");
                        this.catalogoDePelicula();
                        break;
                    case 7:
                        System.out.println("A Beautiful Mind");
                        System.out.println("año:2001");
                        System.out.println("director:Ron Howard");
                        System.out.println("Basada en la vida real de John Nash, un brillante matemático que " +
                                "lucha con la esquizofrenia mientras hace importantes descubrimientos en el " +
                                "campo de la teoría de juegos.");
                        this.catalogoDePelicula();
                        break;
                    case 8:
                        System.out.println("Good Will Hunting");
                        System.out.println("año:1997");
                        System.out.println("director:Gus Van Sant");
                        System.out.println("Un genio matemático autodidacta, pero problemático, " +
                                "encuentra la dirección en su vida con la ayuda de un terapeuta y " +
                                "una relación con una chica de Boston.");
                        this.catalogoDePelicula();
                        break;
                    case 9:
                        System.out.println("The Pianist");
                        System.out.println("año:2002");
                        System.out.println("director: Roman Polanski");
                        System.out.println("Basada en las memorias de Władysław Szpilman, un pianista " +
                                "judío polaco que sobrevive al Holocausto en Varsovia, ocultándose y " +
                                "enfrentando terribles adversidades.");
                        break;
                    case 10:
                        System.out.println("Dallas Buyers Club");
                        System.out.println("año:2013");
                        System.out.println("director: Jean-Marc Vallée");
                        System.out.println("Basada en hechos reales, la película sigue a Ron" +
                                " Woodroof, un electricista homofóbico diagnosticado con VIH/SIDA en " +
                                "los años 80, quien comienza a contrabandear medicamentos no aprobados " +
                                "para él y otros pacientes.");
                        this.catalogoDePelicula();
                        break;
                    default:
                        System.out.println("recuerda escoger uno");
                }

                break;
            case 6:
                System.out.println("Ha elegido una película de fantacia:");
                System.out.println("1 The Lord of the Rings: The Fellowship of the Ring");
                System.out.println("2 Pan's Labyrinth (El laberinto del fauno)");
                System.out.println("3 Harry Potter and the Philosopher's Stone");
                System.out.println("4 Spirited Away (Sen to Chihiro no Kamikakushi)");
                System.out.println("5 The Chronicles of Narnia: The Lion, the Witch and the Wardrobe ");
                System.out.println("6 The Wizard of Oz");
                System.out.println("7 Avatar");
                System.out.println("8 The Shape of Water");
                System.out.println("9 Pirates of the Caribbean: The Curse of the Black Pearl ");
                System.out.println("10 The Dark Crystal ");

                int descripcion5 = sc.nextInt();
                sc.nextLine();
                switch (descripcion5){
                    case 1:
                        System.out.println("The Lord of the Rings: The Fellowship of the Ring");
                        System.out.println("año:2001");
                        System.out.println("director:Peter Jackson");
                        System.out.println("Basada en la novela de J.R.R. Tolkien, la película sigue a Frodo " +
                                "Baggins y un grupo de compañeros mientras se embarcan en una peligrosa misión " +
                                "para destruir un poderoso anillo y salvar a la Tierra Media de la oscuridad.");
                        this.catalogoDePelicula();
                        break;
                    case 2:
                        System.out.println("Pan's Labyrinth (El laberinto del fauno)");
                        System.out.println("año:2006");
                        System.out.println("director:Guillermo del Toro");
                        System.out.println("En la posguerra de España, una niña descubre un laberinto mágico " +
                                "donde se encuentra con criaturas fantásticas que le revelan su verdadero destino.");
                        this.catalogoDePelicula();
                        break;
                    case 3:
                        System.out.println("Harry Potter and the Philosopher's Stone");
                        System.out.println("año:2001");
                        System.out.println("director:Chris Columbus");
                        System.out.println("La primera película de la serie basada en los libros de J.K. " +
                                "Rowling, sigue a un joven mago, Harry Potter, mientras descubre su herencia " +
                                "mágica y enfrenta al malvado Lord Voldemort.");
                        this.catalogoDePelicula();
                        break;
                    case 4:
                        System.out.println("Spirited Away (Sen to Chihiro no Kamikakushi) ");
                        System.out.println("año:2001");
                        System.out.println("director: Hayao Miyazaki");
                        System.out.println("Una niña llamada Chihiro se adentra en un mundo mágico habitado " +
                                "por dioses y espíritus, donde debe trabajar en un baño público para salvar a " +
                                "sus padres transformados en cerdos.");
                        this.catalogoDePelicula();
                        break;
                    case 5:
                        System.out.println("The Chronicles of Narnia: The Lion, the Witch and the Wardrobe ");
                        System.out.println("año:2005");
                        System.out.println("director:Andrew Adamson");
                        System.out.println("Basada en la novela de C.S. Lewis, la película cuenta la historia " +
                                "de cuatro hermanos que descubren un mundo mágico llamado Narnia, donde se unen " +
                                "al león Aslan para derrotar a la Bruja Blanca y restaurar la paz.");
                        this.catalogoDePelicula();
                        break;
                    case 6:
                        System.out.println("The Wizard of Oz");
                        System.out.println("año:1939");
                        System.out.println("director:Victor Fleming");
                        System.out.println("Una joven llamada Dorothy es llevada por un tornado a la tierra " +
                                "de Oz, donde busca al Mago de Oz para ayudarla a regresar a casa mientras" +
                                " hace nuevos amigos en el camino.");
                        this.catalogoDePelicula();
                        break;
                    case 7:
                        System.out.println("Avatar ");
                        System.out.println("año:2009");
                        System.out.println("director:James Cameron");
                        System.out.println("En el planeta Pandora, un ex marine se une a los Na'vi, la raza " +
                                "indígena, en una lucha contra los humanos que intentan explotar los recursos " +
                                "del planeta, explorando temas de ecología y conservación.");
                        this.catalogoDePelicula();
                        break;
                    case 8:
                        System.out.println("The Shape of Water");
                        System.out.println("año:2017");
                        System.out.println("director:Guillermo del Toro");
                        System.out.println("En la Guerra Fría, una limpiadora muda trabaja en un " +
                                "laboratorio gubernamental y desarrolla una relación especial con una " +
                                "criatura anfibia cautiva, enfrentándose a la hostilidad y la intolerancia.");
                        this.catalogoDePelicula();
                        break;
                    case 9:
                        System.out.println("Pirates of the Caribbean: The Curse of the Black Pearl");
                        System.out.println("año:2003");
                        System.out.println("director:Gore Verbinski");
                        System.out.println("El capitán Jack Sparrow se embarca en una aventura para recuperar su " +
                                "barco, enfrentándose a un pirata maldito y a una tripulación sedienta de sangre" +
                                " en esta saga de aventuras y fantasía.");
                        this.catalogoDePelicula();
                        break;
                    case 10:
                        System.out.println("The Dark Crystal");
                        System.out.println("año:1982");
                        System.out.println("director:Jim Henson, Frank Oz");
                        System.out.println("En un mundo fantástico habitado por criaturas místicas, un " +
                                "joven llamado Jen debe restaurar el cristal oscuro para salvar a su mundo " +
                                "del dominio del malvado Skeksis.");
                        this.catalogoDePelicula();

                        break;
                    default:
                        System.out.println("recuerda escoger uno");
                        this.catalogoDePelicula();
                }

                break;
            case 7:
                System.out.println("Ha elegido una película de Romance:");
                System.out.println("1 The Notebook");
                System.out.println("2 Titanic");
                System.out.println("3 La La Land");
                System.out.println("4 Before Sunrise");
                System.out.println("5 500 Days of Summer");
                System.out.println("6 Pride and Prejudice");
                System.out.println("7 Eternal Sunshine of the Spotless Mind");
                System.out.println("8 The Fault in Our Stars");
                System.out.println("9 Notting Hill");
                System.out.println("10 The Princess Bride");

                int descripcion6 = sc.nextInt();
                sc.nextLine();
                switch (descripcion6){
                    case 1:
                        System.out.println("The Notebook");
                        System.out.println("año:2004");
                        System.out.println("director:Nick Cassavetes");
                        System.out.println("Basada en la novela de Nicholas Sparks, la película cuenta la historia " +
                                "de amor entre Noah y Allie, que se enfrentan a obstáculos sociales y personales a " +
                                "lo largo de los años.");
                        this.catalogoDePelicula();
                        break;
                    case 2:
                        System.out.println("Titanic");
                        System.out.println("año:1997");
                        System.out.println("director: James Cameron");
                        System.out.println("Una joven aristócrata y un artista bohemio se enamoran a bordo del " +
                                "Titanic, enfrentándose al desastre del famoso naufragio que cambiará sus vidas " +
                                "para siempre.");
                        this.catalogoDePelicula();
                        break;
                    case 3:
                        System.out.println("La La Land");
                        System.out.println("año:2016");
                        System.out.println("director:Damien Chazelle");
                        System.out.println("En Los Ángeles, un pianista de jazz y una aspirante a actriz se enamoran " +
                                "mientras persiguen sus sueños en una ciudad conocida por destruir esperanzas y " +
                                "romances.");
                        this.catalogoDePelicula();
                        break;
                    case 4:
                        System.out.println("Before Sunrise");
                        System.out.println("año:1995");
                        System.out.println("Richard Linklater");
                        System.out.println("Dos extraños se encuentran en un tren europeo y deciden pasar " +
                                "una noche juntos en Viena, explorando la conexión humana y el romance efímero.");
                        this.catalogoDePelicula();
                        break;
                    case 5:
                        System.out.println("500 Days of Summer");
                        System.out.println("año:2009");
                        System.out.println("director:Marc Webb");
                        System.out.println("La película narra la relación de Tom y Summer, explorando " +
                                "las expectativas y realidades del amor moderno a través de una estructura " +
                                "no lineal.");
                        this.catalogoDePelicula();
                        break;
                    case 6:
                        System.out.println("Pride and Prejudice");
                        System.out.println("año:2005");
                        System.out.println("director:Joe Wright");
                        System.out.println("Basada en la novela de Jane Austen, la película sigue la " +
                                "complicada relación entre Elizabeth Bennet y Mr. Darcy en la Inglaterra " +
                                "del siglo XIX.");
                        this.catalogoDePelicula();
                        break;
                    case 7:
                        System.out.println("Eternal Sunshine of the Spotless Mind");
                        System.out.println("año:2004");
                        System.out.println("director:Michel Gondry");
                        System.out.println("Después de una ruptura dolorosa, Joel decide borrar todos " +
                                "los recuerdos de su ex novia Clementine, pero pronto descubre que " +
                                "algunos recuerdos y sentimientos son imposibles de borrar por completo.");
                        this.catalogoDePelicula();
                        break;
                    case 8:
                        System.out.println("The Fault in Our Stars");
                        System.out.println("año:2014");
                        System.out.println("director: Josh Boone");
                        System.out.println("Basada en la novela de John Green, la película sigue la" +
                                " historia de amor entre dos adolescentes con cáncer que se conocen en un " +
                                "grupo de apoyo y emprenden un viaje para encontrar respuestas sobre el " +
                                "amor y la vida.");
                        this.catalogoDePelicula();
                        break;
                    case 9:
                        System.out.println("Notting Hill ");
                        System.out.println("año:1999");
                        System.out.println("director:Roger Michell");
                        System.out.println("Un famoso actor se enamora de una librera común en el colorido" +
                                " barrio de Notting Hill en Londres, enfrentándose a las diferencias sociales " +
                                "y los desafíos de la fama.");
                        this.catalogoDePelicula();
                        break;
                    case 10:
                        System.out.println("The Princess Bride");
                        System.out.println("año:1987");
                        System.out.println("director:Rob Reiner");
                        System.out.println("Una mezcla de romance, comedia y aventura, la película cuenta " +
                                "la historia de amor entre Buttercup y Westley, ambientada en un mundo de " +
                                "princesas, piratas y duelos a muerte.");
                        this.catalogoDePelicula();
                        break;
                    default:
                        System.out.println("recuerda escoger uno");
                        this.catalogoDePelicula();
                }

                break;
            case 8:
                System.out.println("Ha elegido una película de Aventura:");
                System.out.println("1 Piratas del Caribe: La maldición de la Perla Negra");
                System.out.println("2 Indiana Jones: En busca del arca perdida");
                System.out.println("3 El Señor de los Anillos: La Comunidad del Anillo");
                System.out.println("4 Jurassic Park");
                System.out.println("5 Los Goonies");
                System.out.println("6 La vida secreta de Walter Mitty");
                System.out.println("7 La búsqueda");
                System.out.println("8 Up: Una aventura de altura");
                System.out.println("9 El libro de la selva");
                System.out.println("10 El hobbit: Un viaje inesperado ");

                int descripcion7 = sc.nextInt();
                sc.nextLine();
                switch (descripcion7){
                    case 1:
                        System.out.println("Piratas del Caribe: La maldición de la Perla Negra ");
                        System.out.println("año:2003");
                        System.out.println("director:Gore Verbinski");
                        System.out.println("Un capitán pirata extravagante, Jack Sparrow, se une a un joven " +
                                "herrero y a una gobernadora para salvar a su hija de una tripulación maldita" +
                                " y su capitán undead.");
                        this.catalogoDePelicula();
                        break;
                    case 2:
                        System.out.println("Indiana Jones: En busca del arca perdida");
                        System.out.println("año:1981");
                        System.out.println("director:Steven Spielberg");
                        System.out.println("El arqueólogo Indiana Jones se embarca en una aventura " +
                                "peligrosa para encontrar el Arca de la Alianza antes que los nazis.");
                        this.catalogoDePelicula();
                        break;
                    case 3:
                        System.out.println("El Señor de los Anillos: La Comunidad del Anillo");
                        System.out.println("año:2001");
                        System.out.println("director:Peter Jackson");
                        System.out.println(" Frodo Baggins y un grupo de compañeros emprenden un viaje para " +
                                "destruir un anillo mágico y evitar que caiga en manos del malvado Sauron.");
                        this.catalogoDePelicula();
                        break;
                    case 4:
                        System.out.println("Mad Max:Jurassic Park");
                        System.out.println("año:1993");
                        System.out.println("director: Steven Spielberg");
                        System.out.println("Un multimillonario crea un parque temático de dinosaurios " +
                                "reales, pero las cosas salen mal cuando los dinosaurios escapan y ponen " +
                                "en peligro a los visitantes.");
                        this.catalogoDePelicula();
                        break;
                    case 5:
                        System.out.println("Los Goonies");
                        System.out.println("año:1985");
                        System.out.println("director:Richard Donner");
                        System.out.println("Un grupo de jóvenes amigos descubre un mapa del tesoro " +
                                "y se embarca en una emocionante aventura para encontrar un tesoro " +
                                "escondido y salvar sus hogares.\n");
                        this.catalogoDePelicula();
                        break;
                    case 6:
                        System.out.println("La vida secreta de Walter Mitty ");
                        System.out.println("año:2013");
                        System.out.println("director:Ben Stiller");
                        System.out.println("Un empleado de una revista que vive en un mundo de" +
                                " fantasía se embarca en una búsqueda global para encontrar un " +
                                "fotógrafo y recuperar una imagen perdida.");
                        this.catalogoDePelicula();
                        break;
                    case 7:
                        System.out.println("La búsqueda");
                        System.out.println("año:2004");
                        System.out.println("director: Jon Turteltaub");
                        System.out.println("Un historiador busca un tesoro legendario con la ayuda " +
                                "de pistas dejadas por los Padres Fundadores de los Estados Unidos, " +
                                "enfrentándose a peligros y enigmas.");
                        this.catalogoDePelicula();
                        break;
                    case 8:
                        System.out.println("Up: Una aventura de altura");
                        System.out.println("año:2009");
                        System.out.println("director:Pete Docter, Bob Peterson");
                        System.out.println(" Un anciano y un joven explorador vuelan en una casa " +
                                "suspendida por globos hacia las cataratas de Venezuela, enfrentando " +
                                "desafíos y descubriendo la importancia del amor y la aventura.");
                        this.catalogoDePelicula();
                        break;
                    case 9:
                        System.out.println("El libro de la selva");
                        System.out.println("año:2016");
                        System.out.println("director:Jon Favreau");
                        System.out.println(" Un niño criado por lobos se embarca en un viaje por la " +
                                "selva con la ayuda de una pantera y un oso, mientras es perseguido por un" +
                                " tigre vengativo.");
                        this.catalogoDePelicula();
                        break;
                    case 10:
                        System.out.println("El hobbit: Un viaje inesperado");
                        System.out.println("año:2012");
                        System.out.println("director:Peter Jackson");
                        System.out.println("Bilbo Bolsón, un hobbit pacífico, se une a un grupo de " +
                                "enanos y al mago Gandalf en una búsqueda para recuperar el reino " +
                                "perdido de Erebor del dragón Smaug.");
                        this.catalogoDePelicula();
                        break;
                    default:
                        System.out.println("recuerda escoger uno");
                        this.catalogoDePelicula();
                }

                break;
            case 9:
                System.out.println("Ha elegido una película de suspence:");
                System.out.println("1 El silencio de los corderos");
                System.out.println("2 Psicosis");
                System.out.println("3 Seven");
                System.out.println("4 El sexto sentido");
                System.out.println("5 Prisioneros ");
                System.out.println("6 La ventana indiscreta");
                System.out.println("7 El club de la pelea");
                System.out.println("8 Memento");
                System.out.println("9 Cisne negro");
                System.out.println("10 El juego");

                int descripcion8 = sc.nextInt();
                sc.nextLine();
                switch (descripcion8){
                    case 1:
                        System.out.println("El silencio de los corderos");
                        System.out.println("año:1991");
                        System.out.println("director:Jonathan Demme");
                        System.out.println("Una agente del FBI busca la ayuda de un brillante pero peligroso " +
                                "psicópata encarcelado para atrapar a otro asesino en serie que está " +
                                "aterrorizando a mujeres.");
                        this.catalogoDePelicula();
                        break;
                    case 2:
                        System.out.println("Psicosis");
                        System.out.println("año:1960");
                        System.out.println("director:Alfred Hitchcock");
                        System.out.println("Una secretaria en fuga se encuentra en un motel aislado " +
                                "dirigido por un joven con problemas y su dominante madre, desencadenando " +
                                "eventos siniestros.");
                        this.catalogoDePelicula();
                        break;
                    case 3:
                        System.out.println("Seven");
                        System.out.println("año:1995");
                        System.out.println("director:David Fincher");
                        System.out.println("Dos detectives investigan una serie de asesinatos inspirados " +
                                "en los siete pecados capitales, mientras el asesino los desafía con su " +
                                "retorcida visión del castigo.");
                        this.catalogoDePelicula();
                        break;
                    case 4:
                        System.out.println("El sexto sentido");
                        System.out.println("año:1999");
                        System.out.println("director:M. Night Shyamalan");
                        System.out.println("Un psicólogo infantil intenta ayudar a un niño que dice ver " +
                                "personas muertas, desentrañando secretos sorprendentes mientras lidia " +
                                "con sus propios problemas.");
                        this.catalogoDePelicula();
                        break;
                    case 5:
                        System.out.println("Prisioneros");
                        System.out.println("año:2013");
                        System.out.println("director:Denis Villeneuve");
                        System.out.println("Después de la desaparición de sus hijas, un carpintero y un " +
                                "detective desesperado se adentran en un oscuro laberinto de secretos y " +
                                "venganza.");
                        this.catalogoDePelicula();
                        break;
                    case 6:
                        System.out.println("La ventana indiscreta ");
                        System.out.println("año:1954");
                        System.out.println("director: Alfred Hitchcock");
                        System.out.println("Un fotógrafo confinado a una silla de ruedas sospecha que uno " +
                                "de sus vecinos ha cometido un crimen, desencadenando una serie de eventos " +
                                "de suspense.");
                        this.catalogoDePelicula();
                        break;
                    case 7:
                        System.out.println("El club de la pelea");
                        System.out.println("año:1999");
                        System.out.println("director: David Fincher");
                        System.out.println("Un hombre insomne y un carismático vendedor de jabón " +
                                "forman un club de lucha clandestino que se convierte en algo mucho más siniestro.");
                        this.catalogoDePelicula();
                        break;
                    case 8:
                        System.out.println("Memento");
                        System.out.println("año:2000");
                        System.out.println("director:Christopher Nolan");
                        System.out.println("Un hombre con amnesia anterógrada utiliza fotos polares " +
                                "y tatuajes para rastrear al asesino de su esposa, enfrentándose a " +
                                "giros y traiciones inesperados.");
                        this.catalogoDePelicula();
                        break;
                    case 9:
                        System.out.println("Cisne negro ");
                        System.out.println("año:2010");
                        System.out.println("director:Darren Aronofsky");
                        System.out.println("Una bailarina obsesionada con el perfeccionismo se ve " +
                                "inmersa en un juego psicológico que la lleva al borde de la locura " +
                                "durante la preparación para un gran papel.");
                        this.catalogoDePelicula();
                        break;
                    case 10:
                        System.out.println("El juego");
                        System.out.println("año:1997");
                        System.out.println("director: David Fincher");
                        System.out.println("Un hombre recibe un regalo extraño que lo introduce en un " +
                                "juego enigmático y peligroso que parece controlar cada aspecto de su vida.");
                        this.catalogoDePelicula();
                        break;
                    default:
                        System.out.println("recuerda escoger uno");
                        this.catalogoDePelicula();
                }

                break;
            case 10:
                System.out.println("Ha elegido una película de ciencia ficcion:");
                System.out.println("1 Una Odisea del Espacio");
                System.out.println("2 Blade Runner");
                System.out.println("3 Matrix");
                System.out.println("4 Jurassic Park");
                System.out.println("5 Star Wars: Episodio IV - Una Nueva Esperanza");
                System.out.println("6 Alien, el octavo pasajero");
                System.out.println("7 Interestelar");
                System.out.println("8 Ex Machina");
                System.out.println("9 Terminator 2: El Juicio Final");
                System.out.println("10 Gravity");

                int descripcion9 = sc.nextInt();
                sc.nextLine();
                switch (descripcion9){
                    case 1:
                        System.out.println("Una Odisea del Espacio");
                        System.out.println("año:1968");
                        System.out.println("director:Stanley Kubrick");
                        System.out.println("Un astronauta y la inteligencia artificial HAL 9000 investigan un " +
                                "monolito alienígena que podría redefinir el origen y el destino de la humanidad.");
                        this.catalogoDePelicula();
                        break;
                    case 2:
                        System.out.println("Blade Runner");
                        System.out.println("año:1982");
                        System.out.println("director:Ridley Scott");
                        System.out.println("En un futuro distópico, un ex policía debe cazar replicantes, " +
                                "androides casi indistinguibles de los humanos, en los sórdidos callejones " +
                                "de Los Ángeles.");
                        this.catalogoDePelicula();
                        break;
                    case 3:
                        System.out.println("Matrix ");
                        System.out.println("año:1999");
                        System.out.println("director:Hermanos Wachowski (Lilly y Lana Wachowski)");
                        System.out.println("Un hacker descubre que la realidad en la que vive es una " +
                                "simulación controlada por máquinas inteligentes, y se une a la resistencia" +
                                " para liberar a la humanidad.");
                        this.catalogoDePelicula();
                        break;
                    case 4:
                        System.out.println("Jurassic Park");
                        System.out.println("año:1993");
                        System.out.println("director: Steven Spielberg");
                        System.out.println("Un excéntrico multimillonario crea un parque de atracciones" +
                                " con dinosaurios clonados, pero las cosas salen mal cuando los animales " +
                                "escapan y ponen en peligro a los visitantes.");
                        this.catalogoDePelicula();
                        break;
                    case 5:
                        System.out.println("Star Wars: Episodio IV - Una Nueva Esperanza ");
                        System.out.println("año:1977");
                        System.out.println("director: George Lucas");
                        System.out.println("En un universo de guerras galácticas, un granjero y un contrabandista " +
                                "se unen a la princesa Leia para luchar contra el malvado Imperio Galáctico y su " +
                                "temible Estrella de la Muerte.");
                        this.catalogoDePelicula();
                        break;
                    case 6:
                        System.out.println("Alien, el octavo pasajero");
                        System.out.println("año:1979");
                        System.out.println("director:Ridley Scott");
                        System.out.println("La tripulación de una nave espacial comercial descubre una " +
                                "forma de vida alienígena letal que los acecha en los confines del espacio, " +
                                "desatando terror y supervivencia.");
                        this.catalogoDePelicula();
                        break;
                    case 7:
                        System.out.println("Interestelar");
                        System.out.println("año:2014");
                        System.out.println("director:Christopher Nolan");
                        System.out.println("En un futuro donde la Tierra se enfrenta a una crisis ambiental, " +
                                "un grupo de exploradores emprende un viaje interestelar para encontrar un " +
                                "nuevo hogar para la humanidad.");
                        this.catalogoDePelicula();
                        break;
                    case 8:
                        System.out.println("The Matrix");
                        System.out.println("año:2014");
                        System.out.println("director:Alex Garland");
                        System.out.println("Un joven programador es seleccionado para participar en " +
                                "un experimento de inteligencia artificial con una robot humanoide de " +
                                "apariencia femenina, que desafía las percepciones de lo que " +
                                "significa ser consciente.");
                        this.catalogoDePelicula();
                        break;
                    case 9:
                        System.out.println("Terminator 2: El Juicio Final");
                        System.out.println("año:1991");
                        System.out.println("director:James Cameron");
                        System.out.println("Un ciborg del futuro es enviado al pasado para proteger a un " +
                                "niño destinado a salvar a la humanidad de un apocalipsis liderado por " +
                                "máquinas inteligentes, mientras otro ciborg intenta eliminarlo.");
                        break;
                    case 10:
                        System.out.println("Gravity");
                        System.out.println("año:2013");
                        System.out.println("director:Alfonso Cuarón");
                        System.out.println("Dos astronautas quedan varados en el espacio después de un " +
                                "accidente catastrófico, luchando por sobrevivir mientras intentan regresar " +
                                "a la Tierra.");
                        this.catalogoDePelicula();
                        break;

                    default:
                        System.out.println("recuerda escoger uno");
                        this.catalogoDePelicula();
                }

                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("----BIENVENIDO----");
        netflix NETFLIX= new netflix();
        NETFLIX.fDatosClientea();
    }
}
