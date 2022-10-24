package EstruturasControleAssincrono;

import java.util.Scanner;
/*
 * escreva um programa para ler as cordenadas (X,Y)
 * de quantidade indeterminada de pontos no SISTEMA CARTESIANO.
 * Para cada escreveer o quadrante a que ele pertence.
 * O algoritmo será encerrado quando pelo menos uma de duas coordenadas
 * for nula (neste situação escrever mensagem alguma).
 * 
 * exemplo: entrada: 2  e 2. Saida: Ele mostrará o quadrante que se encontra o resultado.
 * 
 * 1 quadrante: X e Y são positivos.
 * 2 quadrante: Y é positivo e X é negativo.
 * 3 quadrante:  X e Y são negativos.
 * 4 quadrante:  X é positivo e Y é negativo.
 * 
 * Para ser nulo : x != 0 && y != 0 , finalizara o programa.
 * 
 * */

public class exe2BeecrowdRepeticao1115Quadrante {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int x, y;

		do {

			x = entrada.nextInt();
			y = entrada.nextInt();

			if (x > 0 && y > 0) {
				System.out.println("quadrante 1");
				
			} else if (x < 0 && y > 0) {
				System.out.println("quadrante 2");
				
			} else if (x < 0 && y < 0) {
				System.out.println("quadrante 3");
				
			} else if (x > 0 && y < 0) {
				System.out.println("quadrante 4");
				
			}

		} while (x != 0 && y != 0);  /// se for algum valor 0 ele finalziara o programa.

	}

}
