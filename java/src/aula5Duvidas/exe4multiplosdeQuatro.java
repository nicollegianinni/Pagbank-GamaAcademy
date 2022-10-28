package aula5Duvidas;

// Imprima na tela os numeros multiplos de 4 ate 100.

public class exe4multiplosdeQuatro {

	public static void imprimaMultiplos() { // deixei static para na main so chamar o metodo simples.

		int num = 0;

		while (num <= 100) {

			num += 1;

			if (num % 4 == 0) {

				System.out.println("\n " + num);

			}
		}

	}

	public static void main(String[] args) {

		imprimaMultiplos();

	}

}
