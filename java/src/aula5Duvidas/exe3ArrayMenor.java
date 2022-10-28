package aula5Duvidas;

public class exe3ArrayMenor {

	public Integer encontrarMenorValor(Integer[] lista) {


		int menor = lista[0];

		for (int i = 1; i < lista.length; i++) { // lista.legth tamanho da lista

			// outra maneira de achar o menor ou maior sem usar o IF
			 menor = Math.min(menor, lista[i]);

			if (menor < lista[i]) {
				menor = lista[i];
			}

		}
		return menor;

	}

	public static void main(String[] args) {

		Integer[] a = new Integer[] { 10, 150, -5, 9, 0, -10 }; // cria a lista de objetos

		exe3ArrayMenor metodo = new exe3ArrayMenor();
		Integer menorValor = metodo.encontrarMenorValor(a);

		System.out.println("menor valor é " + menorValor);
	}

}
