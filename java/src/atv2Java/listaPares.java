package atv2Java;

public class listaPares {

	public static void listar () {

		int numero = 1 ;
		
		while (numero <= 100) {
			
			if (numero % 2 == 0) {

				System.out.println(numero);

				
			}
			
			numero ++;
		}

	}

	public static void main(String[] args) {

		listar();
		
	}

}
