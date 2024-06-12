import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class netflix {
    private String nombre,nombreUsuario;
    private int opcion;

    public int fDatosClientea() {
        Scanner datos = new Scanner(System.in);
        String apellidos,correo,correo_in,contraseña,contraseña_in;
        int contador=0;

        System.out.println("NETFLIX ");
        System.out.println("-----ELIJA UNA OPCIÓN-----");
        System.out.println("1. Registrarse");
        System.out.println("2. Iniciar sesión");
        System.out.print("Selecciona una opción: ");
        int opcion = datos.nextInt();
        datos.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("Registrarse");
                System.out.println("INGRESE SU NOMBRE");
                nombre = datos.nextLine();
                System.out.println("INGRESE APELLIDOS");
                apellidos = datos.nextLine();
                System.out.println("Ingrese su nombre de usuario:");
                nombreUsuario = datos.nextLine();
                System.out.println("Ingrese su correo electrónico:");
                correo = datos.nextLine();
                System.out.println("Ingrese su contraseña:");
                contraseña = datos.nextLine();

                System.out.println("Iniciar Sesión");
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
                    System.out.println("la contraseña es corecta");

                    System.out.println("las veses que fallo es:"+contador);
                }

                break;
            case 2:
                System.out.println("Iniciar Sesión");
                System.out.println("INGRESE SU NOMBRE");
                nombre = datos.nextLine();
                System.out.println("Ingrese su nombre de usuario:");
                nombreUsuario = datos.nextLine();
                System.out.println("Ingrese su correo electrónico:");
                correo_in= datos.nextLine();
                System.out.println("Ingrese su contraseña:");
                contraseña_in = datos.nextLine();
                break;
            default:
                System.out.println("Opción inválida.");

        }
        if (opcion < 3){
            this.fprueva();
        }
        else {
            System.out.println("inteta de buevo:");
        }
        return opcion;
    }

    public String manejarPerfiles() {
        Scanner gab = new Scanner(System.in);
        Map<Integer, String> perfiles = new HashMap<>();
        System Map,HashMap;
        int perfilID = 1;
        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Seleccionar perfil existente");
            System.out.println("2. Crear nuevo perfil");
            System.out.println("3. Eliminar perfil");
            System.out.println("4. Ver todos los perfiles");
            System.out.println("5. Salir");
            opcion = gab.nextInt();
            gab.nextLine();
            switch (opcion) {
                case 1:
                    if (perfiles.isEmpty()) {
                        System.out.println("No hay perfiles disponibles.");
                        break;
                    }
                    System.out.println("Seleccione el ID del perfil:");
                    for (Map.Entry<Integer, String> perfil : perfiles.entrySet()) {
                        System.out.println(perfil.getKey() + ". " + perfil.getValue());
                    }
                    int idSeleccionado=gab.nextInt();
                    gab.nextLine();
                    if (perfiles.containsKey(idSeleccionado)) {
                        System.out.println("Ha seleccionado el perfil: " + perfiles.get(idSeleccionado));
                    } else {
                        System.out.println("ID de perfil no válido.");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del nuevo perfil:");
                    String nombrePerfil=gab.nextLine();
                    System.out.println("Seleccione el tipo de perfil:");
                    System.out.println("1. Perfil Principal");
                    System.out.println("2. Perfil Normal");
                    System.out.println("3. Perfil Infantil");
                    int tipoPerfil=gab.nextInt();
                    gab.nextLine();
                    String tipoperfiltexto;
                    switch (tipoPerfil) {
                        case 1:
                            tipoperfiltexto = "Principal";
                            break;
                        case 2:
                            tipoperfiltexto = "Normal";
                            break;
                        case 3:
                            tipoperfiltexto = "Infantil";
                            break;
                        default:
                            tipoperfiltexto = "Normal";
                            System.out.println("Tipo de perfil no válido, se asignará 'Normal'.");
                    }
                    perfiles.put(perfilID, nombrePerfil + " (" + tipoperfiltexto + ")");
                    System.out.println("Perfil creado con ID: " + perfilID + " y tipo: " + tipoperfiltexto);
                    perfilID++;
                    break;
                case 3:
                    if (perfiles.isEmpty()) {
                        System.out.println("No hay perfiles para eliminar.");
                        break;
                    }
                    System.out.println("Ingrese el ID del perfil a eliminar:");
                    for (Map.Entry<Integer, String> perfil : perfiles.entrySet()) {
                        System.out.println(perfil.getKey() + ". " + perfil.getValue());
                    }
                    int idEliminar = gab.nextInt();
                    gab.nextLine();
                    if (perfiles.containsKey(idEliminar)) {
                        System.out.println("Perfil " + perfiles.get(idEliminar) + " eliminado.");
                        perfiles.remove(idEliminar);
                    } else {
                        System.out.println("ID de perfil no válido.");
                    }
                    break;
                case 4:
                    if (perfiles.isEmpty()) {
                        System.out.println("No hay perfiles disponibles.");
                    } else {
                        System.out.println("Perfiles disponibles:");
                        for (Map.Entry<Integer, String> perfil : perfiles.entrySet()) {
                            System.out.println(perfil.getKey() + ". " + perfil.getValue());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo de Netflix.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción correcta.");
                    break;
            }
        } while (opcion != 5);
        return null;
    }

    public String catalogoDePelicula() {
        Scanner categoria = new Scanner(System.in);
        String anime, terror, comedia, accion;
        System.out.println("-----Elija una opción-----");
        System.out.println("Categoria");

        System.out.println("1. Anime");
        System.out.println("2. Terror");
        System.out.println("3. Comedia");
        System.out.println("4. Acción");
        System.out.println("Por favor, elija una categoria (ingrese el número correspondiente): ");
        int opcionCategoria = categoria.nextInt();
        categoria.nextLine();
        switch (opcionCategoria) {
            case 1:
                System.out.println("elija una pelicula de accion:");
                System.out.println("- Inception");
                System.out.println("- Jurassic Park");
                System.out.println("- Indiana Jones: Raiders of the Lost Ark");
                break;
            case 2:
                System.out.println("Ha elegido una pelicula de anime:");
                System.out.println("- Sord Arta Online ");
                System.out.println("- Shingeki no Kiojin");
                System.out.println("- Kimetsu no yaiba");
                break;
            case 3:
                System.out.println("Ha elegido una pelicula de terror:");
                System.out.println("- el conjuro ");
                System.out.println("- anabelle");
                System.out.println("- la monja");
                break;
            case 4:
                System.out.println("Ha elegido una pelicula de comedia:");
                System.out.println("- la mascara");
                System.out.println("- asu mare ");
                System.out.println("- todo póderoso");

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
