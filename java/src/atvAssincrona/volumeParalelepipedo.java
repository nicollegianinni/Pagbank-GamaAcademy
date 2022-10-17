package atvAssincrona;

import java.util.Scanner;

public class volumeParalelepipedo {

	public static void main(String[] args) {

		// entrada
		Scanner entrada = new Scanner(System.in);

		double base, profundidade, altura, resultado;

		System.out.println("\n qual valor da base do paralelepipedo  ");
		base = entrada.nextDouble();

		System.out.println("\n qual valor da altura do paralelepipedo   ?");
		altura = entrada.nextDouble();

		System.out.println("\n qual valor da profundidade do paralelepipedo  ?");
		profundidade = entrada.nextDouble();

		
		
		// processamento
		resultado = base   * altura * profundidade;

		
		// saida
		System.out.println("\n A area do paralelepipedo  é : \n " + resultado);

	}

}
