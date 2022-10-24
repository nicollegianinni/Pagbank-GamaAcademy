package EstruturasControleAssincrono;

import java.util.Scanner;

/* escreva um programa que leia um valor N (1<N<100). 
Este N é a quantidade de linhas de saida que serão 
apresentadas na execução do programa.
*/

public class exe1BeecrowdRepeticao1143QuadradoCubo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero: ");

		int N = entrada.nextInt();

		for (int num = 1; num <= N; num++) {

			System.out.println(num + " " + (num*num)+ " " + (num*num*num));

		}

		entrada.close();

	}

}
