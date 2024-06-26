import java.util.Scanner;
public class netflix {
    private String pnombre,pcontraseña,pnombre_in,nombre,nombreUsuario;
    private int opcion;

    public int fDatosClientea() {
        Scanner datos = new Scanner(System.in);
        String apellidos,correo,correo_in,contraseña,contraseña_in;
        int contador=0;

        System.out.println("___                        " +
                "⣶⡄⠀⣶⠀⢰⣶⣶⡆⠠⣶⣶⣶⡆⢰⣶⣶⣦⠀⣶⠀⠀⠀⣶⡆⠐⣶⠀⣰⡖\n" +
                "⣿⣷⡀⣿⠀⣸⣇⣀⡀⠀⠀⣿⠀⠀⢸⣇⣀⡀⠀⣿⠀⠀⠀⣿⡇⠀⠹⣷⡿⠁\n" +
                "⣿⡿⣷⣿⠀⣿⡟⠛⠁⠀⠀⣿⠀⠀⢸⡏⠉⠁⠀⣿⠀⠀⠀⣿⡇⠀⢠⣿⣇⠀\n" +
                "⣿⡇⢻⣿⠀⣿⣷⣶⡆⠀⠀⠿⠀⠀⠸⠇⠀⠀⠀⣿⣶⣶⠀⣿⡇⢀⣿⠋⢿⡆\n" +
                "⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉");
        System.out.println("------NETFLIX--------");
        System.out.println("----ELIJA UNA OPCIÓN----");
        System.out.println("1. Registrarse");
        System.out.println("2. Iniciar sesión");
        System.out.print("Selecciona una opción: ");
        int opcion = datos.nextInt();
        datos.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("⣶⡄⠀⣶⠀⢰⣶⣶⡆⠠⣶⣶⣶⡆⢰⣶⣶⣦⠀⣶⠀⠀⠀⣶⡆⠐⣶⠀⣰⡖\n" +
                        "⣿⣷⡀⣿⠀⣸⣇⣀⡀⠀⠀⣿⠀⠀⢸⣇⣀⡀⠀⣿⠀⠀⠀⣿⡇⠀⠹⣷⡿⠁\n" +
                        "⣿⡿⣷⣿⠀⣿⡟⠛⠁⠀⠀⣿⠀⠀⢸⡏⠉⠁⠀⣿⠀⠀⠀⣿⡇⠀⢠⣿⣇⠀\n" +
                        "⣿⡇⢻⣿⠀⣿⣷⣶⡆⠀⠀⠿⠀⠀⠸⠇⠀⠀⠀⣿⣶⣶⠀⣿⡇⢀⣿⠋⢿⡆\n" +
                        "⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉");
                System.out.println("REGISTRARSE");
                System.out.println("INGRESE SU NOMBRE");
                nombre = datos.nextLine();
                System.out.println("INGRESE APELLIDOS");
                apellidos = datos.nextLine();
                System.out.println("--Ingrese su nombre de usuario--");
                nombreUsuario = datos.nextLine();
                System.out.println("Ingrese su correo electrónico:");
                correo = datos.nextLine();
                System.out.println("Ingrese su contraseña:");
                contraseña = datos.nextLine();
                System.out.println("⣶⡄⠀⣶⠀⢰⣶⣶⡆⠠⣶⣶⣶⡆⢰⣶⣶⣦⠀⣶⠀⠀⠀⣶⡆⠐⣶⠀⣰⡖\n" +
                        "⣿⣷⡀⣿⠀⣸⣇⣀⡀⠀⠀⣿⠀⠀⢸⣇⣀⡀⠀⣿⠀⠀⠀⣿⡇⠀⠹⣷⡿⠁\n" +
                        "⣿⡿⣷⣿⠀⣿⡟⠛⠁⠀⠀⣿⠀⠀⢸⡏⠉⠁⠀⣿⠀⠀⠀⣿⡇⠀⢠⣿⣇⠀\n" +
                        "⣿⡇⢻⣿⠀⣿⣷⣶⡆⠀⠀⠿⠀⠀⠸⠇⠀⠀⠀⣿⣶⣶⠀⣿⡇⢀⣿⠋⢿⡆\n" +
                        "⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉");
                System.out.println("--INICIAR SESIÓN--");
                System.out.println("Ingrese su correo electrónico:");
                correo_in= datos.nextLine();
                if (correo_in.equals(correo)){
                    System.out.println("Ingrese su contraseña:");
                    contraseña_in = datos.nextLine();
                    while (!contraseña.equals(contraseña_in)){
                        contador++;
                        System.out.println("intenta de nuevo");
                        contraseña_in=datos.nextLine();
                    }
                    System.out.println("--LA CONTRASEÑA ES CORRECTA--");
                    System.out.println("--LAS VESES QUE FALLO ES--:"+contador);
                    System.out.println("");
                    System.out.println("BIENVENIDO(●'◡'●)(●'◡'●)");
                    System.out.println("");

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
                System.out.println("Ingrese su contraseña:");
                contraseña_in = datos.nextLine();
                System.out.println("");
                System.out.println("BIENVENIDO(●'◡'●)(●'◡'●)");
                System.out.println("");
                break;
            default:
                System.out.println("Opción inválida.");

        }
        if (opcion < 3){
            this.planesdenetflix();
            this.Pago();
            this.mperfiles();
            this.iniciarSesion();
            this.catalogoDePelicula();
        }
        else {
            System.out.println("inteta de buevo:");
        }
        return opcion;
    }

