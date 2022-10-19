package atv3JavaAula;

import atv1JavaAula.salario;

public class Exe1For {

	// exercicio 1: tabuadas do 2 ate o 9.
	public static void escreveTabuada() {

		int x;
		int contador = 2;
		System.out.println("\n Tabuada do 2 (até o x 9): ");
		for (x = 0; x < 10; x++) {

			System.out.println(contador + " x " + x + " = " + (x * contador));

		}
		System.out.println("\n");

	}

	// exercicio 2 : todas as tabuadas ate 9.
	public static void imprimeTodasTabuadas() {

		int x = 1;
		int contadorTodas = 0;
		System.out.println("\n Todas Tabuadas:  ");
		while (contadorTodas < 9) {
			contadorTodas++;

			for (x = 0; x <= 10; x++) {

				System.out.println(contadorTodas + " x " + x + " = " + (x * contadorTodas));

			}
			System.out.println("\n");

		}
	}

	// classe main
	public static void main(String[] args) {

		escreveTabuada(); // (inclua o valor aqui para testar o metodo)
		imprimeTodasTabuadas();
	}

}
