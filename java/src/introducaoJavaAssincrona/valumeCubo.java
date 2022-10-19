package introducaoJavaAssincrona;

import java.util.Scanner;

public class valumeCubo {

	public static void main(String[] args) {

		// entrada
		Scanner entrada = new Scanner(System.in);

		double lado, resultado;

		System.out.println("\n qual valor do lado do cubo:  ");
		lado = entrada.nextDouble();


		// processamento
		resultado = lado * lado * lado;

		
		// saida
		System.out.println("\n A area do Cubo  é : \n " + resultado);

	}

}
