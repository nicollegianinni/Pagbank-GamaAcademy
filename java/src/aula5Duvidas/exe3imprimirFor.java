package aula5Duvidas;

//imprima na tela usando FOR de 0 a 10, usando metodos.

public class exe3imprimirFor {

		
		public void imprimaFor() {

			for (int numero = 0; numero <= 10; numero++) {

				System.out.println("\n " + numero);

			}

		}

		public static void main(String[] args) {

			exe3imprimirFor numeros = new exe3imprimirFor();
			numeros.imprimaFor();

		}
	
}