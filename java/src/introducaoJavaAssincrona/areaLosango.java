package introducaoJavaAssincrona;

import java.util.Scanner;

public class areaLosango {

	public static void main(String[] args) {

		//entrada
		Scanner entrada = new Scanner(System.in);
		
		double diagonal1 , diagonal2, resultado;
		
		System.out.println("\n qual valor da primeira diagonal do Losango ?");
		diagonal1 = entrada.nextDouble();
		System.out.println("\n qual valor da segunda diagonal do Losango ?");
		diagonal2 = entrada.nextDouble();

		// processamento
		resultado = (diagonal1 * diagonal2) ;
		
		// saida
		System.out.println("\n A area do Losango é : \n " + resultado );
		
		


	}

}
