package EstruturasControleAssincrono;

import java.util.Scanner;

public class ContinueLoop {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		for (int contador = 1; contador <= 10; contador++) {
			if (contador == 5) { // ignorará o 5 

				continue;

			}
			
			System.out.println(" contador " + contador);

		}

	}

}
