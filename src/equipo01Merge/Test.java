package equipo01Merge;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        Main main = new Main();
        if (main.esDivisiblePorTres(numero)) {
            System.out.println("El número " + numero + " es divisible por 3.");
        } else {
            System.out.println("El número " + numero + " no es divisible por 3.");
        }

        scanner.close();
    
	}
	

}
