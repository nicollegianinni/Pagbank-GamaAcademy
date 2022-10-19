package EstruturasControleAssincrono;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// sintaxe de arrays

		// tipo 1 usando int
		int[] numeros = { 1, 2, 3, 4, 5, 6 };

		System.out.println("Array casa 4 : " + numeros[4]); // as casinhas começam no 0 = 1

		// tipo 2 usando Double
		double[] valores = new double[6];

		// preenchendo
		valores[0] = 6.0;
		valores[1] = 5.0;
		valores[2] = 4.0;
		valores[3] = 3.5;
		valores[4] = 2.0;
		valores[5] = 1.0;

		// para trocar as informações só chamar o [] e inserir
		// valores[1] = 5.5;

		System.out.println("O arrays 3 é igual ao : " + valores[1]);

		// para trocar as informações só chamar o [] e inserir

		// float
		float teste[] = new float[4];

		teste[0] = 1.5f;
		teste[1] = 1.6f;
		teste[2] = 1.7f;
		teste[3] = 1.8f;

		System.out.printf(" array float usase printf. a posição 3 é :" + teste[3]);

		entrada.close();
	}

}
