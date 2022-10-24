package EstruturasControleAssincrono;

import java.util.Scanner;

public class testeDoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int numero = 1; // entrar coim um numero
		int contador = 1;

		contador = 100;

		do {
			System.out.println(numero + 2);
			contador += 1;

		} while (contador <= 10);


		entrada.close();

	}

}