    public double planesdenetflix(){
        Scanner plqn = new Scanner(System.in);
        System.out.println("⣶⡄⠀⣶⠀⢰⣶⣶⡆⠠⣶⣶⣶⡆⢰⣶⣶⣦⠀⣶⠀⠀⠀⣶⡆⠐⣶⠀⣰⡖\n" +
                "⣿⣷⡀⣿⠀⣸⣇⣀⡀⠀⠀⣿⠀⠀⢸⣇⣀⡀⠀⣿⠀⠀⠀⣿⡇⠀⠹⣷⡿⠁\n" +
                "⣿⡿⣷⣿⠀⣿⡟⠛⠁⠀⠀⣿⠀⠀⢸⡏⠉⠁⠀⣿⠀⠀⠀⣿⡇⠀⢠⣿⣇⠀\n" +
                "⣿⡇⢻⣿⠀⣿⣷⣶⡆⠀⠀⠿⠀⠀⠸⠇⠀⠀⠀⣿⣶⣶⠀⣿⡇⢀⣿⠋⢿⡆\n" +
                "⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉");
        System.out.println("¿Qué plan desea comprar?");
        System.out.println("1. Plan Básico");
        System.out.println("2. Plan Estándar");
        System.out.println("3. Plan Premium");
        int opcion = plqn.nextInt();
        plqn.nextLine();
        double precio;
        switch (opcion) {
            case 1:
                precio = 24.90;
                break;
            case 2:
                precio = 34.90;
                break;
            case 3:
                precio = 44.90;
                break;
            default:
                System.out.println("Opción no válida. Seleccionando Plan Básico por defecto.");
                precio = 24.90;
                break;
        }

        System.out.println("El total a pagar es: $" + precio);
        return precio;
    }

