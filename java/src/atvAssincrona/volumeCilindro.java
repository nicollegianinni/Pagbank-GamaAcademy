package atvAssincrona;

import java.util.Scanner;
import java.lang.Math;


public class volumeCilindro {

	public static void main(String[] args) {

		// entrada
		Scanner entrada = new Scanner(System.in);

		double raio, altura, resultado;
		double Pi = 3.14;
		
		System.out.println("\n qual valor do raio do cilindro ?");
		raio = entrada.nextDouble();

		System.out.println("\n qual valor da altura do cilindro ?");
		altura = entrada.nextDouble();

		

		// processamento
		resultado = Pi * raio * raio * altura;

		// saida
		System.out.printf("\n A area do cilindro é %10.2f :" , + resultado ); // para arredondar o valor em 2 casas decimais.
																			  // observe usou-se printf e virgula para separar a variavel
	}

}
