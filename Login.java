import java.util.Scanner;

public class Login {
    private static final Scanner scanner = new Scanner(System.in);

    public static String obtenerCadena(String mensaje) {
        String CadenaTemporal;
        System.out.println(mensaje + ": ");
        CadenaTemporal = scanner.nextLine();
        return CadenaTemporal;
    }
    public static void main(String[] args) {
        String nombreUsuario = "Jeringas";
        String password = "1234";
        String usuarioIngresado = obtenerCadena("Escribe un usuario");
        String passwordIngresado = obtenerCadena("Ingresa el password");
        boolean resultadoNombre = nombreUsuario.equals(usuarioIngresado);
        boolean resultadoPassword = password.equals(passwordIngresado);
        //"equals es para comparar las cadenas, es decir lo equivalente a strmp en c"

        if (resultadoNombre && resultadoPassword) {
            System.out.println("Bienvenido al sistema");
        } else {
            System.out.println("Usuario o password ingresados incorrectos");
        }
        //NO DEBES DE DECLARAR VARIABLES DENTRO DE UN IF!!! PENDEJO ;)

        System.out.println("Usuario ingresado: " + usuarioIngresado);
    }
}
