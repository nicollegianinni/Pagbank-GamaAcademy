package atv4AuladeDuvidas;

//crie um metodo que liste todos os arrays
// 3 formas de listar uma lista de cidades.
public class Exe1Arrays {

	// outro medoto de lista
	String[] listaCidades = { "SP", "MG", "PI" };

	// muito Rígido - nao pode mudar a lista
	public void listaCidades() {
		// tipo do
		String[] arrayCidades = new String[3];
		arrayCidades[0] = "SP";
		arrayCidades[0] = "PE";
		arrayCidades[0] = "RJ";

		// MODO 1 DE IMPRIMIR A LISTA
		for (int i = 0; i < arrayCidades.length; i++) {

			System.out.println(arrayCidades[i]);

		}
	}

	// esse é flexivel - pois pode add sem dar um tamanho
	public void ListarCidades(String[] cidades) {

		for (String C : cidades) {
			System.out.println(C);
		}
	}
	// MODO 2 DE IMPRIMIR A LISTA
	/*
	 * for (int x =0; x < cidades.length ; x ++) {
	 * 
	 * System.out.println(cidades[x]);
	 * 
	 * }
	  
	 * // MODO 3 DE IMPRIMIR A LISTA
	 * 
	 * int x =0; while (x < cidades.length) {
	 * 
	 * System.out.println(cidades[x]); x++; 
	 * } 
	 * }
	 */

	public static void main(String[] args) {

		String[] cidades = new String[3];
		cidades[0] = "SP";
		cidades[0] = "PE";
		cidades[0] = "RJ";

		Exe1Arrays metodo1 = new Exe1Arrays();

		// metodo1.ListarCidades(cidades);

		metodo1.ListarCidades(metodo1.listaCidades);

	}

}
