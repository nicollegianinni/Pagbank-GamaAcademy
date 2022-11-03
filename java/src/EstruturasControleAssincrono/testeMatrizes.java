package EstruturasControleAssincrono;

import java.util.Scanner;

public class testeMatrizes {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double matriz[][];
		matriz = new double[3][5];

		// para evitar escrever muito assim ...
		/*
		 * matriz [0][0] = matriz [0][1] = matriz [0][2] = matriz [0][3] = matriz [0][4]
		 * =
		 * 
		 * matriz [1][0] = matriz [1][1] = matriz [1][2] = matriz [1][3] = matriz [1][4]
		 * =
		 * 
		 * matriz [2][0] = matriz [2][1] = matriz [2][2] = matriz [2][3] = matriz [2][4]
		 * =
		 */

		// outra forma de escrever menor verboso
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				System.out.println("Digite o valor da matriz: [" + linha + "][" + coluna + "]= ");
				matriz[linha][coluna] = entrada.nextDouble();
			}
		}
		
		//para imprimir a matriz
		
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				System.out.printf("%10.2f " , matriz [linha][coluna]);
			}
			System.out.println();

		}
	}
}
