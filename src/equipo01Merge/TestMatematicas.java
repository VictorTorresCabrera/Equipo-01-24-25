package equipo01Merge;
import java.util.Scanner;
public class TestMatematicas {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.print("Introduce un número para verificar si es par: ");
        int numero = scanner.nextInt();

        // Verificar si el número es par utilizando el método esPar
        if (Main.esPar(numero)) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " no es par.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}