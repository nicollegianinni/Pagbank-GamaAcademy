package atvAssincrona;

import java.util.Scanner;

public class areaQuadrado {

	public static void main(String[] args) {
	
		//entrada
		Scanner entrada = new Scanner(System.in);
		
		double valor, resultado ;
		
		System.out.println("Qual valor do lado do quadrado?  ");
		valor = entrada.nextDouble();
		
		
		// processamento
		resultado = valor * valor;
	
				
		//saida
		System.out.println(" A area do quadrado é : \n " + resultado);
		
  }
}
