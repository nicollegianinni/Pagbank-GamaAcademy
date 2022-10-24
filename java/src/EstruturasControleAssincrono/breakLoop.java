package EstruturasControleAssincrono;

import java.util.Scanner;

public class breakLoop {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int contador = 1;

		while (true) {

			if (contador == 5) {
				break;

			}

			System.out.println("contador = " + contador);
			contador++;

		}
		System.out.println(" FIM ");

	}

}
