package atv4AuladeDuvidas;

public class Exe2Arrays {

	public void somaValores(Integer[] array) {

		int total = 0;
		for (Integer valor : array) {

			total += valor; // total = total + valor
		}

		System.out.println(total);
	}

	public Integer somaValoresRetorno(Integer[] array) {

		int total = 0;
		for (Integer valor : array) {

			total += valor; // total = total + valor
		}
		return total;
	}

	public static void main(String[] args) {

		Integer[] array = new Integer[] { 4, 5, 0, 4, 1 };

		Exe2Arrays metodo2 = new Exe2Arrays();
		metodo2.somaValores(array);

		System.out.println(metodo2.somaValoresRetorno(array));

		int variavel = metodo2.somaValoresRetorno(array);
	}

}
