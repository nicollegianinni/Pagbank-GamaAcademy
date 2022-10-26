package atvsAula3POO;

public class exe3Arrays {

	
	        /*[EM CONSTRUÇÃO, FAVOR NAO COPIAR !]*/
	
	// exercicio 3

	public static void encontrarMenor() {

		int[] numeros = new int[4];

		numeros[0] = 4;
		numeros[1] = 6;
		numeros[2] = 8;
		numeros[3] = 10;

		int menor = numeros[0];

		// percorrer array
		for (int x = 1; x < numeros.length; x++) {
			// verifica o menor
			if (numeros[x] < menor) {
				menor = numeros[x];

			}

		}
	}

	public static void main(String[] args) {

		encontrarMenor();
		
		
	}

}