    public String Pago() {
        Scanner xd= new Scanner(System.in);
        System.out.println("El metodo de pago es por tarjeta de debito o credito");
        System.out.println("A continuacion ingrese los datos solicitados para completar el pago de su membresia");
        String[] datosTarjeta = new String[4];
        String[] nombresCamposrequeridos = {"número de tarjeta", "fecha de caducidad", "CVV", "nombre del titular"};
        for (int i=0; i<datosTarjeta.length; i++){
            System.out.println("Ingrese su "+ nombresCamposrequeridos[i]);
            if (i==0){
                do{
                    datosTarjeta[i]=xd.nextLine();
                    if(datosTarjeta[i].length() !=16){
                        System.out.println("Por favor, ingrese un número de tarjeta válido de 16 dígitos.");
                    }
                } while (datosTarjeta[i].length()!=16);
            }else{
                datosTarjeta[i]= xd.nextLine();
            }
        }
        System.out.println("...procesando...");
        System.out.println("...procesando...");
        System.out.println("Su pago fue procesado correctamente!");
        System.out.println("Ya puede disfrutar del amplio catalogo de Netflix");
        return null;
    }
    public String mperfiles() {
        Scanner gab = new Scanner(System.in);
        String contraseña = "";
        System.out.println("⣶⡄⠀⣶⠀⢰⣶⣶⡆⠠⣶⣶⣶⡆⢰⣶⣶⣦⠀⣶⠀⠀⠀⣶⡆⠐⣶⠀⣰⡖\n" +
                "⣿⣷⡀⣿⠀⣸⣇⣀⡀⠀⠀⣿⠀⠀⢸⣇⣀⡀⠀⣿⠀⠀⠀⣿⡇⠀⠹⣷⡿⠁\n" +
                "⣿⡿⣷⣿⠀⣿⡟⠛⠁⠀⠀⣿⠀⠀⢸⡏⠉⠁⠀⣿⠀⠀⠀⣿⡇⠀⢠⣿⣇⠀\n" +
                "⣿⡇⢻⣿⠀⣿⣷⣶⡆⠀⠀⠿⠀⠀⠸⠇⠀⠀⠀⣿⣶⣶⠀⣿⡇⢀⣿⠋⢿⡆\n" +
                "⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉");
        System.out.println("-----ELIJA UNA OPCIÓN-----");
        System.out.println("1. Crear perfil");
        System.out.println("2. Seleccionar perfil");
        System.out.print("Seleccione una opción: ");
        int opcion = gab.nextInt();
        gab.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("-------Cree su perfil------");
                System.out.println("Ingrese el nombre del perfil:");
                pnombre =gab.nextLine();
                System.out.print("¿Desea crear una contraseña? " +
                        "(SI):" +
                        "(NO) ");
                String opcionContraseña = gab.nextLine();
                if (opcionContraseña.equalsIgnoreCase("SI")) {
                    System.out.println("Ingrese su contraseña:");
                    pcontraseña = gab.nextLine();
                }
                System.out.println("⣶⡄⠀⣶⠀⢰⣶⣶⡆⠠⣶⣶⣶⡆⢰⣶⣶⣦⠀⣶⠀⠀⠀⣶⡆⠐⣶⠀⣰⡖\n" +
                        "⣿⣷⡀⣿⠀⣸⣇⣀⡀⠀⠀⣿⠀⠀⢸⣇⣀⡀⠀⣿⠀⠀⠀⣿⡇⠀⠹⣷⡿⠁\n" +
                        "⣿⡿⣷⣿⠀⣿⡟⠛⠁⠀⠀⣿⠀⠀⢸⡏⠉⠁⠀⣿⠀⠀⠀⣿⡇⠀⢠⣿⣇⠀\n" +
                        "⣿⡇⢻⣿⠀⣿⣷⣶⡆⠀⠀⠿⠀⠀⠸⠇⠀⠀⠀⣿⣶⣶⠀⣿⡇⢀⣿⠋⢿⡆\n" +
                        "⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉");
                System.out.println("+-----------------------------------------------------------------------------+\n" +
                        "|                       Seleccione el tipo de cuenta:                         |\n" +
                        "|-----------------------------------------------------------------------------|\n" +
                        "| 1. PRINCIPAL                                                                 |\n" +
                        "|    Este es el perfil principal de la cuenta de Netflix, utilizado por el    |\n" +
                        "|    propietario principal o la persona que maneja la suscripción. Tiene      |\n" +
                        "|    acceso completo a todas las funciones de la cuenta, incluyendo la        |\n" +
                        "|    capacidad de crear y administrar perfiles adicionales, configurar        |\n" +
                        "|    preferencias de contenido, administrar el historial de visualización     |\n" +
                        "|    y establecer controles parentales.                                       |\n" +
                        "|-----------------------------------------------------------------------------|\n" +
                        "| 2. Normal                                                                   |\n" +
                        "|    Este es un perfil individual en la cuenta de Netflix, utilizado por uno  |\n" +
                        "|    de los usuarios registrados en la suscripción. Este perfil tiene acceso  |\n" +
                        "|    completo al catálogo de contenido de Netflix y puede ver, buscar y       |\n" +
                        "|    calificar películas y programas de televisión. Aunque no tiene acceso a  |\n" +
                        "|    las funciones de administración de la cuenta.                            |\n" +
                        "|-----------------------------------------------------------------------------|\n" +
                        "| 3. Infantil                                                                 |\n" +
                        "|    Este perfil está diseñado específicamente para niños y está configurado  |\n" +
                        "|    con contenido apropiado para su edad en Netflix. Este perfil tiene       |\n" +
                        "|    acceso a una amplia selección de películas y programas de televisión     |\n" +
                        "|    para niños, que incluyen dibujos animados, series animadas, películas    |\n" +
                        "|    familiares y programas educativos.                                       |\n" +
                        "|                                                                             |\n" +
                        "| Seleccione una opción:                                                      |\n" +
                        "+-----------------------------------------------------------------------------+\n");
                System.out.print("Seleccione una opción: ");
                int tipoCuenta = gab.nextInt();
                switch (tipoCuenta) {
                    case 1:
                        System.out.println("Ha seleccionado la cuenta principal.");
                        break;
                    case 2:
                        System.out.println("Ha seleccionado la cuenta normal.");
                        break;
                    case 3:
                        System.out.println("Ha seleccionado la cuenta infantil.");
                        break;
                    default:
                        System.out.println("Opción inválida. Se asignará la cuenta normal por defecto.");
                        break;
                }
                System.out.println("Perfil creado con éxito.");
                iniciarSesion();
                break;
            case 2:
                System.out.println("⣶⡄⠀⣶⠀⢰⣶⣶⡆⠠⣶⣶⣶⡆⢰⣶⣶⣦⠀⣶⠀⠀⠀⣶⡆⠐⣶⠀⣰⡖\n" +
                        "⣿⣷⡀⣿⠀⣸⣇⣀⡀⠀⠀⣿⠀⠀⢸⣇⣀⡀⠀⣿⠀⠀⠀⣿⡇⠀⠹⣷⡿⠁\n" +
                        "⣿⡿⣷⣿⠀⣿⡟⠛⠁⠀⠀⣿⠀⠀⢸⡏⠉⠁⠀⣿⠀⠀⠀⣿⡇⠀⢠⣿⣇⠀\n" +
                        "⣿⡇⢻⣿⠀⣿⣷⣶⡆⠀⠀⠿⠀⠀⠸⠇⠀⠀⠀⣿⣶⣶⠀⣿⡇⢀⣿⠋⢿⡆\n" +
                        "⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉");
                System.out.println("Iniciar Sesión");
                System.out.println("Ingrese su nombre de perfil:");
                pnombre_in = gab.nextLine();
                System.out.println("Ingrese su contraseña:");
                String contraseña_in = gab.nextLine();
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
        return null;
    }

