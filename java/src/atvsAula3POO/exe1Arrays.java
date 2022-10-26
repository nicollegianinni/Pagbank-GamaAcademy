package atvsAula3POO;

import java.util.Scanner;

public class exe1Arrays {

	Scanner entrada = new Scanner(System.in);

	public static void listaNomes() {

		String[] valores = new String[3];

		String resultado ;
		valores[0] = "Recife ";
		valores[1] = "São Paulo ";
		valores[2] = "Porto Alegre ";
		
		resultado = valores [0] + valores [1] + valores [2];
		
		System.out.println("\nForam 3 cidades: \n");
		System.out.println(valores.length);
		System.out.println(resultado);
		//System.out.println(valores[1]);
		

		}
		

	

	

	// para trocar as informações só chamar o [] e inserir

	public static void main(String[] args) {

		listaNomes();

	}

}
