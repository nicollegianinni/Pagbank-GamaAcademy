package atv2JavaAula;

public class listarImpar {

// exercicio 3 : Liste numero impares de 1 a 100.

	public static void listar() {

		int numero = 0;

		while (numero <= 100) {

			if (numero % 2 != 0) {

				System.out.println(numero);

			}

			numero++;
		}

	}

	public static void main(String[] args) {

		listar();

	}
}
