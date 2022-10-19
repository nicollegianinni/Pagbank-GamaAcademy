package EstruturasControleAssincrono;

import java.util.Scanner;

public class tabelaVerdadeOU {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		/*
		 * tabela verdade para o OU (||): só dará falso se todas proposições forem
		 * falsas; Se só uma for verdadeira, dará verdadeiro.
		 */

		// SE FOR NUMERO IMPAR, OU MENOR QUE 20, A SAIDA SERÁ "OK, RESULTADO VERDADEIRO
		// !".

		double numero;

		System.out.println("Digite um numero: ");
		numero = entrada.nextDouble();

		if (numero == 1 || numero == 2) {
			System.out.println("OK, RESULTADO VERDADEIRO !");

		} else {

			System.out.println("Não é verdadeiro!");
		}
		entrada.close();

	}

}
