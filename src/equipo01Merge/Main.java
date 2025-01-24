package equipo01Merge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Elige una opción:");
        System.out.println("1. Verificar si un número es par.");
        System.out.println("2. Verificar si un número es divisible por 3.");
        System.out.println("3. Verificar si un número es divisible por 5.");
        System.out.println("4. Salir.");
        
      
        int opcion = scanner.nextInt();


        switch(opcion) {
            case 1:
                //verificarPar(scanner);
                break;
            case 2:
                //verificarDivisiblePorTres(scanner);
                break;
            case 3:
                //verificarDivisiblePorCinco(scanner);
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida. Por favor, elige una opción válida.");
                break;
        }
        
        scanner.close();
    }
	public static boolean esDivisiblePorTres(int numero) {
        return numero % 3 == 0;
    }

	public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

	public static boolean esDivisiblePorCinco(int numero) {
        return numero % 5 == 0;
    }
}


	