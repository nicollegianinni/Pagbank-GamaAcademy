package EstruturasControleAssincrono;

import java.util.Scanner;

public class testeSelecao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		/*
		 * Leia os valores A, B, C e D; Se B for maior que C e se D for maior que A, e a
		 * soma de C com D for maior que a soma de A e B e se C e D, ambos forem
		 * positivos, e se a variavel A for PAR; escreva a mensagem valores aceitos, se
		 * não, escreva valores nao aceitos.
		 * 
		 * para testar se o seu esta correto : 
		 * Adicione os numero em sequencia: 
		 * 5,6,7,8 ==> dara valor nao aceito!
		 * 2,3,2,6 ==> dara valor aceito!
		 */

		// SE FOR NUMERO PAR E MAIOR QUE 20, A SAIDA SERÁ "OK É PAR !".

		int A, B, C, D, somaCD, somaAB;

		System.out.println("Digite o numero referente a A: ");
		A = entrada.nextInt();
		System.out.println("Digite o numero referente a B: ");
		B = entrada.nextInt();
		System.out.println("Digite o numero referente a C: ");
		C = entrada.nextInt();
		System.out.println("Digite o numero referente a D: ");
		D = entrada.nextInt();

		somaCD = C + D; // pode puxar na condicional do IF (nos parenteses)
		somaAB = A + B; // eu criei variaveis para fazer a soma antes

		// condição: 1 2 3
		if ((B > C) && (D > A) && somaCD > somaAB && (C > 0 && D > 0) && (A % 2 == 0)) {

			System.out.println("VALORES ACEITOS !");

		} else {

			System.out.println("VALOR NÃO ACEITO !");
		}

		entrada.close();

	}

}
