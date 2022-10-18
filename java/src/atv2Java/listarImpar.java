package atv2Java;

public class listarImpar {

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
