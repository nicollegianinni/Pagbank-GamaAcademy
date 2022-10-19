package EstruturasControleAssincrono;

import java.util.Scanner;

public class tabelaVerdadeE {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		/*
		 * tabela verdade para o E (&&): só dará verdadeira se todas proposições forem
		 * verdadeiras; as demais serão falsas.
		 */

		// SE FOR NUMERO PAR E MAIOR QUE 20, A SAIDA SERÁ "OK É PAR !".

		double numero;

		System.out.println("Digite um numero: ");
		numero = entrada.nextDouble();

		if (numero % 2 == 0 && numero > 20) {   // se o resto do numero divido por 2 for igual a 0 digite OK.

			System.out.println("OK É PAR !");

		} else if (numero % 2 == 0 && numero < 20) {           // se o resto do numero divido por 2 for igual a 0 digite OK.

			System.out.println("é par, MAS NÃO É maior que 20!");

		} else if (numero % 2 != 0 && numero > 20) {               
			System.out.println("É MAIOR que 20, mas NÃO é par!");

		} else {

			System.out.println("Não é um numero par nem maior que 20.");
		}

		entrada.close();

	}

}
