package EstruturasControleAssincrono;

import java.util.Scanner;

public class testeSwitch {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		/*
		 * tabela verdade para o OU (||): só dará falso se todas proposições forem
		 * falsas; Se só uma for verdadeira, dará verdadeiro.
		 */

		int numero;

		System.out.println("Digite um numero inteiro (ex.: 1, 2, 3 .. ");
		numero = entrada.nextInt();

		/*
		 * OBS: switch é equivalente a ter varios IF's, 
		 * para numeros inteiros, apenas um
		 * caraters e string.
		 */

		switch (numero) {
		case 1:
			System.out.println("digitou o valor A");
			break;
		case 2:
			System.out.println("digitou o valor B");
			break;
		case 3:
			System.out.println("digitou o valor C");
			break;
		default:
			System.out.println("você digitou um numero diferente de 1,2 e 3.");
			break;
		}

		entrada.close();

	}

}
