package introducaoJavaAssincrona;

import java.util.Scanner;

public class areaRetangulo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// entrada
		double base, altura, resultado;

		System.out.println("\n qual valor da base do retangulo ?");
		base = entrada.nextDouble();
		System.out.println("\n qual valor da altura do retangulo ?");
		altura = entrada.nextDouble();

		// processamento
		resultado = base * altura ;
		
		// saida
		System.out.println("\n A area do retangulo é : \n " + resultado );
		
	}
}