    public String iniciarSesion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("⣶⡄⠀⣶⠀⢰⣶⣶⡆⠠⣶⣶⣶⡆⢰⣶⣶⣦⠀⣶⠀⠀⠀⣶⡆⠐⣶⠀⣰⡖\\n\" +\n" +
                "                \"⣿⣷⡀⣿⠀⣸⣇⣀⡀⠀⠀⣿⠀⠀⢸⣇⣀⡀⠀⣿⠀⠀⠀⣿⡇⠀⠹⣷⡿⠁\\n\" +\n" +
                "                \"⣿⡿⣷⣿⠀⣿⡟⠛⠁⠀⠀⣿⠀⠀⢸⡏⠉⠁⠀⣿⠀⠀⠀⣿⡇⠀⢠⣿⣇⠀\\n\" +\n" +
                "                \"⣿⡇⢻⣿⠀⣿⣷⣶⡆⠀⠀⠿⠀⠀⠸⠇⠀⠀⠀⣿⣶⣶⠀⣿⡇⢀⣿⠋⢿⡆\\n\" +\n" +
                "                \"⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉");
        System.out.println("--- Iniciar Sesión ---");
        System.out.println("Ingrese su nombre de perfil:");
        String nombrePerfil = entrada.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contraseña = entrada.nextLine();
        return null;
    }


    public String catalogoDePelicula() {
        Scanner sc = new Scanner(System.in);
        System.out.println("⣶⡄⠀⣶⠀⢰⣶⣶⡆⠠⣶⣶⣶⡆⢰⣶⣶⣦⠀⣶⠀⠀⠀⣶⡆⠐⣶⠀⣰⡖\n" +
                "⣿⣷⡀⣿⠀⣸⣇⣀⡀⠀⠀⣿⠀⠀⢸⣇⣀⡀⠀⣿⠀⠀⠀⣿⡇⠀⠹⣷⡿⠁\n" +
                "⣿⡿⣷⣿⠀⣿⡟⠛⠁⠀⠀⣿⠀⠀⢸⡏⠉⠁⠀⣿⠀⠀⠀⣿⡇⠀⢠⣿⣇⠀\n" +
                "⣿⡇⢻⣿⠀⣿⣷⣶⡆⠀⠀⠿⠀⠀⠸⠇⠀⠀⠀⣿⣶⣶⠀⣿⡇⢀⣿⠋⢿⡆\n" +
                "⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉");
        System.out.println("-----Elija una opción-----");
        System.out.println("Categoría");
        System.out.println("1. Anime");
        System.out.println("2. Terror");
        System.out.println("3. Comedia");
        System.out.println("4. Acción");

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
                        break;
                    default:
                        System.out.println("recuerda escoger uno");
                }

                break;
            case 2:
                System.out.println("Ha elegido una película de terror:");
                System.out.println("1 El conjuro");
                System.out.println("2 Annabelle");
                System.out.println("3 La monja");
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
                        break;
                    default:
                        System.out.println("recuerda escoger uno");
                }

                break;
            case 3:
                System.out.println("Ha elegido una película de comedia:");
                System.out.println("- La máscara");
                System.out.println("- Asu Mare");
                System.out.println("- Todo poderoso");
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
                        break;
                    case 2:
                        System.out.println("Asu Mare");
                        System.out.println("año:2013");
                        System.out.println("director:Ricardo Maldonado");
                        System.out.println("Asu Mare es una comedia que sigue la vida de Cachín, un joven " +
                                "peruano que vive en San Isidro, Lima. La película relata sus  divertidas " +
                                "experiencias y desafíos mientras crece en un entorno familiar humilde. ");
                        break;
                    case 3:
                        System.out.println("Todo poderoso");
                        System.out.println("año:2003");
                        System.out.println("director:Tom Shadyac");
                        System.out.println("Todo Poderoso es una comedia que sigue a Bruce Nolan,      un " +
                                "reportero de televisión frustrado que, después de un día particularmente " +
                                "malo, se queja con Dios por su vida. ");
                        break;
                    default:
                        System.out.println("recuerda escoger uno");
                }

                break;
            case 4:
                System.out.println("Ha elegido una película de acción:");
                System.out.println("1 Inception");
                System.out.println("2 Jurassic Park");
                System.out.println("3 Gladiator");
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
                        break;
                    case 3:
                        System.out.println("Gladiator");
                        System.out.println("año:2000");
                        System.out.println("director:Ridley Scott ");
                        System.out.println(" Protagonizada por Russell Crowe, esta película   sigue " +
                                "a un general romano que es traicionado por el hijo del emperador y " +
                                "se convierte en un gladiador en busca de venganza.");
                        System.out.println("GRACIAS");
                        break;
                    default:
                        System.out.println("recuerda escoger uno");
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
